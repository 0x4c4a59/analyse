package services;

import com.google.inject.Singleton;
import play.Configuration;

import java.io.InputStream;

/**
 * Created by lijy on 16-12-6.
 */
public class Dota2Configuration extends Configuration{
  public Dota2Configuration(InputStream input) {
    super();
  }

  static public Dota2Configuration getDefaultConfiguration() {
    Dota2Configuration conf = new Dota2Configuration("conf/dota2.conf");
  }
}
