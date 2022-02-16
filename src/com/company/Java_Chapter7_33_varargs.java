package com.company;

public class Java_Chapter7_33_varargs {

    static int sum(int... arr)     //This is known as varargs function in java.
    {
        int sum=0;
        for(int a:arr)
        {
            sum=sum+a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome  to varArgs in java");
        System.out.println("The sum of the number 1 2 and 3 is : "+sum(1,2,3));
        System.out.println("The sum of the number 1 2 3 and 4 is : "+sum(1,2,3,4));
        System.out.println("The sum of the number 1 2 3 4 and 5 is : "+sum(1,2,3,4,5));


    }
}
