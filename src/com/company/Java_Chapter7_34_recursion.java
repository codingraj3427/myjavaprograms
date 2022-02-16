package com.company;
import java.util.*;
public class Java_Chapter7_34_recursion {
    static int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;

        else{
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter a number here");
        number=sc.nextInt();
        int result=factorial(number);
        System.out.println("The factorial of the number is"+result);

    }
}
