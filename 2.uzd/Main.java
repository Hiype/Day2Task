package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean val1, val2;

        System.out.println("Input 2 boolean values");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextBoolean()) {
            val1 = sc.nextBoolean();
            if (sc.hasNextBoolean()) {
                val2 = sc.nextBoolean();
            } else {
                System.out.println("Not a boolean value");
                return;
            }
        } else {
            System.out.println("Not a boolean value");
            return;
        }

        Compare(val1, val2);

    }

    public static void Compare(boolean a, boolean b) {
        if (a == b)
            System.out.printf("is a and b equal? - %b%n", true);
        else
            System.out.printf("is a and b equal? - %b%n", false);
    }
}