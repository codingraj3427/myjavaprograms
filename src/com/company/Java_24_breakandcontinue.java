package com.company;

public class Java_24_breakandcontinue {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            System.out.println("I am java"+i);
            if(i==2)
            {
                System.out.println("Break the loop");
                break;
            }

        }
        System.out.println("loop ends here");


        int y;
        for(y=0;y<=9;y++)
        {

            if(y>3)
            {
                System.out.println("I am a java program");
                continue;
            }


            System.out.println("Hello i am a java program haha"+y);
        }
    }
}
