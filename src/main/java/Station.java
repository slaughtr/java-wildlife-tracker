import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class Station {
  private int id;
  private String name;
  private String coordinates;
  private int location_id;

  public static final int MAX_RANGERS = 6;

  public Station(String name, int location_id) {
    this.name = name;
    this.location_id = location_id;
    this.coordinates = coordinates;
  }

  public String getName() {
    return this.name;
  }

  public String getCoordinates() {
    //figure out how to parse these correctly to pull up that google maps stuff!
    return this.coordinates;
  }


  public int getId() {
    return this.id;
  }

  public int getLocationId() {
    return this.location_id;
  }

  public void updateName(String name) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE stations SET name=:name WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("name", name)
      .executeUpdate();
    }
  }

  public static List<Location> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM stations;";
      return con.createQuery(sql)
      .executeAndFetch(Location.class);
    }
  }

  public static Location find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM stations WHERE id=:id;";
      Location animal = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Location.class);
      return animal;
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO stations (name, location_id) VALUES (:name, :location_id);";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .addParameter("location_id", this.location_id)
      .executeUpdate()
      .getKey();
    }
  }

  public void delete() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM stations WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .executeUpdate();
    }
  }


  @Override
  public boolean equals(Object otherLocation) {
    if(!(otherLocation instanceof Location)) {
      return false;
    } else {
      Location newLocation = (Location) otherLocation;
      return this.getName().equals(newLocation.getName());
    }
  }

}
