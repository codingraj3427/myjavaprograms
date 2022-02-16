package com.company;
import java.util.*;
public class Java_Chapter6_pr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr1=new int[2][3];
        int [][]arr2=new int[2][3];
        int [][]arr3=new int[2][3];


      // Our first matrix for taking the user input from the user.
        System.out.println("Enter the first matrix");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.printf("Enter the element  [%d][%d]",i,j);
                arr1[i][j]=sc.nextInt();
            }
        }

      // Our second matrix for taking the user input from the user
        System.out.println("Enter the second matrix");
        for(int i=0;i<arr2.length;i++)

        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.printf("Enter the element  [%d][%d]",i,j);
                arr2[i][j]=sc.nextInt();
            }
        }


        //For displaying the first matrix

        System.out.println("The first matrix is:");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {

                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println("The second matrix is:");
        //For displaying the second matrix

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {

                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        //Now for adding two matrices we will write

        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[i].length;j++)
            {

                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }


        //Now displaying the entire matrix
        System.out.println("Haha now we have got the final matrix here heeh.");
        System.out.println("The sum of two matrix is:");
        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[i].length;j++)
            {

                System.out.print(arr3[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }



    }
}
