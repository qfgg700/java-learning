package com.jimmyaaron.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();

        boolean result = num1 > num2;

        System.out.println(result);
    }
}
