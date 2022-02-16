package com.company;
import java.util.*;
public class Java_19_chapter4practice_question3 {
    public static void main(String[] args) {
        float tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total income ");
        float income=sc.nextInt();
        if(income<2.5f)
        {
            tax=tax+0;
            System.out.println("No need to pay a tax");
        }
        else if(income>=2.5f && income<=5.0f)
        {
            tax= tax+0.05f*(income-2.5f);
            tax=tax*100000;
            System.out.println("The total tax paid by the employee is "+tax);
        }

        else if(income>5f && income<=10f)
        {
            tax= tax+0.05f*(5f-2.5f);
            tax= tax+0.2f*(income-5f);
            tax=tax*100000;
            System.out.println("The total tax paid by the employee is "+tax);

        }
        else if(income>10f)
        {
            tax= tax+0.05f*(5f-2.5f);
            tax= tax+0.2f*(10f-5f);
            tax= tax+0.3f*(income-10f);
            tax=tax*100000;
            System.out.println("The total tax paid by the employee is "+tax);
        }




    }
}
