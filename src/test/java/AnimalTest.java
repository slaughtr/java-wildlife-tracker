import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AnimalTest {
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void animal_instantiatesCorrectly_true() {
    Animal testAnimal = new Animal("Deer", "Healthy", "Young");
    assertEquals(true, testAnimal instanceof Animal);
  }

  @Test
  public void getName_animalInstantiatesWithName_Deer() {
    Animal testAnimal = new Animal("Deer", "Healthy", "Young");
    assertEquals("Deer", testAnimal.getName());
  }

  @Test
  public void equals_returnsTrueIfNameIsTheSame_true() {
    Animal firstAnimal = new Animal("Deer", "Healthy", "Young");
    Animal anotherAnimal = new Animal("Deer", "Ill", "Adult");
    assertTrue(firstAnimal.equals(anotherAnimal));
  }

  @Test
  public void save_assignsIdToObjectAndSavesObjectToDatabase() {
    Animal testAnimal = new Animal("Deer", "Healthy", "Young");
    testAnimal.save();
    Animal savedAnimal = Animal.all().get(0);
    assertEquals(testAnimal.getId(), savedAnimal.getId());
  }

  @Test
  public void all_returnsAllInstancesOfAnimal_true() {
    Animal firstAnimal = new Animal("Deer", "Healthy", "Young");
    firstAnimal.save();
    Animal secondAnimal = new Animal("Black Bear", "Healthy", "Young");
    secondAnimal.save();
    assertEquals(true, Animal.all().get(0).equals(firstAnimal));
    assertEquals(true, Animal.all().get(1).equals(secondAnimal));
  }

  @Test
  public void find_returnsAnimalWithSameId_secondAnimal() {
    Animal firstAnimal = new Animal("Deer", "Healthy", "Young");
    firstAnimal.save();
    Animal secondAnimal = new Animal("Black Bear", "Healthy", "Young");
    secondAnimal.save();
    assertEquals(Animal.find(secondAnimal.getId()), secondAnimal);
  }

  @Test
  public void delete_deletesAnimalFromDatabase_0() {
    Animal testAnimal = new Animal("Deer", "Healthy", "Young");
    testAnimal.save();
    testAnimal.delete();
    assertEquals(0, Animal.all().size());
  }

  @Test
  public void update_updatesHealthAttribute_true() {
    Animal testAnimal = new Animal("Fox", "Healthy", "Young");
    testAnimal.save();
    testAnimal.updateHealth("ill");
    assertEquals("ill", Animal.find(testAnimal.getId()).getHealth());
  }

  @Test
  public void update_updatesAgeAttribute_true() {
    Animal testAnimal = new Animal("Fox", "Healthy", "Young");
    testAnimal.save();
    testAnimal.updateAge("Adult");
    assertEquals("Adult", Animal.find(testAnimal.getId()).getAge());
  }

  @Test
  public void update_updatesNameAttribute_true() {
    Animal testAnimal = new Animal("Fox", "Healthy", "Young");
    testAnimal.save();
    testAnimal.updateName("Raccoon");
    assertEquals("Raccoon", Animal.find(testAnimal.getId()).getName());
  }

  @Test
  public void find_returnsNullWhenNoAnimalFound_null() {
    assertTrue(Animal.find(999) == null);
  }

}
