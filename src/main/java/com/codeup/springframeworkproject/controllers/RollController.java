package com.codeup.springframeworkproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollController {

    private int pips;
    @GetMapping("/roll-dice")
    public String rollDice(){

        pips = (int) Math.floor(Math.random() * 6) + 1;
        return "rollDice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollDice(@PathVariable int guess, Model mod){
        mod.addAttribute("pips", guess);
        mod.addAttribute("pips", pips);
        mod.addAttribute("correct", guess == pips);
        return "diceResults";
    }
}