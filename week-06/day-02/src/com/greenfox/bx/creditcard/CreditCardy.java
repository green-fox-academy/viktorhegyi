package com.greenfox.bx.creditcard;

/**
 * Created by Viktor on 2017-04-24.
 */
interface CreditCardy {

  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount); // computes codeAccount checksum

  String toString (); //String.format("Name=%s CC#=%s CVV=%d");

}
