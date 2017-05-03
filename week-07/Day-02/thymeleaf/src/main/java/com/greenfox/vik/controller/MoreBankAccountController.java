package com.greenfox.vik.controller;

import com.greenfox.vik.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Viktor on 2017-05-03.
 */
@Controller
public class MoreBankAccountController {

  ArrayList<BankAccount> list = new ArrayList<>();

  BankAccount tiger = new BankAccount("Tigrusku", 1000, "tiger", false, true);
  BankAccount leopard = new BankAccount("Leo", 500, "leopard", false, true);
  BankAccount puma = new BankAccount("Pumi", 200, "puma", false, false);
  BankAccount cat = new BankAccount("Macsek", 1, "cat", true, false);

  public MoreBankAccountController() {
    list.add(0, tiger);
    list.add(1, leopard);
    list.add(2, puma);
    list.add(3, cat);
  }

  @RequestMapping("/exercise5")
  public String viewBankAccounts(Model model) {
    ArrayList<BankAccount> list = new ArrayList<>();
    list.add(0, tiger);
    list.add(1, leopard);
    list.add(2, puma);
    list.add(3, cat);
    model.addAttribute("list", list);
    return "bankAccounts";
  }

  @RequestMapping("/add")
  public String hit(@RequestParam int id) {
    int value = 10;
    int number = list.get(id).getBalance();
    list.get(id).setBalance(number + value);
    return "redirect:/exercise5";
  }
}
