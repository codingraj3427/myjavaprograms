package com.company;


class employee
{
    int salary;
    int id;
    String name;
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is"+name);

    }

    public void getSalary()
    {
        System.out.println("My salary is"+salary);
    }

}

public class Chapter_8_OOPS {

    public static void main(String[] args)
    {
        employee Chandrima =new employee();
        employee Rajarshi=new employee();

//      Setting attributes for Rajarshi
        Rajarshi.name="Rajsrshi";
        Rajarshi.id=212358;
        Rajarshi.salary=1000000;

//      Setting attributes for Chandrima
        Chandrima.name="Chandrima";
        Chandrima.id=212328;
        Chandrima.salary=200000;

        Rajarshi.printDetails();
        Chandrima.printDetails();
        Rajarshi.getSalary();
        Chandrima.getSalary();
    }
}
