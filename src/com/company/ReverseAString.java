package com.company;

class Reverse{

    void reverseString(int []arr,int start,int end)
    {
        int temp;

        while (arr[start] < arr[end]) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;


        }
    }

         void printArray(int []arr)
        {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }



public class ReverseAString {
    public static void main(String[] args) {


        Reverse R = new Reverse();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        R.printArray(arr);
        R.reverseString(arr,0,6);
        R.printArray(arr);


    }
}
