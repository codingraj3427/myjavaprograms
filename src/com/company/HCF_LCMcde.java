package com.company;
import java.util.*;

public class HCF_LCMcde {
    public static int HCF(int a, int b)
    {
        if (a==b)
            return a;
        else if(a>b)
            return HCF(a-b,b);
        else
            return HCF(a,b-a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,hcf;
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        hcf=HCF(a,b);
        System.out.println("HCF="+hcf);
    }
}
