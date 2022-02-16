package com.company;
import java.util.*;
public class Java_19_chapter4practice
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total marks");
        float total=sc.nextFloat();
        System.out.println("Enter the marks in Bengali");
        int marks1=sc.nextInt();
        System.out.println("Enter the marks in English");
        int marks2=sc.nextInt();
        System.out.println("Enter the marks in Mathematics");
        int marks3=sc.nextInt();
        float Total_percentage=((marks1+marks2+marks3)*100)/total;
        System.out.println("The total percentage obtained in the exam"+Total_percentage);

        if(Total_percentage>40 && marks1>33 && marks2>33 && marks3>33)
        {
            System.out.println("The student is passed");
        }
        else
        {
            System.out.println("The student is not passed");
        }
    }
}
