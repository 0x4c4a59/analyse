package services.history;

import com.google.gson.Gson;

/**
 * Created by lijy on 16-12-7.
 */
public class History {
  static public class HistoryBuilder {
    static public String toJson(History history) {
      return gson.toJson(history);
    }

    static public History fromJson(String json) {
      return gson.fromJson(json, History.class);
    }
  }
  private static Gson gson = new Gson();
  private Result result;

  private History() {}

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }
}
