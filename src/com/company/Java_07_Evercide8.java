package com.company;
import java.util.Scanner;
public class Java_07_Evercide8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float kilometer;
        System.out.println("Enter the kilometers for conversation to mile");
        kilometer=sc.nextFloat();
        // kilometer to mile conversation
        double Miles=0.621*kilometer;
        System.out.println(kilometer +"is equal to "+Miles+"miles");

    }
}
