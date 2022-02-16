package com.company;


class base1 {

    base1() {

        System.out.println("I am a constructor");
    }
    base1(int a)
    {
        System.out.println("I am a constructor with value of a as:"+a);
    }

}

class derived1 extends base1
{


    derived1()
    {
//        super(90);
        System.out.println("i am a derived class constructor");
    }
    derived1(int x,int y)
    {
        super(x);
        System.out.println("I am an overloaded constructor with a value:"+y);
    }

}

class Childofderived extends derived1
{
    Childofderived()
    {
        System.out.println(" I am a child of derived constriuctor");
    }

    Childofderived (int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am an over loaded constructor with value of Z as:"+z);
    }

}

public class Chapter10_Inheritence_Constructor {

    public static void main(String[] args) {
//        base1 b=new base1();
//        derived1 d=new derived1();
//        derived1 d=new derived1(14,9);
          Childofderived cd=new Childofderived();
    }
}
