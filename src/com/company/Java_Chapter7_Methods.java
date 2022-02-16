package com.company;
import java.util.*;
public class Java_Chapter7_Methods {
     static int logic(int x,int y)
    {
        int c;
        c=(x+y)/2;
        return c;
    }

    public static void main(String[] args) {
//        Java_Chapter7_Methods obj=new Java_Chapter7_Methods();//By another method we can call this.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the seconf number");
        int b=sc.nextInt();
        int result =logic(a,b);
        System.out.println("The average of the number is "+result);



        //Method calling by method invocation in java programming language
//        Java_Chapter7_Methods obj=new Java_Chapter7_Methods();
    }
}
