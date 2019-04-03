package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name);
        }else {
            System.out.println("Sorry I do not recognise you");
        }
    }

}
