package com.company;

abstract class pen{

    abstract void write();
    abstract void refill();
}


class Monkey{
    void jump()
    {
        System.out.println("Monkey is jumping.");
    }

    void Bite()
    {
        System.out.println("Monkey is biting me.");
    }


}


interface BasicAnimal
{
    void step();
    void eat();
}


class Human extends Monkey implements BasicAnimal
{
    public void step()
    {
        System.out.println("Stepping forward.....");
    }

    public void eat()
    {
        System.out.println("Eating......");
    }


}




class Fountainpen extends pen
{

      void write()
      {
          System.out.println("This is an writing function");
      }

      void refill()
      {
          System.out.println("This is an refill function");

      }

      void changenib()
      {
          System.out.println("This is change nib function");
      }




}


public class Chapter11PracticeSet {
    public static void main(String[] args) {
        Human h=new Human();
        h.step();
        h.eat();
        h.jump();
        h.Bite();

        //Now demonstrating polymorphism using monkey class

        Monkey m=new Human();
        m.Bite();
        m.jump();

    }
}
