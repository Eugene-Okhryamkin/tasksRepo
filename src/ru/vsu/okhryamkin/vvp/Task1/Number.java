package ru.vsu.okhryamkin.vvp.Task1;

public class Number {

    private int sliceNumber(int number) {
        return number % 1000;
    };

    public int sum(int number) {
        int result = 0;
        int shortNumber = this.sliceNumber(number);

        while (shortNumber > 0) {
            result += shortNumber % 10;
            shortNumber /= 10;
        }

        return result;
    };
}
