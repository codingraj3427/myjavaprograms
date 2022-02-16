package com.company;

import org.w3c.dom.ls.LSOutput;

class Tommy
{
    public void hit()
    {
        System.out.println("hiting the enemy");
    }

    public void run()
    {
        System.out.println("Player is running");
    }

    public void fire()
    {
        System.out.println("Hiting on the enemy");
    }
}
public class Chapter8_Practiice5 {
    public static void main(String[] args) {


        Tommy tm = new Tommy();
        tm.fire();
        tm.hit();
        tm.run();
    }
}
