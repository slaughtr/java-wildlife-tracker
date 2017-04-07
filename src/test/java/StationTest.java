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

public class StationTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void station_instantiatesCorrectly_true() {
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    assertEquals(true, testStation instanceof Station);
  }

  @Test
  public void getName_stationInstantiatesWithName_true() {
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    assertEquals("Outpost 42", testStation.getName());
  }

  @Test
  public void equals_returnsTrueIfNameIsTheSame_true() {
    Station firstStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    Station anotherStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    assertTrue(firstStation.equals(anotherStation));
  }

  @Test
  public void save_assignsIdToObjectAndSavesObjectToDatabase() {
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    testStation.save();
    Station savedStation = Station.all().get(0);
    assertEquals(testStation.getId(), savedStation.getId());
  }

  @Test
  public void all_returnsAllInstancesOfStation_true() {
    Station firstStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    firstStation.save();
    Station secondStation = new Station("Treehouse Alpha", "41.20491,-124.01556", 2);
    secondStation.save();
    assertEquals(true, Station.all().get(0).equals(firstStation));
    assertEquals(true, Station.all().get(1).equals(secondStation));
  }

  @Test
  public void find_returnsStationWithSameId_secondStation() {
    Station firstStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    firstStation.save();
    Station secondStation = new Station("Treehouse Alpha", "41.20491,-124.01556", 2);
    secondStation.save();
    assertEquals(Station.find(secondStation.getId()), secondStation);
  }

  @Test
  public void delete_deletesStationFromDatabase_0() {
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    testStation.save();
    testStation.delete();
    assertEquals(0, Station.all().size());
  }

  @Test
  public void update_updatesNameAttribute_true() {
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", 1);
    testStation.save();
    testStation.updateName("Big Rock House");
    assertEquals("Big Rock House", Station.find(testStation.getId()).getName());
  }

  @Test
  public void find_returnsNullWhenNoStationFound_null() {
    assertTrue(Station.find(999) == null);
  }

  @Test
  public void station_instantiatesWithLocation_true() {
    Location testLocation = new Location("Outer space");
    testLocation.save();
    Station testStation = new Station("Outpost 42", "40.741895,-73.989308", testLocation.getId());
    testStation.save();
    assertEquals(testLocation.getId(), testStation.getLocationId());
  }
}
