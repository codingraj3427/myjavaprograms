package com.company;
import java.util.*;

public class Java_Fibonacci
{

    static int fib(int number)
    {
        if(number<=1)
        {
            return number;
        }
        return fib(number-1)+fib(number-2);

    }
    static void fibonacci(int n)
    {
        int sum, n1 = 0, n2 = 1;
        System.out.print(" " + n1);
        System.out.print(" " + n2);
        for (int i = 0; i < n; i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;

        }
    }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            int Result;
            System.out.println("Enter a number for fibonacci series");
            int number=sc.nextInt();
            fibonacci(number);
            Result=fib(number);
            System.out.println(Result);


        }

    }
