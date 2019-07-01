package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner in = new Scanner(System.in);
        int  n= in.nextInt();
        double sum=0;
        double x;
        for (double k = 1; k <= n; k++) {
            x=1/k;
            sum+=x;

        }
        System.out.println(sum);
    }
}