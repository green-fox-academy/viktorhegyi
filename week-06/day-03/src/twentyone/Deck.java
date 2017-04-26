package twentyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import twentyone.Card.Rank;
import twentyone.Card.Suit;

/**
 * Created by Viktor on 2017-04-26.
 */
public class Deck {

  List<Card> deck = new ArrayList<>();

  public Deck() {
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(s,r);
        deck.add(c);
      }
    }
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public Card pullFirst() {
    Card firstCard = deck.get(0);
    deck.remove(0);
    System.out.println(firstCard);
    return firstCard;
  }

  public Card pullLast() {
    Card lastCard = deck.get(deck.size() - 1);
    System.out.println(lastCard);
    deck.remove(deck.size() -1 );
    return lastCard;
  }

  public Card pullRandom() {
    int random = (int)(Math.random() * deck.size() + 1);
    Card randomCard = deck.get(random);
    System.out.println(randomCard);
    deck.remove(random);
    return randomCard;
  }

  @Override
  public String toString() {
    return " " + deck;
  }

}
