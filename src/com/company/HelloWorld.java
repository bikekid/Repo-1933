package com.company;

import java.util.Scanner;

public class HelloWorld {

    public static int nums(int numone, int numtwo){
        int n;
        int ntwo;
        int count;
        int i;

        n = numone;
        ntwo = numtwo;
        count = 0;

        for (i = n; i < ntwo; i++){
            count += i;
        }
        return count;

    }
    public static void main(String[] args){
        int first_choice;
        int sec_choice;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer");
        first_choice = input.nextInt();
        System.out.print("Now enter another!");
        sec_choice = input.nextInt();

        System.out.println("The amount of nums between the two is :" + nums(first_choice,sec_choice));


    }
}
