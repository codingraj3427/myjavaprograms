package com.company;

import java.sql.SQLOutput;

public class Chapter3_practice_q4 {
    public static void main(String[] args) {
        String name="Hello my name is Rajarshi Chakraborty      this contains double and tripple spaces";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
        System.out.println(name.length());
        if(name.startsWith("H"))
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("bye");
        }

        String name1="Hello dear,\n\tI am Rajarshi Chakraborty\n how ae you.";
        System.out.println(name1);
    }
}
