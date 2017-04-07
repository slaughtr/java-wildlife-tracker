import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class RangerTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void ranger_instantiatesCorrectly_true() {
    Ranger testRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    assertEquals(true, testRanger instanceof Ranger);
  }

  @Test
  public void getName_rangerInstantiatesWithName_true() {
    Ranger testRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    assertEquals("Ranger Smith", testRanger.getName());
  }

  @Test
  public void equals_returnsTrueIfNameIsTheSame_true() {
    Ranger firstRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    Ranger anotherRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    assertTrue(firstRanger.equals(anotherRanger));
  }

  @Test
  public void save_assignsIdToObjectAndSavesObjectToDatabase() {
    Ranger testRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    testRanger.save();
    Ranger savedRanger = Ranger.all().get(0);
    assertEquals(testRanger.getId(), savedRanger.getId());
  }

  @Test
  public void all_returnsAllInstancesOfRanger_true() {
    Ranger firstRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    firstRanger.save();
    Ranger secondRanger = new Ranger("Ford Ranger", "ford.ranger@parks.com", 1);
    secondRanger.save();
    assertEquals(true, Ranger.all().get(0).equals(firstRanger));
    assertEquals(true, Ranger.all().get(1).equals(secondRanger));
  }

  @Test
  public void find_returnsRangerWithSameId_secondRanger() {
    Ranger firstRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    firstRanger.save();
    Ranger secondRanger = new Ranger("Ford Ranger", "ford.ranger@parks.com", 1);
    secondRanger.save();
    assertEquals(Ranger.find(secondRanger.getId()), secondRanger);
  }

  @Test
  public void delete_deletesRangerFromDatabase_0() {
    Ranger testRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    testRanger.save();
    testRanger.delete();
    assertEquals(0, Ranger.all().size());
  }

  @Test
  public void update_updatesNameAttribute_true() {
    Ranger testRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", 1);
    testRanger.save();
    testRanger.updateName("Ford Ranger");
    assertEquals("Ford Ranger", Ranger.find(testRanger.getId()).getName());
  }

  @Test
  public void find_returnsNullWhenNoRangerFound_null() {
    assertTrue(Ranger.find(999) == null);
  }

  @Test
  public void ranger_instantiatesWithStation_true() {
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    testStation.save();
    Ranger testRanger = new Ranger("Ranger Smith", "ranger.smith@parks.com", testStation.getId());
    testRanger.save();
    assertEquals(testStation.getId(), testRanger.getStationId());
  }

}
