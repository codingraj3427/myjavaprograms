package com.company;

public class Java_Chapter6_pr8 {
    public static void main(String[] args) {
        boolean Issorted=true;
        int []arr={20,10,56,34,89};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                Issorted=false;
                break;
            }
        }
        if(Issorted)
        {
            System.out.println("The array is sorted");

        }

        else
        {
            System.out.println("The array is not sorted");
        }
    }
}
