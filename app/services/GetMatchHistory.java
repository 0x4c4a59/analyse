package services;

import play.Logger;
import play.Logger.ALogger;
import utils.Prop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by lijy on 16-12-7.
 */
public class GetMatchHistory implements Dota2Request {
  private static String urlExceptParameter = "http://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/v1?";
  private final ALogger logger = Logger.of(GetMatchHistory.class);

  @Override
  public String get(Prop prop) throws IOException {
    logger.debug("Getting the match history...");
    BufferedReader in = null;
    try {
      logger.debug("Building the url...");
      URL url = new URL(urlExceptParameter + prop.toUrlParameter());
      logger.debug(String.format("The url is %s.", url.toString()));
      URLConnection connection = url.openConnection();
      connection.connect();
      logger.debug("The connection has been built.");
      in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String line = null;
      logger.debug("Getting the data from response...");
      StringBuilder sb = new StringBuilder();
      while ((line = in.readLine()) != null) {
        sb.append(line);
      }
      return sb.toString();
    } catch (IOException e) {
      throw e;
    } finally {
      if (in != null) {
        in.close();
      }
    }
  }
}
