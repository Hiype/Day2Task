package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b;

        System.out.println("Input 2 whole numbers");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (a >= 0) {
                if (sc.hasNextInt()) {
                    b = sc.nextInt();
                    if (b < 0) {
                        System.out.println("Not a whole number");
                        return;
                    }
                } else {
                    System.out.println("Not a number value");
                    return;
                }
            } else {
                System.out.println("Not a whole number");
                return;
            }
        } else {
            System.out.println("Not a number value");
            return;
        }

        if (a == b || (a < 0 && b > 0) || (a > 100 && b > 100)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}