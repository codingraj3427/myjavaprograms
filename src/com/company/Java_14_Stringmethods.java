package com.company;

public class Java_14_Stringmethods {
    public static void main(String[] args) {


        String a = "Harry";
        String a1 = new String("Harry");
        System.out.println(a);

    int length=a.length();
        String lower=a.toLowerCase();
        String upper=a.toUpperCase();
        String trim=a.trim();
        String slicing=a.substring(1,3);
        String replace= a.replace('r','p');
        String replace2=a.replace("rry","ier");
        System.out.println(replace2);
        System.out.println(replace);
        System.out.println(slicing);
        System.out.println(length);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(trim);
        String modifiedname="Rajarshi";
        System.out.println(modifiedname.charAt(3));
        System.out.println(modifiedname.indexOf("p",8));
        System.out.println(modifiedname.lastIndexOf("u"));
        System.out.println(modifiedname.equals("Rajarshi"));
        System.out.println(modifiedname.equalsIgnoreCase("rajarshi"));


    }
}

