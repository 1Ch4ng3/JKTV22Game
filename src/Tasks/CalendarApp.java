/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class CalendarApp {

    private final Scanner scanner;
    private final Calendar calendar;

    public CalendarApp() {
        this.scanner = new Scanner(System.in);
        this.calendar = Calendar.getInstance();
    }

    public CalendarApp(Scanner scanner) {
        this.scanner = scanner;
        this.calendar = Calendar.getInstance();
    }

    public void showCalendar() {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Месяцы в Calendar начинаются с 0, поэтому добавляем 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);
        System.out.println("Текущее время: " + String.format("%02d:%02d:%02d", hour, minute, second));
        System.out.println("Текущая неделя года: " + weekOfYear);
    }
}
    

