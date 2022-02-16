package com.company;

public class Java_27_Arrayoperation {
    public static void main(String[] args) {
        int []marks={20,30,40,50};
        float []marks2={98.5f,98f,7f,98.3f};
        String []name={"harry","Rajarshi","Subham","Mostafa"};
        int length= marks.length;;
        System.out.println(length);
        System.out.println(name[0]);

        //Displaying an array
        for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]);
        }

        //By using decrementig for loop

        for(int i= marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        for(int elements:marks)      //This is known as for each loop in java programmig language.
        {
            System.out.println(elements);
        }

    }
}
