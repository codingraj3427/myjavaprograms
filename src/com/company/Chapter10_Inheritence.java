package com.company;


class joy
{
    int a;

    public int getA() {
        System.out.println("I am setting A now");
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void print()
    {
        System.out.println("I am a function");
    }
}



//This is an example of inheritence in Java Program.Which is extending the parent or Super class


class derived extends joy
{
    public int y;

    public int getY() {
        System.out.println("I am setting Y now ");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


//This is our main class in java program

public class Chapter10_Inheritence
{
    public static void main(String[] args)
    {
       joy j=new joy();
       j.setA(12);
       System.out.println(j.getA());

        derived d=new derived();
        d.setY(10);
        System.out.println(d.getY());

    }



}
