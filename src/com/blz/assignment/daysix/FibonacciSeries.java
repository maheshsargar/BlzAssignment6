package com.blz.assignment.daysix;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int input1 = 0, input2 = 1, input3, i, count;

        Scanner scan = new Scanner(System.in);
        System.out.println("Number : ");
        count = scan.nextInt();
        System.out.print(input1 + " " + input2);//printing 0 and 1


        for (i = 2; i <count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            input3 = input1 + input2;
            System.out.print(" " + input3);
            input1 = input2;
            input2 = input3;
        }
    }
}

