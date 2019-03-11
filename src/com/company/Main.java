package com.company;

public class Main {

    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
//            StringBuilder string = new StringBuilder(x);
//
//            if (x % 3 == 0) {
//                string.append("Fizz");
//            } else if (x % 5 == 0) {
//                string.append("Buzz");
//            } else if (x % 7 == 0) {
//                string.append("Bang");
//            } else if (x % 11 == 0) {
//                string.append("Bong");
//            } else if (x % 13 == 0) {
//                string.append("Fezz");
//            } else {
//                System.out.println(x);
//            }
//        }
//    }
//}

            if (x % 11 == 0) {
                System.out.println("Bong");
            } else if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
                System.out.println("FizzBuzzBang");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 7 == 0 && x % 3 == 0) {
                System.out.println("FizzBang");
            } else if (x % 7 == 0 && x % 5 == 0) {
                System.out.println("BuzzBang");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else if (x % 7 == 0) {
                System.out.println("Bang");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(x);
            }
        }
    }
}

