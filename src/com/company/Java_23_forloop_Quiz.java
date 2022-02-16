package com.company;
import java.util.*;
public class Java_23_forloop_Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }

        //similarly
        int x=10;
        for(int y=0;y<n;y++)
        {
            System.out.println(2*y+1);
        }

    }
}
