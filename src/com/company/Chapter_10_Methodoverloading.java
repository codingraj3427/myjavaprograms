package com.company;


class A
{
    public int raj()
    {
      return 4;
    }

    public void meth2()
    {
        System.out.println("I am method 2 of class A");
    }

}

class B extends A
{
    @Override
    public void meth2()
    {
        System.out.println("I am method 2 of class B");
    }

    public void meth3()
    {
        System.out.println("I am method 3 of class B");
    }
}


public class Chapter_10_Methodoverloading {

    public static void main(String[] args) {

        A one=new A();
        one.meth2();
        B b=new B();
        b.meth2();

    }

}
