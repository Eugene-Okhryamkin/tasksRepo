package Task2;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void getDate(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month, day);

        calendar.set(year, month, day);

        System.out.println(calendar.getTime());
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = in.nextInt();

        System.out.print("Введите месяц: ");
        int month = in.nextInt();

        System.out.print("Введите день: ");
        int day = in.nextInt();

        getDate(year, month, day);
    };
}
