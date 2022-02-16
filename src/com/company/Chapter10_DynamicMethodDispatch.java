package com.company;


class Phone
{

// This is a greet Method
    public void greet()
    {
        System.out.println("Good Morning");
    }
//This is a name method;

    public void name()
    {
        System.out.println("Turning on the Nokia");
    }
}



//////////////////////////////////////////////////////////////\///////


//This is an example of inheritance class.

class SmartPhone extends Phone
{
//    This is one method
    public void swagat()
    {
        System.out.println("Apka Swagat hai isme");
    }

// This is another method

    public void name()
    {
        System.out.println("Turing on the Smartphone");
    }
}




public class Chapter10_DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone Obj=new Phone();  //Allowed
        // SmartPhone smobj=new SmartPhone();  //This is also allowed

        Phone obj= new SmartPhone();  //This is also allowed.
      //  SmartPhone obj2=new Phone();  //THis is not allowed.

        obj.name();  //By running this the second name will be printed.



    }

}


