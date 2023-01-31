package Homework;

import java.sql.SQLOutput;

public class Ex3 {
    public static void main(String[] args) {
        double randomNumber = 15;
        double squareRoot = Math.sqrt(randomNumber);
        System.out.println("The square root of the random number is " + ((double) Math.floor(squareRoot * 1000) / 1000));
    }
}
