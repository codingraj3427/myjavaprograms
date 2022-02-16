package com.company;

public class Java_29_Chapter6_pr1 {
    public static void main(String[] args) {
        float []arr={100,90,70,80,59};
        float sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum of all the marks are"+sum);
    }
}
