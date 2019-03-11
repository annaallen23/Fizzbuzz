package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input a list of 6 numbers");

        Scanner scanner = new Scanner(System.in);
        int fizzNumber = scanner.nextInt();
        int fezzNumber = scanner.nextInt();
        int buzzNumber = scanner.nextInt();
        int bangNumber = scanner.nextInt();
        int bongNumber = scanner.nextInt();
        int revNumber = scanner.nextInt();

        for (int x = 0; x <= 100; x++) {
            ArrayList<String> string = new ArrayList<>();

            if (x % fizzNumber == 0) {
                string.add("Fizz");
            }
            if (x % fezzNumber == 0) {
                string.add("Fezz");
            }
            if (x % buzzNumber == 0) {
                string.add("Buzz");
            }
            if (x % bangNumber == 0) {
                string.add("Bang");
            }
            if (x % bongNumber == 0) {
                string.clear();
                string.add("Bong");
            }
            if (x % bongNumber == 0 && x % fezzNumber == 0) {
                string.clear();
                string.add("FezzBong");
            }
            if (x % revNumber == 0) {
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






