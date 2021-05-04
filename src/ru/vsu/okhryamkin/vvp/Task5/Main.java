package ru.vsu.okhryamkin.vvp.Task5;

import java.util.Scanner;

public class Main {

    public static char symbolToPrint(int i, int j, boolean sup) {
        char output = ' ';
        if (i % 4 == 1 || i % 4 == 2) {
            if (sup && j % 2 == 1) {
                output = 'a';
            }
            if (sup && j % 2 == 0) {
                output = 'b';
            }
            if (!sup && j % 4 == 1) {
                output = 'c';
            }
            if (!sup && j % 4 == 2) {
                output = 'c';
            }
            if (!sup && j % 4 == 3) {
                output = 'd';
            }
            if (!sup && j % 4 == 0) {
                output = 'd';
            }
        } else {
            if (sup && j % 2 == 1) {
                output = 'b';
            }
            if (sup && j % 2 == 0) {
                output = 'a';
            }
            if (!sup && j % 4 == 1) {
                output = 'd';
            }
            if (!sup && j % 4 == 2) {
                output = 'd';
            }
            if (!sup && j % 4 == 3) {
                output = 'c';
            }
            if (!sup && j % 4 == 0) {
                output = 'c';
            }
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean sup = true;

        System.out.print("w = ");
        int w = scan.nextInt();
        System.out.print("h = ");
        int h = scan.nextInt();

        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w - i + 1; j++) {
                System.out.print(symbolToPrint(i, j, sup));
            }
            System.out.println();
            sup = !sup;
        }
    }
}
