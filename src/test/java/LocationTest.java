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

public class LocationTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void location_instantiatesCorrectly_true() {
    Location testLocation = new Location("Yosemite Park");
    assertEquals(true, testLocation instanceof Location);
  }

  @Test
  public void getName_locationInstantiatesWithName_Deer() {
    Location testLocation = new Location("Yosemite Park");
    assertEquals("Yosemite Park", testLocation.getName());
  }

  @Test
  public void equals_returnsTrueIfNameIsTheSame_true() {
    Location firstLocation = new Location("Yosemite Park");
    Location anotherLocation = new Location("Yosemite Park");
    assertTrue(firstLocation.equals(anotherLocation));
  }

  @Test
  public void save_assignsIdToObjectAndSavesObjectToDatabase() {
    Location testLocation = new Location("Yosemite Park");
    testLocation.save();
    Location savedLocation = Location.all().get(0);
    assertEquals(testLocation.getId(), savedLocation.getId());
  }

  @Test
  public void all_returnsAllInstancesOfLocation_true() {
    Location firstLocation = new Location("Yosemite Park");
    firstLocation.save();
    Location secondLocation = new Location("Yellowstone Park");
    secondLocation.save();
    assertEquals(true, Location.all().get(0).equals(firstLocation));
    assertEquals(true, Location.all().get(1).equals(secondLocation));
  }

  @Test
  public void find_returnsLocationWithSameId_secondLocation() {
    Location firstLocation = new Location("Yosemite Park");
    firstLocation.save();
    Location secondLocation = new Location("Yellowstone Park");
    secondLocation.save();
    assertEquals(Location.find(secondLocation.getId()), secondLocation);
  }

  @Test
  public void delete_deletesLocationFromDatabase_0() {
    Location testLocation = new Location("Yosemite Park");
    testLocation.save();
    testLocation.delete();
    assertEquals(0, Location.all().size());
  }

  @Test
  public void update_updatesNameAttribute_true() {
    Location testLocation = new Location("Yosemite Park");
    testLocation.save();
    testLocation.updateName("Yellowstone Park");
    assertEquals("Yellowstone Park", Location.find(testLocation.getId()).getName());
  }

  @Test
  public void find_returnsNullWhenNoLocationFound_null() {
    assertTrue(Location.find(999) == null);
  }
}
