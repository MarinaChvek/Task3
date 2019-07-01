package com.company;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner in = new Scanner(System.in);
        int  n= in.nextInt();
        int max=n%10;
        int min=max;
        n= n/10;
        while(n>0) {
            if (n % 10 > max) {
                max = n % 10;
            }
            if (n % 10 < min) {
                min = n % 10;
            }
            n =n / 10;
        }
        if((max-min)%2==0){System.out.print("Разность является четным числом");}
        else {System.out.print("Разность не является четным числом");}

    }
}
