package com.jimmyaaron.logicoperator;

public class LogicOperatorDemo2 {
    public static void main(String[] args) {
        //异或：相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println("##########");

        //非：逻辑取反
        System.out.println(!false);
        System.out.println(!true);
    }
}
