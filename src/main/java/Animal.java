import org.sql2o.*;
import java.util.ArrayList;
import java.util.List;

public class Animal extends Creature {

  public Animal(String name, String health, String age) {
    this.name = name;
    this.id = id;
    this.health = health;
    this.age = age;
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

  public int getNumberOfSightings() {
    return getSightings().size();
  }

  public void updateName(String name) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE animals SET name=:name WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("name", name)
      .executeUpdate();
    }
  }


  public void updateAge(String age) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE animals SET age=:age WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("age", age)
      .addParameter("id", id)
      .executeUpdate();
    }
  }

  public void updateHealth(String health) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE animals SET health=:health WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("health", health)
      .executeUpdate();
    }
  }

//I HAVE NO IDEA WHY THIS ISN'T WORKING?!!?!??!?!?!?!?!?!?!?
  public void updateImageUrl(String imageUrl) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE animals SET image_url=:imageUrl WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .addParameter("image_url", imageUrl)
      .executeUpdate();
    }
  }

  public static List<Animal> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM animals;";
      return con.createQuery(sql)
      .executeAndFetch(Animal.class);
    }
  }

  public static Animal find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM animals WHERE id=:id;";
      Animal animal = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Animal.class);
      return animal;
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO animals (name, health, age, image_url) VALUES (:name, :health, :age, :image_url);";
      this.id = (int) con.createQuery(sql, true)
      .addParameter("name", this.name)
      .addParameter("health", this.health)
      .addParameter("age", this.age)
      .addParameter("image_url", this.image_url)
      .executeUpdate()
      .getKey();
    }
  }

  public void delete() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM animals WHERE id=:id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .executeUpdate();
    }
  }


  @Override
  public boolean equals(Object otherAnimal) {
    if(!(otherAnimal instanceof Animal)) {
      return false;
    } else {
      Animal newAnimal = (Animal) otherAnimal;
      return this.getName().equals(newAnimal.getName());
    }
  }
}
