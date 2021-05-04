package ru.vsu.okhryamkin.vvp.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Number number = new Number();

        System.out.print("Число: ");
        double num = io.nextInt();

        System.out.print("Степень: ");
        int pow = io.nextInt();

        double sum = number.sum(num, pow);

        System.out.println(sum);

    }
}
