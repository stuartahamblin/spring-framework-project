package com.codeup.springframeworkproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/{operation}/{number1}/{word}/{number2}")
    @ResponseBody
    public double doMath(@PathVariable String operation, @PathVariable double number1, @PathVariable String word, @PathVariable double number2){

        if(operation.equals("add") && word.equals("and")){
            return number1 + number2;
        } else if (operation.equals("subtract") && word.equals("from")) {
            return number2 - number1;
        } else if (operation.equals("multiply") && word.equals("and")) {
            return number1 * number2;
        } else if (operation.equals("divide") && word.equals("by")) {
            return number2 / number1;
        }
        return 0;
    }
}

///add/3/and/4	            7
///subtract/3/from/10	    7
///multiply/4/and/5	        20
///divide/6/by/3	        2