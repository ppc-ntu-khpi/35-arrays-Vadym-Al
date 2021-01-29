package test;

import domain.Exercise;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = in.nextInt();
        System.out.println("your result: "+Exercise.Calculate(number));
    }
}
