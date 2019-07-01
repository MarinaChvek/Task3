package com.company;

public class Main9 {

    public static void main(String[] args) {
        int b=100;
        int a=0;
        while( a !=15) {
            b++;
            if (b % 19 == 0) {
                a++;
                System.out.println(b);
            }
        }
    }
}