package com.company;
import java.util.*;
public class Java_18_Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age here");
        int age=sc.nextInt();

        switch(age)
        {
            case 18:
            {
                System.out.println("You can drive the car");
            }
            break;
            case 21:
            {
                System.out.println("You can not drive the truck");

            }
            break;

            case 30:
            {
                System.out.println("You are a pro");
            }
            break;
            default:
            {
                System.out.println("Enjoy your life");
            }
        }
    }
}
