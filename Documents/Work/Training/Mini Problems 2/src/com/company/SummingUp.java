package com.company;

import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    total = total + 1;
                }
            }
        System.out.println(total);
        {
            while (!scanner.hasNextInt()){

            System.out.println("This is not a valid input, please enter a number");
            break;
        }
        }
        }

        }



