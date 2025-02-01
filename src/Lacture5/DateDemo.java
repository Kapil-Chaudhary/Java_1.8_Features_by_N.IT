package Lacture5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date(); // Wed Jul 03 14:49:05 IST 2024
        System.out.println(date);


        // dd/mm/yyyy

        // 1. Converting date to string

//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // "dd/MM/YYYY"
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy"); // 03/Jul/2024
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy"); // 03/July/2024
        String format = dateFormat.format(date);
        System.out.println(format);

        /// MMM -- month name
        //  MMMM --complete month name
        //  yy -- give last two dight of the year
        // yyyy -- 4 dight of the year
        // US (country - date format ) -- MM/dd/yyyy



        // 2. Converting string(date) to date

//        SimpleDateFormat sdg3 = new SimpleDateFormat("yyyy-MM-dd");
//        Date parseDate = sdg3.parse("2020-12-20"); // error
//        System.out.println(parseDate);


        java.sql.Date date1 = new java.sql.Date(20221203); // give long value
        System.out.println(date1); // 1970-01-01
    }
}
