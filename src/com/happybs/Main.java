package com.happybs;

public class Main {
    public static void main(String[] args) {
        String test = "010-2222-3333";
        String test2 = test.replaceAll("-","");

        System.out.println(test);
        System.out.println(test.replaceAll("-",""));
        System.out.println(test2);
    }
}
