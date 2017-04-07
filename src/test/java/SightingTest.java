import org.junit.*;
import org.sql2o.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SightingTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void sighting_instantiatesCorrectly_true() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting(testAnimal.getId(), 1, 1);
    assertEquals(true, testSighting instanceof Sighting);
  }

  @Test
  public void equals_returnsTrueIfLocationAndDescriptionAreSame_true() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting(testAnimal.getId(), 1, 1);
    Sighting anotherSighting = new Sighting(testAnimal.getId(), 1, 1);
    assertTrue(testSighting.equals(anotherSighting));
  }

  @Test
  public void save_insertsObjectIntoDatabase_Sighting() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting (testAnimal.getId(), 1, 1);
    testSighting.save();
    assertEquals(true, Sighting.all().get(0).equals(testSighting));
  }

  @Test
  public void all_returnsAllInstancesOfSighting_true() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting (testAnimal.getId(), 1, 1);
    testSighting.save();
    Animal secondTestAnimal = new Animal("Badger", "ill", "young");
    secondTestAnimal.save();
    Sighting secondTestSighting = new Sighting (testAnimal.getId(), 1, 1);
    secondTestSighting.save();
    assertEquals(true, Sighting.all().get(0).equals(testSighting));
    assertEquals(true, Sighting.all().get(1).equals(secondTestSighting));
  }

  @Test
  public void find_returnsSightingWithSameId_secondSighting() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting (testAnimal.getId(), 1, 1);
    testSighting.save();
    Animal secondTestAnimal = new Animal("Badger", "ill", "young");
    secondTestAnimal.save();
    Sighting secondTestSighting = new Sighting (testAnimal.getId(), 1, 1);
    secondTestSighting.save();
    assertEquals(Sighting.find(secondTestSighting.getId()), secondTestSighting);
  }

  @Test
  public void find_returnsNullWhenNoAnimalFound_null() {
    assertTrue(Animal.find(999) == null);
  }

  @Test
  public void save_savesLastSightingTimeStampCorrectly_true() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting(testAnimal.getId(), 1, 1);
    testSighting.save();
    String testSightingLastSighting = Sighting.find(testSighting.getId()).getLastSighting();
    System.out.println(testSightingLastSighting);
    String rightNow = new Timestamp(new Date().getTime()).toString().substring(0, 16);
    assertEquals(testSightingLastSighting, rightNow);
  }

  @Test
  public void getAnimalName_returnsProperAnimalName_true() {
    Animal testAnimal = new Animal("Deer", "healthy", "young");
    testAnimal.save();
    Sighting testSighting = new Sighting(testAnimal.getId(), 1, 1);
    testSighting.save();
    assertEquals("Deer", Animal.find(testSighting.getAnimalId()).getName());
  }

  // @Test
  // public void sighting_instantiatesWithRangerId_true

}
