package twentyone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Viktor on 2017-04-26.
 */
public class Game {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Scanner scanner = new Scanner(System.in);
    String answer;
    List<Card> playerCards = new ArrayList<>();
    int dealerScore = dealerScore();

    deck.shuffleDeck();
    System.out.println("Let's play BlackJack");
    System.out.println("The dealer hand: " + dealerScore);
    System.out.println("Your first two cards:");
    playerCards.add(deck.pullFirst());
    playerCards.add(deck.pullFirst());
    int score = playerCards.get(0).getValue() + playerCards.get(1).getValue();

    System.out.println("Do you want card? (y or n)");
    answer = scanner.nextLine();

    while ( answer.equals("y")) {
      playerCards.add(deck.pullFirst());
      score += playerCards.get(playerCards.size() - 1).getValue();
      if ( score > 21 ) {
        System.out.println("You lost, you have more than 21..");
        break;
      } else if ( score == 21){
        System.out.println("BlackJack!");
        break;
      }
      System.out.println("Do you want card? (y or n)");
      answer = scanner.nextLine();
    }
    if ( answer.equals("n")) {
      System.out.println("End of the game");
    }

    System.out.println("Your hand: " + score);
    System.out.println("Dealer hand: " + dealerScore);
    if ( score > dealerScore && score < 22) {
      System.out.println("You won!");
    } else {
      System.out.println("You lost!");
    }
  }

  public static int dealerScore() {
    Random random = new Random();
    int score = random.nextInt((21 - 15) + 1 ) + 15;
    return score;
  }
}
