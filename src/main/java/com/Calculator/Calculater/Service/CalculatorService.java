package com.Calculator.Calculater.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String add(String number1, String number2) {
        int i = Integer.parseInt(number1)+Integer.parseInt(number2);
        String s = Integer.toString(i);
        return s;
    }
    public String multiply(String number1, String number2) {
        int i = Integer.parseInt(number1)*Integer.parseInt(number2);
        String s = Integer.toString(i);
        return s;
    }public String divide(String number1, String number2) {
        int i = Integer.parseInt(number1)/Integer.parseInt(number2);
        String s = Integer.toString(i);
        return s;
    }public String subtract(String number1, String number2) {
        int i = Integer.parseInt(number1)-Integer.parseInt(number2);
        String s = Integer.toString(i);
        return s;
    }
}
