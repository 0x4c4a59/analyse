package test.service;

import services.Dota2Request;
import services.GetMatchHistory;
import utils.Prop;

import java.io.File;
import java.io.IOException;

import static services.Dota2Parameters.ACCOUNT_ID;
import static services.Dota2Parameters.MATCHES_REQUESTED;

/**
 * Created by lijy on 16-12-7.
 */
public class GetMatchHistoryTest {
  static public void main(String[] args) throws IOException {
    Prop parameters = new Prop();
    parameters.put(new File("conf/dota2.conf"));
    parameters.put(ACCOUNT_ID, 139876032);
    parameters.put(MATCHES_REQUESTED, 1);
    Dota2Request getMatchHistory = new GetMatchHistory();
    System.out.print(getMatchHistory.get(parameters));
  }
}
