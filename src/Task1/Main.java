package Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Number num = new Number();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        System.out.println("Сложение трех последних чисел: " + num.sum(in.nextInt()));
    }

}
