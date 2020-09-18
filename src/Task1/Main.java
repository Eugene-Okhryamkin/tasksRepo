package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sum task = new Sum();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int inputNumber = in.nextInt();

        System.out.println("Сложение трех последних чисел: " + task.sum(inputNumber));
    };
}
