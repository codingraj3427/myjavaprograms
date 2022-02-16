package com.company;


class MyEmployee1
{
    private int id;
    private String name;

    public MyEmployee1(String name,int id)
    {
//        id=45;
//        name="Rajarshi";
        System.out.println(name);
        System.out.println(id);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {this.name =n;}

    public void setId(int n)
    {this.id=n;}

    public int getId()
    {
        return id;
    }

}


public class Java_chapter9_Constructors {

    public static void main(String[] args)
    {
        MyEmployee1 raj=new MyEmployee1("Rajarshi",122);
        System.out.println(raj.getName());
        System.out.println(raj.getId());




    }
}
