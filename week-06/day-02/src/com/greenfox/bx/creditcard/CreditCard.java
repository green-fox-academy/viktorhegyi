package com.greenfox.bx.creditcard;

/**
 * Created by Viktor on 2017-04-24.
 */
public class CreditCard implements CreditCardy {

  private String name;
  private int number;
  private int sum;
  private String account;
  private static int counter = 0;


  public CreditCard() {
    this.number = counter++;
    this.name = "ABC" + number ;
    this.account = getCodeAccount();
    this.sum = cumeSumCVV(account);
  }

  @Override
  public int getSumCVV() {
    return sum;
  }

  @Override
  public String getNameCardholder() {
    return name;
  }

  @Override
  public String getCodeAccount() {
    String returnAccount = "";
    for (int i = 0; i < 16 ; i++) {
      returnAccount += randomNumberGenerator();
    }
    return returnAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int sum = 0;
    for (char c : codeAccount.toCharArray())
      sum += c - '0';
    return sum;
  }

  @Override
  public String toString () {
    return String.format("Name=%s CC#=%s CVV=%d", getNameCardholder(), getCodeAccount(), getSumCVV());
  }

  public int randomNumberGenerator() {
    int random = (int)(Math.random() * 9 + 1);
    return random;
  }

}
