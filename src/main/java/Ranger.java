import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;

public class Ranger {
  private int id;
  private String name;
  private String email;
  private int station_id;


  public Ranger(String name, String email, int station_id) {
    this.name = name;
    this.email = email;
    this.station_id = station_id;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public int getId() {
    return this.id;
  }

  public int getStationId() {
    return this.station_id;
  }

  public void updateName(String name) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE rangers SET name=:name WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("name", name)
      .executeUpdate();
    }
  }

  public static List<Ranger> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM rangers;";
      return con.createQuery(sql)
      .executeAndFetch(Ranger.class);
    }
  }

  public static Ranger find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM rangers WHERE id=:id;";
      Ranger animal = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Ranger.class);
      return animal;
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO rangers (name, email, station_id) VALUES (:name, :email, :station_id);";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .executeUpdate()
      .getKey();
    }
  }

  public void delete() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM rangers WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .executeUpdate();
    }
  }


  @Override
  public boolean equals(Object otherRanger) {
    if(!(otherRanger instanceof Ranger)) {
      return false;
    } else {
      Ranger newRanger = (Ranger) otherRanger;
      return this.getName().equals(newRanger.getName());
    }
  }


}
