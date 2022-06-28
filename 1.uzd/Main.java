package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int val1, val2;

        System.out.println("Input 2 numbers");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            val1 = sc.nextInt();
            if (sc.hasNextInt()) {
                val2 = sc.nextInt();
            } else {
                System.out.println("Not an integer value");
                return;
            }
        } else {
            System.out.println("Not an integer value");
            return;
        }

        Compare(val1, val2);

    }

    public static void Compare(int a, int b) {
        if (a == b)
            System.out.printf("is %d equal to %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d equal to %d? - %b%n", a, b, false);

        if (a < b)
            System.out.printf("is %d less than %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d less than %d? - %b%n", a, b, false);

        if (a <= b)
            System.out.printf("is %d less or equals to %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d less or equals to %d? - %b%n", a, b, false);

        if (a > b)
            System.out.printf("is %d greater than %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d greater than %d? - %b%n", a, b, false);

        if (a >= b)
            System.out.printf("is %d greater or equal to %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d greater or equal to %d? - %b%n", a, b, false);
    }
}