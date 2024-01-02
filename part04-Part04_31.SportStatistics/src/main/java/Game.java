public class Game {
  private String homeTeam;
  private String awayTeam;
  private int homeScore;
  private int awayScore;

  public Game(String homeTeam, String awayTeam, int homeScore, int awayScore) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.homeScore = homeScore;
    this.awayScore = awayScore;
  }

  public String getWinner() {
    if (homeScore > awayScore) {
      return this.homeTeam;
    }
    if (awayScore > homeScore) {
      return this.awayTeam;
    }
    return "";
  }

  public String getLoser() {
    if (homeScore < awayScore) {
      return this.homeTeam;
    }
    if (awayScore < homeScore) {
      return this.awayTeam;
    }
    return "";
  }

}
