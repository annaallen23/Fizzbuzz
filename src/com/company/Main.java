package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input a number between 1 & 300");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int x = 1; x <= input; x++) {
            ArrayList<String> string = new ArrayList<>();

            if (x % 3 == 0) {
                string.add("Fizz");
            }
            if (x % 13 == 0) {
                string.add("Fezz");
            }
            if (x % 5 == 0) {
                string.add("Buzz");
            }
            if (x % 7 == 0) {
                string.add("Bang");
            }
            if (x % 11 == 0) {
                string.clear();
                string.add("Bong");
            }
            if (x % 11 == 0 && x % 13 == 0) {
                string.clear();
                string.add("FezzBong");
            }
            if (x % 17 == 0) {
                Collections.reverse(string);
            }
            if (string.size() > 0) {
                System.out.println(String.join("",string));
            } else {
                System.out.println(x);
            }
        }
    }
}






