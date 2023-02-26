package com.kodilla;

public class Calculator {

    public static void main(String[] args) {

        Calculator myCalc = new Calculator();
        System.out.println(myCalc.Sum(2,49));
        System.out.println(myCalc.Subtract(67, 37));

    }

    public int Sum(int a, int b) {
        return a + b;
    }

    public int Subtract(int a, int b) {
        return a - b;
    }

}
