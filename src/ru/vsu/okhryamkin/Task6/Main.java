package ru.vsu.okhryamkin.Task6;

import java.util.Locale;
import java.util.Scanner;
import static java.util.Locale.ROOT;

public class Main {

    public static double part(double prev, double x, int i) {
        int ans = (i % 2 == 0)? 1 : -1;
        return ans * prev * x;
    }

    public static void main(String[] args) {
        int i = 1;
        double prev;
        double sumN = 1;
        double sumABS = 1;
        double sumABSSecond = 1;
        double function;
        double checker = 0;
        double element;
        int j = 0;
        Locale.setDefault(ROOT);
        Scanner reader = new Scanner(System.in);

//input from stream------------------------------—
        System.out.print("x = ");
        double x = reader.nextDouble();
        element = x;
        System.out.print("n = ");
        int n = reader.nextInt();
        System.out.print("e = ");
        double e = reader.nextDouble();

//logic------------------------------------------—
        /*sumN = element;
        sumABS = (x>e)? element: 0;
        sumABSSecond = (x>e)? element: 0; */
        if (Math.abs(x)<1) {
            for (i = 1; ; i++) {
                prev = element;
                element = part(prev, x, i);

                if (i <= n) {
                    sumN = sumN + element;
                    j++;
                }

                if (Math.abs(element) > e) {
                    sumABS = sumABS + element;
                    j++;
                }

                if (Math.abs(element) > e / 10) {
                    sumABSSecond = sumABSSecond + element;
                    j++;
                }

                if (checker == j) {
                    break;
                }
                checker = j;
            }

            function = 1/(1+x);

//output for stream----------------------------—
            System.out.printf("1. sumN = %.10f%n2. sumABS = %.10f%n3. sumABS2 = %.10f%n4. function = %.10f%n", sumN, sumABS, sumABSSecond, function);
        } else {
            System.out.println("out of range");
        }
    }
}
