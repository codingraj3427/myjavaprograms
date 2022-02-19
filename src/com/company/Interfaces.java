package com.company;


interface Bicycle
{   int a=90;
    void applyBreak(int decrement);
    void speedup(int increment);

}

//We can use multiple interfaces but we can not use multilple abstracts

interface BlowHorn{
    int b=10000;
    void applyHorn();
    void applyHorn2();

}
//Now we are defining a class Avon cycle and which is implementing the class Bicycle

class avonCycle implements Bicycle,BlowHorn
{
    public void blowhorn()
    {
        System.out.println("Hello my nmame is pooo pooo");
    }

    public void applyBreak(int decrement)
    {
        System.out.println("Applying break here........");
    }

    public void speedup(int increment)
    {
        System.out.println("Helooo please speedup");
    }

    public void applyHorn()
    {
        System.out.println("Hello this is horn 1 here");
    }

    public void applyHorn2()
    {
        System.out.println("Hello this is horn 2 here.");
    }




}

public class Interfaces {
    public static void main(String[] args) {

        avonCycle createCycle=new avonCycle();
        createCycle.applyBreak(9);
        System.out.println(createCycle.a);  // this is allowed in Java
        //createCycle.a=90;  // this is not allowed wed in java program.

        System.out.println(createCycle.b);

        createCycle.applyHorn2();
        createCycle.applyHorn();

    }
}
