package com.company;
import java.util.*;
public class Java_19_Chapter4_pr6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website name");
        String website=sc.next();
        if(website.endsWith(".com"))
        {
            System.out.println("The website is a commercial website");
        }

        else if(website.endsWith(".org"))
        {
            System.out.println("The website is an organization website");

        }

        else if(website.endsWith(".in"))
        {
            System.out.println("The website is an indian website");

        }


    }
}
