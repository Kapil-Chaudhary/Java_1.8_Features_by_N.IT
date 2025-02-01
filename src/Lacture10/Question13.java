package Lacture10;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question13 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 13. What is the average salary and total salary of the whole organization?
//        Stream<Double> doubleStream = employeeList.stream().map(emp -> emp.getSalary());
//
//        Double average = doubleStream.collect(Collectors.averagingDouble(i -> i));
//        System.out.println("average : " + average);
//
//        Double totalSum  = doubleStream.collect(Collectors.summingDouble(i -> i)); // error -> stream has already been operated upon or closed
//        System.out.println("total Sum : " + totalSum);



        // 2
        DoubleSummaryStatistics employeeSalaryStatistics= employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());



    }
}
