package com.example.taxcalculator;
public class TaxCalculate {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double lowTax(){

        double res = amount/100;
        return res;
    }
    public double mediumTax(){

        double remaining = amount-200000;
        double low = 200000/100;
        double medium = remaining*15/100;
        double res = low + medium;
        return res;
    }
    public double highTax(){

        double remainingHigh = amount-350000;
        double remainingLow = remainingHigh-200000;
        double low = 200000/100;
        double medium = remainingHigh*15/100;
        double high = remainingHigh*25/100;
        double res = low + medium + high;
        return res;
    }
}

