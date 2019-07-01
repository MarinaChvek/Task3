package com.company;

import java.util.Scanner;

public class Main13 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int  a= in.nextInt();
        System.out.print("Введите число b: ");
        int  b= in.nextInt();
        System.out.print("Введите число c: ");
        int  c= in.nextInt();
        int p=0;
        for(int i = a; i <= b; i++){
           if (i%c==0){ System.out.println(i);
           p++;
           }
        }
    if (p==0) {System.out.println("Чисел кратных данному числу  нет"); }
    }
}