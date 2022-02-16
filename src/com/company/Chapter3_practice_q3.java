package com.company;
import java.util.*;

public class Chapter3_practice_q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String str=sc.next();
        System.out.println("Dear\t"+str+"\tThanks a lot");


// This is an another way to write the program


        String name="Dear <|name|> thanks a lot";
        name=name.replace("<|name|>","Rajarshi");
        System.out.println(name);

    }
}
