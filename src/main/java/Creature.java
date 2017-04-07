import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Creature {
  public String name;
  public int id;
  public boolean endangered;
  public String health;
  public String age;


  public void updateHealth(String health) {
    if (endangered = true) {
      try(Connection con = DB.sql2o.open()) {
        String sql = "UPDATE endangered_animals SET health=:health WHERE id=:id;";
        con.createQuery(sql)
        .addParameter("id", id)
        .addParameter("health", health)
        .executeUpdate();
      }
    }
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE animals SET health=:health WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("health", health)
      .executeUpdate();
    }

  }

  public String getHealth() {
    return health;
  }

  public String getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }


}
