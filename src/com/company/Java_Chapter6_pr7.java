package com.company;

public class Java_Chapter6_pr7 {
    public static void main(String[] args) {
        int []arr={20,56,34,10,89};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[0]>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("The minimum element in the array is: "+min);
    }
}
