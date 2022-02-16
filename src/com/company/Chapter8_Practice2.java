package com.company;



class Square
{
    int side;
    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;
    }

}

class rectangle
{
    int l,b;
    public int area()
    {
        return l*b;
    }

    public int perimeter()
    {
        return 2*(l+b);
    }

}
public class Chapter8_Practice2 {

    public static void main(String[] args) {
        Square sq=new Square();
        rectangle rc=new rectangle();
        sq.side=6;
        rc.l=10;
        rc.b=6;
        System.out.println("The area and perimeter of a rectangle is=");
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
        System.out.println("The area and perimeter of a square is=");
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
