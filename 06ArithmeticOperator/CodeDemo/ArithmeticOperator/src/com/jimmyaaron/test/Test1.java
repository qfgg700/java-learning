package com.jimmyaaron.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数：");
        int number = sc.nextInt();

        System.out.println(number % 10);//个位
        System.out.println(number / 10 % 10);//十位
        System.out.println(number / 100 % 10);//百位
    }
}
