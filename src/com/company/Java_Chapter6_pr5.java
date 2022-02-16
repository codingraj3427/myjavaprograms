package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Java_Chapter6_pr5 {
    public static void main(String[] args) {
        int[] arr = {20, 89, 45, 67, 23, 45};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }





// Now reversing an array by without changing those index position
    int temp;
    int l=arr.length;
    int n=l/2;
    for(int i=0;i<n;i++)
    {
        temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
    }

    for(int i=0;i<l;i++)
    {
        System.out.print(" "+arr[i]);
    }









    }
}