package com.siit.course.hw.c3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a year between 1900 and 2016");
        int year = keyboard.nextInt();
        if (year >= 1900 && year <= 2016){
             if (isLeapYear(year)){
                 System.out.println("February " + year + " has 29 days");
             }else{
                 System.out.println("February " + year + " has 28 days");
             }
        }else{
            System.out.println("Year is not between 1900 and 2016");
        }
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 != 0);
    }
}
