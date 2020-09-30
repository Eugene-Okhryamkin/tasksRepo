package ru.vsu.okhryamkin.Task2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalendarTask calendarTask = new CalendarTask();
        Scanner io = new Scanner(System.in);

        System.out.print("Месяц 2020 года: ");
        int month = io.nextInt();

        System.out.print("День 2020 года: ");
        int day = io.nextInt();

        System.out.println(calendarTask.getInfoAboutDate(month, day));
    };
}
