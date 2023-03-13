package com.jimmyaaron.logicoperator;

public class LogicOperatorDemo1 {
    public static void main(String[] args) {
        //与：两边都为真，结果才是真
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("##########");

        //或：两边都为假，结果才是假
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
