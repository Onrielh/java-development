package com.plurasight;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        LocalDate todate = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String firstformat = todate.format(fmt);
        System.out.println(firstformat);
        System.out.println(todate);
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM,d,yyyy");
        String secondformat = todate.format(fmt2);
        System.out.println(secondformat);
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE,MMM d,yyyy HH:mm");
        String thirdformat = today.format(fmt3);
        System.out.println(thirdformat);
    }
}
