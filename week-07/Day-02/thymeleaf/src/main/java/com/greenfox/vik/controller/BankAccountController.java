package com.greenfox.vik.controller;

import com.greenfox.vik.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Viktor on 2017-05-03.
 */
@Controller
public class BankAccountController {

    @RequestMapping(value = "/exercise1")
    public String viewBankAccount(Model model) {
      BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", false, true);
      model.addAttribute(bankAccount);
      return "index";
    }
}
