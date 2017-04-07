import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;

public class EndangeredAnimal extends Creature {

  public EndangeredAnimal(String name, String health, String age) {
    this.name = name;
    this.id = id;
    this.health = health;
    this.age = age;
    this.endangered = true;
    this.image_url = "https://i.imgur.com/rwXStQ0.jpg";
  }

  public void updateName(String name) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE endangered_animals SET name=:name WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("name", name)
      .executeUpdate();
    }
  }

  public void updateImageUrl(String imageUrl) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE endangered_animals SET image_url=:image_url WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("image_url", imageUrl)
      .executeUpdate();
    }
  }

  public void updateAge(String age) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE endangered_animals SET age=:age WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("age", age)
      .addParameter("id", id)
      .executeUpdate();
    }
  }

  public void updateHealth(String health) {
      try(Connection con = DB.sql2o.open()) {
        String sql = "UPDATE endangered_animals SET health=:health WHERE id=:id;";
        con.createQuery(sql)
        .addParameter("id", id)
        .addParameter("health", health)
          .executeUpdate();
      }
    }

  public List<Sighting> getSightings() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM sightings WHERE animal_id=:id;";
      List<Sighting> sightings = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetch(Sighting.class);
      return sightings;
    }
  }

  public static List<EndangeredAnimal> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM endangered_animals;";
      return con.createQuery(sql)
      .executeAndFetch(EndangeredAnimal.class);
    }
  }

  public static EndangeredAnimal find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM endangered_animals WHERE id=:id;";
      EndangeredAnimal endangeredanimal = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(EndangeredAnimal.class);
      return endangeredanimal;
    }
  }

  //TODO: ADD DELETE METHOD

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO endangered_animals (name, health, age, image_url) VALUES (:name, :health, :age, :image_url);";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .addParameter("health", this.health)
      .addParameter("age", this.age)
      .addParameter("image_url", this.image_url)
      .executeUpdate()
      .getKey();
    }
  }

  @Override
  public boolean equals(Object otherEndangeredAnimal) {
    if(!(otherEndangeredAnimal instanceof EndangeredAnimal)) {
      return false;
    } else {
      EndangeredAnimal newEndangeredAnimal = (EndangeredAnimal) otherEndangeredAnimal;
      return this.getName().equals(newEndangeredAnimal.getName()) && this.getHealth().equals(newEndangeredAnimal.getHealth()) && this.getAge().equals(newEndangeredAnimal.getAge());
    }
  }


}
