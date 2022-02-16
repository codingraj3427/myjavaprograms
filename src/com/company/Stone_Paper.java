package com.company;
import java.util.*;
import java.util.random.*;
public class Stone_Paper{


    //0 for Stone.
   // 1 for paper.
    // 2 for Scissors.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Enter 0 for Stone");
        System.out.println("Enter 1 for paper");
        System.out.println("Enter 2 for scissors");
        int user_input=sc.nextInt();
        int computer_input=rnd.nextInt(3);

        if(user_input==computer_input)
        {   System.out.printf(" Coumputer output is= %d and user_input is=%d ",computer_input,user_input);
            System.out.println("The match is draw");
        }

        else if(user_input==0 && computer_input==1 || user_input==2 && computer_input==1 || user_input==1 && computer_input==0)
        {
            System.out.printf("Coumputer output is= %d and user_input is=%d ",computer_input,user_input);
            System.out.println("You win");

        }

        else
        {
            System.out.printf("Coumputer output is= %d and user_input is=%d ",computer_input,user_input);
            System.out.println("You lose");
        }

    }
}
