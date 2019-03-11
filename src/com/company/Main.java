package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        for (int x = 1; x <= 300; x++) {
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






