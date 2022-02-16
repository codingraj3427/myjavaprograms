package com.company;
import java.util.*;
public class Java_Chapter6_pr3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int []marks=new int[5] ;
         int sum=0,avg;
        System.out.println("Enter the 5 different marks in physics");
         for(int i=0;i<marks.length;i++)
         {
             marks[i]= sc.nextInt();
         }

         for(int i=0;i<marks.length;i++)
         {
             sum=sum+marks[i];
         }
         avg=sum/marks.length;
         System.out.println("The average marks of the students are"+avg);

    }
}
