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

// enable the next line to pre-populate the database with some rangers/stations/locations/animals/sightings
    // DatabasePopulator.populateDatabase();

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

    get("/stations/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/station.vtl");
      Station station = Station.find(Integer.parseInt(request.params("id")));
      model.put("station", station);
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

    get("/locations/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/location.vtl");
      Location location = Location.find(Integer.parseInt(request.params("id")));
      model.put("location", location);
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

    get("/animals/endangered", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/endangeredanimals.vtl");
      model.put("animals", Animal.all());
      model.put("endangeredanimals", EndangeredAnimal.all());
      model.put("sightings", Sighting.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/animals/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/animal.vtl");
      Animal animal = Animal.find(Integer.parseInt(request.params("id")));
      model.put("animal", animal);
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/animals/endangered/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/endangeredanimal.vtl");
      EndangeredAnimal endangeredAnimal = EndangeredAnimal.find(Integer.parseInt(request.params("id")));
      model.put("endangeredanimal", endangeredAnimal);
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
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

    get("/sightings/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/sighting.vtl");
      Sighting sighting = Sighting.find(Integer.parseInt(request.params("id")));
      model.put("sighting", sighting);
      model.put("rangers", Ranger.all());
      model.put("stations", Station.all());
      model.put("locations", Location.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/addcontent.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent/ranger", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("stations", Station.all());
      model.put("template", "templates/newrangerform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent/station", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("locations", Location.all());
      model.put("template", "templates/newstationform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent/location", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/newlocationform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent/animal", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("creature", Creature.class);
      model.put("template", "templates/newanimalform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent/endangeredanimal", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("creature", Creature.class);
      model.put("template", "templates/newendangeredanimalform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/addcontent/sighting", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      List<Object> allAnimals = new ArrayList<Object>();
      allAnimals.addAll(Animal.all());
      allAnimals.addAll(EndangeredAnimal.all());
      model.put("animals", allAnimals);
      model.put("rangers", Ranger.all());
      model.put("locations", Location.all());
      model.put("template", "templates/newsightingform.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addcontent/ranger/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      response.redirect(request.headers("referer"));
      String name = request.queryParams("name");
      String email = request.queryParams("email");
      int stationId = Integer.parseInt(request.queryParams("station"));
      Ranger newRanger = new Ranger(name, email, stationId);
      newRanger.save();
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addcontent/station/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      response.redirect(request.headers("referer"));
      String name = request.queryParams("name");
      String coordinates = request.queryParams("coordinates");
      int locationId = Integer.parseInt(request.queryParams("location"));
      Station newStation = new Station(name, coordinates, locationId);
      newStation.save();
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addcontent/location/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      response.redirect(request.headers("referer"));
      String name = request.queryParams("name");
      Location newLocation = new Location(name);
      newLocation.save();
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addcontent/animal/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      response.redirect(request.headers("referer"));
      String name = request.queryParams("name");
      String health = request.queryParams("health");
      String age = request.queryParams("age");
      String imageUrl = request.queryParams("imageUrl");
      Animal newAnimal = new Animal(name, health, age);
      newAnimal.save();
      newAnimal.updateImageUrl(imageUrl);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addcontent/endangeredanimal/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      response.redirect(request.headers("referer"));
      String name = request.queryParams("name");
      String health = request.queryParams("health");
      String age = request.queryParams("age");
      EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal(name, health, age);
      newEndangeredAnimal.save();
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addcontent/sighting/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      response.redirect(request.headers("referer"));
      int animalName = Integer.parseInt(request.queryParams("animalName"));
      int rangerName = Integer.parseInt(request.queryParams("rangerName"));
      int locationName = Integer.parseInt(request.queryParams("locationName"));
      Sighting newSighting = new Sighting(animalName, rangerName, locationName);
      newSighting.save();
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
