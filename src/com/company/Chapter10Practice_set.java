package com.company;

class circle
{
    public int radius;

    //Here we are creating a constructor
    circle(int r )
    {
        this.radius=r;
    }

    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }

    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.radius;
    }


}

class cylinder1 extends circle
{

    public int height;
    cylinder1(int r,int h)
    {
         super(r);
         this.height=h;
    }

    public double radius()
    {
        return 2*Math.PI*radius*this.radius;
    }



    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }

}


public class Chapter10Practice_set {
    public static void main(String[] args)

    {
        circle obj=new circle(4);
        cylinder1 obj2=new cylinder1(5,7);
        System.out.println(obj.area());
        System.out.println(obj.volume());
        System.out.println(obj2.radius());
        System.out.println(obj2.volume());





    }
}
