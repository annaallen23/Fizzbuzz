package com.company;

import java.util.Scanner;

public class LeapingForJoy {
    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int numberOfResponses = 0;

        for (int year=2019; numberOfResponses< input; year++) {
            if (year % 4 == 0 || year % 400 == 0 && year % 100 == 0) ;
            numberOfResponses = numberOfResponses + 1;

            System.out.println(year);
        }

    }
}
