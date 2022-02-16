package com.company;
import java.util.Scanner;

public class Java_13_Strings {
    public static void main(String[] args) {
//      String name= new String("Rajarshi");
        String name= "Rajarshi";
        System.out.print("The name is: "); //This line will not take a space.
//        System.out.println(name);
        int a=90;
        System.out.printf("%d",a);
        System.out.printf("%s",name);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name here");
        String st=sc.nextLine();
        System.out.println(st);

    }
}
