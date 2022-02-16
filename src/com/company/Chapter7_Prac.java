package com.company;

public class Chapter7_Prac {
    //0, 1, 1, 2, 3, 5, 8, 13, 21
    static int fibonaci(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }

        else
        {
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }

    static void patter2(int n)
    {
        for(int i=n;i>0;i--)
        {
            {
                for (int j = 0; j < i; j++)
                    System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args)

    {
//        patter2(5);

        int result=fibonaci(8);
        System.out.println(result);
    }

}
