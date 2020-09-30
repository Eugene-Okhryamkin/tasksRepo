package ru.vsu.okhryamkin.Task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalendarTask {

    private List<String> holidays = new ArrayList<>();

    public CalendarTask() {
        this.initHolidays();
    };

    private void initHolidays() {
        //january holidays
        for(int i = 1; i <= 8; i++) {
            this.holidays.add("2020.01." + "0" + i);
        };

        //february holidays
        this.holidays.add("2020.02.23");
        this.holidays.add("2020.02.24");

        //march holidays
        this.holidays.add("2020.03.08");
        this.holidays.add("2020.03.09");

        //may holidays
        for(int i = 1; i <= 5; i++) {
            this.holidays.add("2020.05." + "0" + i);
        };

        for(int i = 9; i <= 11; i++) {
            this.holidays.add("2020.05." + "0" + i);
        };

        //june holidays
        this.holidays.add("2020.06.12");

        //november holidays
        this.holidays.add("2020.11.04");

    };

    private boolean isHoliday(String date) {
        System.out.println(date);
        for(String holiday : this.holidays) {
            if(holiday.equals(date)) {
                return true;
            };
        };

        return false;
    };

    private boolean isWeekend(int month, int day) {
        LocalDate date = LocalDate.of(2020, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if(dayOfWeek.equals(DayOfWeek.SUNDAY) || dayOfWeek.equals(DayOfWeek.SATURDAY)) {
            return true;
        };

        return false;
    };

    public String getInfoAboutDate(int month, int day) {
        String formatMonth = "" + month;
        String formatDay = "" + day;

        if(month < 10) {
            formatMonth = "0" + formatMonth;
        }

        if(day < 10) {
            formatDay = "0" + formatDay;
        };

        String formatDate = "2020." + formatMonth + "." + formatDay;


        boolean isHoliday = this.isHoliday(formatDate);
        boolean isWeekend = this.isWeekend(month, day);

        if(isHoliday || isWeekend) {
            return "Выходной";
        };

        return "Будний день";
    };
}
