package com.Calculator.Calculater.Controller;

import com.Calculator.Calculater.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @RequestMapping("/")
        public String homesender(){
            return "index";
    }
    @RequestMapping("/add")
    public String add(@RequestParam String number1,@RequestParam String number2,Model model){
        String s = calculatorService.add(number1,number2);
        model.addAttribute("spqd",s);
        return "output";
    }
    @RequestMapping("/multiply")
    public String multiply(@RequestParam String number1,@RequestParam String number2,Model model){
        String s = calculatorService.multiply(number1,number2);
        model.addAttribute("spqd",s);
        return "output";
    }@RequestMapping("/divide")
    public String divide(@RequestParam String number1,@RequestParam String number2,Model model){
        String s = calculatorService.divide(number1,number2);
        model.addAttribute("spqd",s);
        return "output";
    }@RequestMapping("/subtract")
    public String subtract(@RequestParam String number1,@RequestParam String number2,Model model){
        String s = calculatorService.subtract(number1,number2);
        model.addAttribute("spqd",s);
        return "output";
    }
}
