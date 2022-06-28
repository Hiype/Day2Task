package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean val;

        System.out.println("Input a boolean value");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextBoolean()) {
            val = sc.nextBoolean();
        } else {
            System.out.println("Not a boolean value");
            return;
        }

        System.out.println(!val);

    }
}