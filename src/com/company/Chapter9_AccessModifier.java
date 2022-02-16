package com.company;

class MyEmployee
{
   private int id;
   private String name;

   public String getName()
    {
        return name;
    }
   public void setName(String n)

    {

        this.name =n;
    }

    public void setId(int n)
    {

        this.id=n;
    }

    public int getId()
    {
        return id;
    }

}



public class Chapter9_AccessModifier {
    public static void main(String[] args) {
        MyEmployee raj=new MyEmployee();
        raj.setName("Rajarshi Chakraborty");
        System.out.println(raj.getName());


    }
}
