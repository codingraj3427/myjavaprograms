package com.company;

class cylinder {
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        double pi = 3.14;
        return 2 * pi * radius * (height + radius);
    }

    public double volume() {
        double pi = 3.14;
        return pi * radius * radius * height;
    }

    //Now  I am creating a constructor
    public cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
}



public class Chapter9_Practiceset_Q1 {
    public static void main(String[] args)
    {
        cylinder cy=new cylinder(5,2);
//
////        cy.setHeight(2);                //Setting the height of the cylinder is 2.
////        cy.setRadius(5);                //Setting the radius of the cylinder is 5.

        System.out.println("The height of the cylinder is="+cy.getHeight());
        System.out.println("The radius of the cylinder is="+cy.getRadius());
        System.out.println("The area of the cylinder is="+cy.area());
        System.out.println("The volume of the cylinder is="+cy.volume());


    }

}
