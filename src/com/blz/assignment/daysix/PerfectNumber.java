package com.blz.assignment.daysix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long uInput,sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        uInput = sc.nextLong();

        int i = 1;
        while (i <= uInput / 2) {
            if (uInput % i == 0) {
                sum = sum + i;
                System.out.println("Divisor : " + i);
            }
            i++;
        }
        if (sum == uInput) {
            System.out.println(uInput + " is a perfect number.");
        } else
            System.out.println(uInput + " is not a perfect number.");
    }
}

