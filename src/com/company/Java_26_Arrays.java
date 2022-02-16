package com.company;

public class Java_26_Arrays {
    public static void main(String[] args) {
//        int [] marks=new int[5];    // So here the array memory is 5 and one block of the array will take 4 bytes of memory
//        marks[0]=70;
//        marks[1]=90;
//        marks[2]=100;
//        marks[3]=110;
//        marks[4]=120;
        int []marks={20,30,40,50,60};

        for(int i=0;i< marks.length;i++)
        {
            System.out.print(marks[i]);
        }
        System.out.print(marks[0]);


    }
}
