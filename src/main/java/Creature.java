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
  public String image_url="https://i.imgur.com/rwXStQ0.jpg";

  //TODO: what do I do with these constants?
  public static final String HEALTH_ILL = "ill";
  public static final String HEALTH_OKAY = "okay";
  public static final String HEALTH_HEALTHY = "healthy";
  public static final String AGE_YOUNG = "young";
  public static final String AGE_NEWBORN = "newborn";
  public static final String AGE_ADULT = "adult";


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

    public String getImageUrl() {
      return image_url;
    }

}
