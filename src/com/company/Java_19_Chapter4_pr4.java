package com.company;
import java.util.Scanner;
public class Java_19_Chapter4_pr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of day");
        int day=sc.nextInt();

        switch(day)
        {
            case 1:
            {
                System.out.println("Monday");
            }
            break;

            case 2:
            {
                System.out.println("Tuesday");
            }
            break;


            case 3:
            {
                System.out.println("Wednesday");
            }
            break;


            case 4:
            {
                System.out.println("Thursday");
            }
            break;


            case 5:
            {
                System.out.println("Friday");
            }
            break;

            case 6:
            {
                System.out.println("Saturday");
            }
            break;

            case 7:
            {
                System.out.println("Sunday");
            }
            break;
            default:
                System.out.println("you have entered a wrong number");
        }


        //Now by advance switch case we can do this also
         switch(day)
         {
             case 1-> System.out.println("Monday");
             case 2-> System.out.println("Tuesday");
             case 3-> System.out.println("Wednesday");
             case 4-> System.out.println("Thursday");
             case 5-> System.out.println("Friday");
             case 6-> System.out.println("Saturday");
             case 7-> System.out.println("Sunday");


         }
    }
}
