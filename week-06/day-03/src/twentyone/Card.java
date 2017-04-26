package twentyone;

/**
 * Created by Viktor on 2017-04-26.
 */
public class Card {

  enum Color {black, red}
  enum Suit {CLUB,DIAMOND,SPADE,HEART}
  enum Rank {TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(10),QUEEN(10),KING(10),ACE(11);

    int value;

    Rank(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  private Suit suit;
  private Rank rank;
  private int value;

  public int getValue() {
    return value;
  }

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    this.value = rank.getValue();
  }

  @Override
  public String toString() {
    return "{" + suit + " " + rank + '}';
  }
}
