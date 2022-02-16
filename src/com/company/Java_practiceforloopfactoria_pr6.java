package com.company;
import java.util.*;
public class Java_practiceforloopfactoria_pr6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        int i;
        System.out.println("Enter a number here");
        int number = sc.nextInt();
        for (i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println(factorial);


        int a=8;
        int j=1;
        int fact=1;
        while(j<=a)
        {
            fact=fact*j;
            j++;
        }
        System.out.println(fact);

    }
}