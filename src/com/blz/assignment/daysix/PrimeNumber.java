package com.blz.assignment.daysix;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int uInput = scan.nextInt();

        for (int i = 2; i <= uInput / 2; i++) {
            if (uInput % i == 0) {
                System.out.println("It is not a Prime number");
            } else {
                System.out.println("It is Prime Number");
            }
        }
    }
}
