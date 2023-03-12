package com.jimmyaaron.arithmeticoperator;

public class ArithmeticOperatorDemo2 {
    public static void main(String[] args) {
        System.out.println(10 / 5);
        System.out.println(10 / 3);
        //整数参与运算只能得到整数结果
        //小数参与运算结果可能不精确
        System.out.println(10.0 / 3);

        System.out.println(10 % 2);//商5余0
        System.out.println(10 % 3);//商3余1
    }
}
