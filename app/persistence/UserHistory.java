package persistence;

import services.history.History;

/**
 * Created by lijy on 16-12-7.
 */
final public class UserHistory {
  private Long id;
  private Long lastMatch;
  private History history;

  public UserHistory() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getLastMatch() {
    return lastMatch;
  }

  public void setLastMatch(Long lastMatch) {
    this.lastMatch = lastMatch;
  }

  public String getHistory() {
    return History.HistoryBuilder.toJson(history);
  }

  public void setHistory(String history) {
    this.history = History.HistoryBuilder.fromJson(history);
  }

  public void setHistory(History history) {
    this.history = history;
  }
}
