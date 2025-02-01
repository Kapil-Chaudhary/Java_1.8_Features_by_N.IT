package Lacture5;

import java.time.*;
import java.util.Date;

public class NewDateDemo {

    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1); // Wed Jul 03 23:28:15 IST 2024


        // LocalDate is final class 
        LocalDate date = LocalDate.now()  ;
        System.out.println(date); // 2024-07-03

        LocalDate date1 = date.plusDays(3);
        System.out.println(date1); // add 3 days to the current date - 2024-07-06


        LocalDate date2 = date.plusMonths(1);
        System.out.println(date2); // 2024-08-03


        LocalDate localDate = date.plusYears(2);
        System.out.println(localDate); // add 2 year to current year - 2026-07-03


        // same as about
//        LocalDate localDate1 = date.plusWeeks(2);

        LocalDate parse = LocalDate.parse("2021-12-22");
        boolean leapYear = parse.isLeapYear();
        System.out.println("is leap year : " + leapYear); // is leap year : false

        boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
        System.out.println(before); // true






        // ------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------");

        LocalTime time = LocalTime.now();
        System.out.println(time); // 23:37:19.898332

        LocalTime time1 = time.plusHours(2);
        System.out.println(time1); // add 2 hour



        // ------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------");

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime); // 2024-07-03T23:39:00.715741100



        // ------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------");

        // period between 2 dates
        Period period = Period.between(LocalDate.parse("1999-12-11"), LocalDate.now());
        System.out.println(period); // P24Y6M22D


        // duration between times
        Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
        System.out.println(duration); // PT5H46M36.4017557S



        // ------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------");
        
        // to represent dates this as well 
        LocalDate of = LocalDate.of(1999, 06, 04);
        System.out.println(of); // 1999-06-04
    }
}
