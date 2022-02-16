package com.company;

public class Java_Chapter7_32_methodoverloading {

    static void change(int a)
    {
        a=98;
    }

    static void change2(int []arr)
    {
        arr[0]=90;
    }

    static void change2()
    {
        System.out.println("Hello good morning bro my name is Rajarshi Chakraborty.");

    }

    static void change2(int a,int b)
    {
        int c=a+b;

    }


    public static void main(String[] args) {

//        tellJoke();

//     Changing the integer
//        int x=45;
//        System.out.println(" The cahnge is "+x);

//        Now we are changing the array
        int []marks={20,56,87,34,56,23,10};
        change2(marks);
        System.out.println("The value of x after running change is"+marks[0]);

  // In java if we pass an object to a method then it will change the value of the array index 0.

//Now method overloading in java progra
// We can declare multiple methods in java of same name but there task will be diierent in manner.this is known as method oveloading

        change2();




    }
}
