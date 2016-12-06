package services.history;

/**
 * Created by lijy on 16-12-7.
 */
public class Result {
  private int status;
  private int num_results;
  private int total_results;
  private int results_remaining;
  private Match[] matches;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getNum_results() {
    return num_results;
  }

  public void setNum_results(int num_results) {
    this.num_results = num_results;
  }

  public int getTotal_results() {
    return total_results;
  }

  public void setTotal_results(int total_results) {
    this.total_results = total_results;
  }

  public int getResults_remaining() {
    return results_remaining;
  }

  public void setResults_remaining(int results_remaining) {
    this.results_remaining = results_remaining;
  }

  public Match[] getMatches() {
    return matches;
  }

  public void setMatches(Match[] matches) {
    this.matches = matches;
  }
}
