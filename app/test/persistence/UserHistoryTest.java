package test.persistence;

import services.history.History;

/**
 * Created by lijy on 16-12-7.
 */
public class UserHistoryTest {
  static public void main(String[] args) {
    String s = "{\"result\":{\"status\":1,\"num_results\":1,\"total_results\":500,\"results_remaining\":499,\"matches\":[{\"match_id\":2815840765,\"match_seq_num\":2457083574,\"start_time\":1480605476,\"lobby_type\":0,\"radiant_team_id\":0,\"dire_team_id\":0,\"players\":[{\"account_id\":139876032,\"player_slot\":0,\"hero_id\":87},{\"account_id\":317836735,\"player_slot\":1,\"hero_id\":32},{\"account_id\":112517056,\"player_slot\":2,\"hero_id\":70},{\"account_id\":137543147,\"player_slot\":3,\"hero_id\":84},{\"account_id\":138421911,\"player_slot\":4,\"hero_id\":16},{\"account_id\":4294967295,\"player_slot\":128,\"hero_id\":59},{\"account_id\":147785379,\"player_slot\":129,\"hero_id\":17},{\"account_id\":387655783,\"player_slot\":130,\"hero_id\":37},{\"account_id\":4294967295,\"player_slot\":131,\"hero_id\":8},{\"account_id\":386638922,\"player_slot\":132,\"hero_id\":13}]}]}}";
    History h = History.HistoryBuilder.fromJson(s);
  }
}
