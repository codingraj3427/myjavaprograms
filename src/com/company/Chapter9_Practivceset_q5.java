package com.company;


class rectangle1
{
    private int length;
    private int breadth;

    public rectangle1()
    {
        this.length = 4;
        this.breadth =5;
    }

    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}



public class Chapter9_Practivceset_q5 {
    public static void main(String[] args) {


        rectangle1 rec=new rectangle1(9,12);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}
