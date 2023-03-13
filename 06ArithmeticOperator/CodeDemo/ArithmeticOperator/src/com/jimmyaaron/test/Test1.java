package com.jimmyaaron.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数：");
        int number = sc.nextInt();

        int dig_1 = number % 10;
        int dig_2 = number / 10 % 10;
        int dig_3 = number /100 % 10;

        System.out.println("个位是：" + dig_1);
        System.out.println("十位是：" + dig_2);
        System.out.println("百位是：" + dig_3);
    }
}
