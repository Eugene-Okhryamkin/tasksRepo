package ru.vsu.okhryamkin.Task3;

import java.util.Scanner;

public class Main {
    public static final Square S1 = new Square(-6, -2, -2, 3);
    public static final Square S2 = new Square(1, 2, -2, 3);
    public static final Square S3 = new Square(-2, 1, 3, 6);
    public static final Square S4 = new Square(-2, 1, -4, -2);
    public static final HorizontalParabola P1 = new HorizontalParabola(-4, -3, -0.25);

    public static SimpleColor getColor(double x, double y) {
        SimpleColor ans = SimpleColor.ORANGE;
        if (S1.isPointInsideOfSquare(x,y) && P1.isPointRightOfParabola(x,y)) {
            ans = SimpleColor.GRAY;
        }
        if (S1.isPointInsideOfSquare(x,y) && !P1.isPointRightOfParabola(x,y)) {
            ans = SimpleColor.BLUE;
        }
        if (S2.isPointInsideOfSquare(x,y)) {
            ans = SimpleColor.GRAY;
        }
        if (S3.isPointInsideOfSquare(x,y)) {
            ans = SimpleColor.BLUE;
        }
        if (S4.isPointInsideOfSquare(x,y)) {
            ans = SimpleColor.GREEN;
        }

        return ans;
    }

    public static void printColorForPoint(double x, double y) {
        String color = getColor(x, y).toString();
        System.out.println(color);
    };

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("x = ");
        double x = io.nextDouble();

        System.out.print("y = ");
        double y = io.nextDouble();

        printColorForPoint(x, y);
    };

}
