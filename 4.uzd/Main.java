package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int val;

        System.out.println("Input a number");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            val = sc.nextInt();
        } else {
            System.out.println("Not a number value");
            return;
        }

        evenOrOdd(val);

    }

    public static void evenOrOdd(int num) {
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        } else {
            System.out.println("Not a whole number");
        }
    }
}