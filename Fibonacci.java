package com.Day5.assignments.bridgelabz;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the numbers");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a+ "" +b);
        for( int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c );
            a = b;
            b = c;
        }
        sc.close();
    }
}
