package com.company;

public class Java_Practiceloop_ques3 {
    public static void main(String[] args) {

        int ans;
        for (int i=1; i<=10; i++)
        {
            ans=8*i;
            System.out.println(ans);
        }
// multiplication table of 10 in reverse order
        int ans1;
        for(int i=10;i>=0;i--)
        {
            ans1=10*i;
            System.out.println(ans1);
        }
// IF we want to add the multiplications result then we will do
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+10*i;
        }
        System.out.println(sum);

    }
}
