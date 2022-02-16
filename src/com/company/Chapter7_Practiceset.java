package com.company;
import java.util.*;

public class Chapter7_Practiceset
{


    static void multiplication(int n) {
        int i;
        int result;

        for (i = 1; i <= 10; i++) {
            result = n * i;
            System.out.printf("%d x %d =%d \n", n, i, result);
        }
    }

    static void pattern(int n)

    {
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    static int sum(int n)
    {   // THis is known as base condition in case of recurssion
        if (n== 1)
        {
            return 1;
        }
        else
        {
         return n+sum(n-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to multiply");
        int a=sc.nextInt();
        multiplication(a);
      //Now the second problem

        pattern(9);


        //Third problem to find the sum of n natural number
        int result= sum(5);
        System.out.println(result);


    }
}
