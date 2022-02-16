package com.company;

public class Java_Chapter6_pr6 {
    public static void main(String[] args) {
        int []arr={20,30,40,50,60};
        int max=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The greatest element in the array is: "+max);
    }
}
