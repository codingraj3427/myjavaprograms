package com.company;
import java.util.*;
public class Java_19_cahpter4_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        double year= sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            System.out.println("The year is a leap_year");
        }
        else
        {
            System.out.println("The year is not a leap_year");
        }

    }
}
