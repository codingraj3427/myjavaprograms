package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class Java_Chapter6_pr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int number=sc.nextInt();
        boolean isanarray=false;
        int []arr={20,30,40,50,60};
        for(int i=0;i< arr.length;i++)
        {
            if(number==arr[i]) {
                isanarray = true;
                break;
            }

        }
        if(isanarray==true)
        {
            System.out.println("The element is present in the array");

        }
        else
        {
            System.out.println("the element is not present in the array");
        }

    }
}
