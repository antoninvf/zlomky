package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float total = 0;
        float count = 0;

        System.out.println("Zadej číslo:");
        int input = sc.nextInt();

        for (float i = 1; i < input + 1; i++) {
            count = 1 / i;
            total += count;
            System.out.println("1/" + (int) i + " => " + count);
        }
        System.out.println("Celkem => " + total);
    }
}
