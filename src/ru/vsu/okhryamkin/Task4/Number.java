package ru.vsu.okhryamkin.Task4;

public class Number {
    public double sum(double num, int pow) {
        double result = 0;
        for(int i = 0; i <= num; i++) {
            result += Math.pow(num, pow);
        };

        return result;
    };
}
