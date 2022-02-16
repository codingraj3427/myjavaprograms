package com.company;
import java.util.*;
// So here we have to print a pattern like this
//****
//***
//**
//*
public class Java_25_Practiceset_pr1_pr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter a digit");
        int n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");

        }


        //Practice problem 2
        System.out.println("Enter a number");
        int y= sc.nextInt();
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of n natural number is"+sum);
    }


}
