package com.company;

public class Main {

    public static void main(String[] args) {
        for (int x=0; x<=100; x++) {
             if (x % 3 == 0 && x % 5 ==0)
                System.out.println("FizzBuzz");
            else if (x % 3 == 0)
            System.out.println("Fizz");
            else if (x % 5 == 0)
                System.out.println("Buzz");
            else if (x % 3 == 0 && x % 5 ==0)
                System.out.println("FizzBuzz");
            else {
                System.out.println(x);
            }
        }
    }
}
