package main;

public class TennisGame1 implements TennisGame {

  private int player1score = 0;
  private int player2score = 0;
  private String player1Name;
  private String player2Name;
  private String score = "";

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName.equals(player1Name))
      player1score += 1;
    else
      player2score += 1;
  }

  public String getScore() {
    if (player1score == player2score)
    { equalScore();
    } else if (player1score >= 4 || player2score >= 4 )
      { advantageOrWin();
    } else {
      setScoreBeforeTheEndOfTheGameOrNotDouce();
    }
    return score;
  }

  public void equalScore() {
      switch (player1score)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;
      }
  }

  public void advantageOrWin() {
    int minusResult = player1score-player2score;
    if (Math.abs(minusResult) == 1) declareAdvantage(minusResult);
    else winnerOfTheMatch(minusResult);
  }

  public void declareAdvantage(int minusResult) {
    if (minusResult == 1) {
      score ="Advantage player1";
    }
    else if (minusResult == -1) {
      score ="Advantage player2";
    }
  }

  public void winnerOfTheMatch(int minusResult) {
    if (minusResult > 0) {
      score = "Win for player1";
    }
    else if (minusResult < 0) {
      score = "Win for player2";
    }
  }

  public void setScoreBeforeTheEndOfTheGameOrNotDouce() {
    int tempScore=0;

    for (int i=0; i<2; i++)
    {
      if (i==0) tempScore = player1score;
      else {
        score+="-";
        tempScore = player2score;}
      switch(tempScore)
      {
        case 0:
          score+="Love";
          break;
        case 1:
          score+="Fifteen";
          break;
        case 2:
          score+="Thirty";
          break;
        case 3:
          score+="Forty";
          break;
      }
    }
  }
}
