package com.company;
import java.util.*;
public class Java_12_Chapter2_pr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int u,v,a,s,resultant;
        System.out.println("Enter the value of u:");
        u=sc.nextInt();
        System.out.println("Enter the value of v:");
        v=sc.nextInt();
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of s:");
        s=sc.nextInt();
        resultant=((v*v)-(u*u))/(2*a*s);
        System.out.println("The result is: "+resultant);
    }
}
