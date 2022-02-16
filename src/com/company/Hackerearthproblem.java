package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Hackerearthproblem {
    public static void main(String[] args) {

        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println(" Enter the second number");
        int b=sc.nextInt();
        String [] str={"one","two","three","four","five","six","seven","eight","nine","even","odd"};
        for(int i=a;i<=b;i++)
        {
            if(i<=9)
            {
                System.out.println(str[i-1]);
            }
            else
            {
                result=str[9+(i%2)];
                System.out.println(result);
            }

        }

    }
}
