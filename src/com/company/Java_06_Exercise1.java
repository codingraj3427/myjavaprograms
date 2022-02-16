package com.company;
import java.util.Scanner;
public class Java_06_Exercise1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Total marks of the exam");
        float totalMarks=sc.nextFloat();

        System.out.println("Enter the marks of English");
        float marks1=sc.nextFloat();

        System.out.println("Enter the marks of Bengali");
        float marks2=sc.nextFloat();

        System.out.println("Enter the marks of History");
        float marks3=sc.nextFloat();

        System.out.println("Enter the marks of Geography");
        float marks4=sc.nextFloat();

        System.out.println("Enter the marks of Biology");
        float marks5=sc.nextFloat();

        System.out.println("Enter the marks of Physical Science");
        float marks6=sc.nextFloat();

        double sum=(marks1+marks2+marks3+marks4+marks5);

        double percentage=(sum/totalMarks)*100;
        System.out.println("The percentage obtained by the student is" +percentage);

    }
}
