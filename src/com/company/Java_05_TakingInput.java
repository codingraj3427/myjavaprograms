package com.company;
import java.util.Scanner;
public class Java_05_TakingInput {
    public static void main(String[] args) {


        System.out.println("Taking input from the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        System.out.println("Enter number 3");
        float c=sc.nextFloat();
        float sum=a+b+c;
        System.out.println("The sum of the number is");
        boolean b1=sc.hasNextInt();
        // For taking the string input from the user
        String str= sc.next();


        System.out.println(b1);
        System.out.println(sum);

    }
}
