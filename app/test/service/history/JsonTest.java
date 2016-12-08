package test.service.history;

import com.google.gson.Gson;
import services.Dota2Request;
import services.GetMatchHistory;
import services.history.History;
import utils.Prop;

import java.io.File;
import java.io.IOException;

import static services.Dota2Parameters.ACCOUNT_ID;

/**
 * Created by lijy on 16-12-7.
 */
public class JsonTest {
  static public void main(String[] args) throws IOException {
    Prop parameters = new Prop();
    parameters.put(new File("conf/dota2.conf"));
    parameters.put(ACCOUNT_ID, 139876032);
    Dota2Request getMatchHistory = new GetMatchHistory();
    String json = getMatchHistory.get(parameters);
    System.out.println(json);
    Gson gson = new Gson();
    History his = gson.fromJson(json, History.class);
    System.out.println(gson.toJson(his));
  }

}
