import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    // Location testLocation1 = new Location("Up North");
    // Location testLocation2 = new Location("Down South");
    // testLocation2.save();
    // testLocation1.save();
    // Station testStation1 = new Station("The Cold Longhouse", "66.160507,-153.369141", testLocation1.getId());
    // Station testStation2 = new Station("Icy Longhouse", "66.160507,-153.369141", testLocation1.getId());
    // Station testStation3 = new Station("Igloo Station Red", "66.160507,-153.369141", testLocation1.getId());
    // Station testStation4 = new Station("Tiny House Station Alpha", "45.512794,-122.679565", testLocation2.getId());
    // Station testStation5 = new Station("Tree House Number 1", "45.512794,-122.679565", testLocation2.getId());
    // Station testStation6 = new Station("Outpost 42", "45.512794,-122.679565", testLocation2.getId());
    // testStation1.save();
    // testStation2.save();
    // testStation3.save();
    // testStation4.save();
    // testStation5.save();
    // testStation6.save();
    // Ranger testRanger1 = new Ranger("Joe", "ranger.joe@parks.com", testStation1.getId());
    // Ranger testRanger2 = new Ranger("John", "ranger.john@parks.com", testStation2.getId());
    // Ranger testRanger3 = new Ranger("Jack", "ranger.jack@parks.com", testStation3.getId());
    // Ranger testRanger4 = new Ranger("Jeremy", "ranger.jeremy@parks.com", testStation4.getId());
    // Ranger testRanger5 = new Ranger("Alfred", "ranger.alfred@parks.com", testStation4.getId());
    // Ranger testRanger6 = new Ranger("Percival", "ranger.percival@parks.com", testStation5.getId());
    // Ranger testRanger7 = new Ranger("Buggimus", "ranger.buggimus@parks.com", testStation6.getId());
    // Ranger testRanger8 = new Ranger("Halperton", "ranger.halperton@parks.com", testStation6.getId());
    // testRanger1.save();
    // testRanger2.save();
    // testRanger3.save();
    // testRanger4.save();
    // testRanger5.save();
    // testRanger6.save();
    // testRanger7.save();
    // testRanger8.save();
    // Animal testAnimal1 = new Animal("Deer", "healthy", "young");
    // Animal testAnimal2 = new Animal("Rabbit", "ill", "newborn");
    // Animal testAnimal3 = new Animal("Deer", "healthy", "adult");
    // Animal testAnimal4 = new Animal("Porcipine", "okay", "adult");
    // Animal testAnimal5 = new Animal("Bear", "healthy", "newborn");
    // Animal testAnimal6 = new Animal("Deer", "healthy", "newborn");
    // Animal testAnimal7 = new Animal("Moose", "okay", "adult");
    // Animal testAnimal8 = new Animal("Bear", "healthy", "adult");
    // Animal testAnimal9 = new Animal("Snake", "healthy", "newborn");
    // testAnimal1.save();
    // testAnimal2.save();
    // testAnimal3.save();
    // testAnimal4.save();
    // testAnimal5.save();
    // testAnimal6.save();
    // testAnimal7.save();
    // testAnimal8.save();
    // testAnimal9.save();
    // EndangeredAnimal testEndangeredAnimal1 = new EndangeredAnimal("Deer", "healthy", "young");
    // EndangeredAnimal testEndangeredAnimal2 = new EndangeredAnimal("Rabbit", "ill", "newborn");
    // EndangeredAnimal testEndangeredAnimal3 = new EndangeredAnimal("Deer", "healthy", "adult");
    // EndangeredAnimal testEndangeredAnimal4 = new EndangeredAnimal("Porcipine", "okay", "adult");
    // EndangeredAnimal testEndangeredAnimal5 = new EndangeredAnimal("Bear", "healthy", "newborn");
    // EndangeredAnimal testEndangeredAnimal6 = new EndangeredAnimal("Deer", "healthy", "newborn");
    // EndangeredAnimal testEndangeredAnimal7 = new EndangeredAnimal("Moose", "okay", "adult");
    // EndangeredAnimal testEndangeredAnimal8 = new EndangeredAnimal("Bear", "healthy", "adult");
    // EndangeredAnimal testEndangeredAnimal9 = new EndangeredAnimal("Snake", "healthy", "newborn");
    // testEndangeredAnimal1.save();
    // testEndangeredAnimal2.save();
    // testEndangeredAnimal3.save();
    // testEndangeredAnimal4.save();
    // testEndangeredAnimal5.save();
    // testEndangeredAnimal6.save();
    // testEndangeredAnimal7.save();
    // testEndangeredAnimal8.save();
    // testEndangeredAnimal9.save();
    // Sighting testSighting1 = new Sighting(testAnimal1.getId(), testRanger1.getId(), testLocation1.getId());
    // Sighting testSighting2 = new Sighting(testAnimal2.getId(), testRanger4.getId(), testLocation1.getId());
    // Sighting testSighting3 = new Sighting(testAnimal3.getId(), testRanger3.getId(), testLocation2.getId());
    // Sighting testSighting4 = new Sighting(testAnimal4.getId(), testRanger3.getId(), testLocation2.getId());
    // Sighting testSighting5 = new Sighting(testAnimal5.getId(), testRanger2.getId(), testLocation1.getId());
    // Sighting testSighting6 = new Sighting(testEndangeredAnimal1.getId(), testRanger1.getId(), testLocation2.getId());
    // Sighting testSighting7 = new Sighting(testEndangeredAnimal2.getId(), testRanger6.getId(), testLocation1.getId());
    // Sighting testSighting8 = new Sighting(testEndangeredAnimal4.getId(), testRanger4.getId(), testLocation2.getId());
    // Sighting testSighting9 = new Sighting(testEndangeredAnimal5.getId(), testRanger2.getId(), testLocation1.getId());
    // Sighting testSighting10 = new Sighting(testEndangeredAnimal8.getId(), testRanger3.getId(), testLocation2.getId());
    // testSighting1.save();
    // testSighting2.save();
    // testSighting3.save();
    // testSighting4.save();
    // testSighting5.save();
    // testSighting6.save();
    // testSighting7.save();
    // testSighting8.save();
    // testSighting9.save();
    // testSighting10.save();

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/rangers", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/rangers.vtl");
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/rangers/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/ranger.vtl");
      Ranger ranger = Ranger.find(Integer.parseInt(request.params("id")));
      model.put("ranger", ranger);
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/stations", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/stations.vtl");
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/locations", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/locations.vtl");
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/animals", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/animals.vtl");
      model.put("animals", Animal.all());
      model.put("endangeredAnimals", EndangeredAnimal.all());
      model.put("sightings", Sighting.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/sightings", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/sightings.vtl");
      model.put("animals", Animal.all());
      model.put("endangeredAnimals", EndangeredAnimal.all());
      model.put("sightings", Sighting.all());
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
