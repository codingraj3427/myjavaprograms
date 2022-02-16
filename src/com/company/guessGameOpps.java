package com.company;
import java.util.Random;
import java.util.*;

class Game
{
    public int number;
    public int noOfGuesses;
    public int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game()
    {   Random rand=new Random();
        this.number=rand.nextInt(100);
    }


    void takeUserInput()
    {
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputNumber=sc.nextInt();

    }

    boolean isCorrectNumber()
    {  noOfGuesses++;
       if(inputNumber==number)
       {
           System.out.format("You have guessed it Right. It was =%d. \n You have guessed it in =%d attempts",number,noOfGuesses);
       }
       else if(inputNumber<number)
       {
           System.out.println("The number is too low");
       }
       else if(inputNumber>number)
       {
           System.out.println("The number is too high");
       }

       return false;
    }



}


public class guessGameOpps {
    public static void main(String[] args) {
        Game g= new Game();
        boolean b=false;
        while(!b)

        {


            g.takeUserInput();
            b = g.isCorrectNumber();


        }


    }
}
