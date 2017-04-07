import org.sql2o.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Sighting {
  private int animal_id;
  private int id;
  private Timestamp last_sighting;
  private int ranger_id;
  private int location_id;

  public Sighting(int animal_id, int ranger_id, int location_id) {
    this.animal_id = animal_id;
    this.id = id;
    this.ranger_id = ranger_id;
    this.location_id = location_id;
  }

  public int getId() {
    return this.id;
  }

  public int getAnimalId() {
    return this.animal_id;
  }

  public String getAnimalName() {
    return Animal.find(this.animal_id).getName();
  }

  public int getRangerId() {
      return this.ranger_id;
    }

    public int getLocationid() {
      return this.location_id;
    }

    public String getLocationName() {
      return Location.find(this.location_id).getName();
    }


  public String getLastSighting() {
    String lastSighting = last_sighting.toString();
      return lastSighting.substring(0, 16); //TODO: figure out how to make this lastSighting instead
    }


    public static List<Sighting> all() {
      try(Connection con = DB.sql2o.open()) {
        String sql = "SELECT * FROM sightings;";
        return con.createQuery(sql)
        .throwOnMappingFailure(false)
        .executeAndFetch(Sighting.class);
      }
    }

    //TODO: ADD UPDATE, DELETE

    public static Sighting find(int id) {
      try(Connection con = DB.sql2o.open()) {
        String sql = "SELECT * FROM sightings WHERE id=:id;";
        Sighting sighting = con.createQuery(sql)
        .addParameter("id", id)
        .executeAndFetchFirst(Sighting.class);
        return sighting;
      } catch (IndexOutOfBoundsException exception) {
        return null;
      }
    }

    public void save() {
      try(Connection con = DB.sql2o.open()) {
        String sql = "INSERT INTO sightings (animal_id, last_sighting, ranger_id, location_id) VALUES (:animal_id, now(), :ranger_id, :location_id);";
        this.id = (int) con.createQuery(sql, true)
        .addParameter("animal_id", this.animal_id)
        .addParameter("ranger_id", this.ranger_id)
        .addParameter("location_id", this.location_id)
        .throwOnMappingFailure(false)
        .executeUpdate()
        .getKey();
      }
    }

    @Override
    public boolean equals(Object otherSighting) {
      if(!(otherSighting instanceof Sighting)) {
        return false;
      } else {
        Sighting newSighting = (Sighting) otherSighting;
        return this.getAnimalId() == (newSighting.getAnimalId());
      }
    }

  }
