package services;

import play.Configuration;

/**
 * Created by lijy on 16-12-5.
 */
public interface Dota2Parameters {
  /**
   * Request parameters
   * Common elements
   */
  String KEY = "key";
  String FORMAT = "format";
  String LANGUAGE = "language";

  /**
   * Request parameters
   * GetMatchHistory
   */
  String HERO_ID = "hero_id";
  String GAME_MODE = "game_mode";
  String SKILL = "skill";
  String MIN_PLAYERS = "min_players";
  String ACCOUNT_ID = "account_id";
  String LEAGUE_ID = "league_id";
  String START_AT_MATCH_ID = "start_at_match_id";
  String MATCHES_REQUESTED = "matches_requested";
  String TOURNAMENT_GAMES_ONLY = "tournament_games_only";
  Configuration defaultConf = new Configuration("conf/dota2.conf");
}
