package com.company;

class employee1

{
    int salary;
    String name;
    public int salary()
    {
        return salary;
    }

    public String name()
    {
        return name;
    }

    public void setName(String n)
    {
        name=n;
    }
}

class cellphone
{
    public void ringing()
    {
        System.out.println("ringing......");
    }
    public void vibrating()
    {
        System.out.println("vibrating....");

    }

    public void callFriend()
    {
        System.out.println("Calling Chandrima......");
    }

}


public class Chapter8_Practice {
    public static void main(String[] args)
    {

        //Problem1
        employee1 Rajarshi=new employee1();
        cellphone Redmi=new cellphone();
        Redmi.callFriend();
        Redmi.ringing();
        Redmi.vibrating();

        Rajarshi.setName("Rajarshi Chakraborty");
        Rajarshi.salary=10000;
        System.out.println(Rajarshi.salary());
        System.out.println(Rajarshi.name());


    }
}
