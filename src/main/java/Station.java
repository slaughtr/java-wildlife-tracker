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

  public Station(String name, String coordinates, int location_id) {
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

  public String getLocationName() {
    return Location.find(this.location_id).getName();
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

  public List<Ranger> getStationRangers() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM rangers WHERE station_id = :id";
      List<Ranger> rangers = con.createQuery(sql)
      .addParameter("id", this.id)
      .executeAndFetch(Ranger.class);
      return rangers;
    }
  }

  public static List<Station> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM stations;";
      return con.createQuery(sql)
      .executeAndFetch(Station.class);
    }
  }

  public static Station find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM stations WHERE id=:id;";
      Station station = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Station.class);
      return station;
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
  public boolean equals(Object otherStation) {
    if(!(otherStation instanceof Station)) {
      return false;
    } else {
      Station newStation = (Station) otherStation;
      return this.getName().equals(newStation.getName());
    }
  }

}
