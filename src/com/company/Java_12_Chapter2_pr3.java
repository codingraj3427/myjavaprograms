package com.company;
import java.util.Scanner;
public class Java_12_Chapter2_pr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("The first number is greater than the second one");
        }
        else
        {
            System.out.println("The second number is greater than the first number");
        }
    }
}
