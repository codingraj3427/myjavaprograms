package com.company;


class Ekclass
{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v)
    {
        a=v;
    }

}
public class Chpater10_This_super {

    public static void main(String[] args)
    {

        Ekclass e=new Ekclass(5);
        System.out.println(e.getA());

    }
}
