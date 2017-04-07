import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class Location {
  private int id;
  private String name;

  public Location(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }


  public int getId() {
    return this.id;
  }

  public void updateName(String name) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE locations SET name=:name WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("name", name)
      .executeUpdate();
    }
  }

  public static List<Location> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM locations;";
      return con.createQuery(sql)
      .executeAndFetch(Location.class);
    }
  }

  public static Location find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM locations WHERE id=:id;";
      Location location = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Location.class);
      return location;
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO locations (name) VALUES (:name);";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .executeUpdate()
      .getKey();
    }
  }

  public void delete() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM locations WHERE id=:id;";
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
