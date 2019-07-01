package com.company;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner in = new Scanner(System.in);
        int  n= in.nextInt();
        int  sum=0;
        int a1=0;
        int a2=0;
        int an=0;
        for (int k = 1; k <= n; k++) {
            System.out.print("Введите " + k + "-е число ");
            int a = in.nextInt();
            if (k % 2 == 1) {
                sum = sum + a;
            } else {
                sum = sum - a;
            }
            if (k == 1) {
                a1 = a;
            }
            if (k == 2) {
                a2 = a;
            }
            if (k == n) {
                an = a;
            }

        }

        System.out.println("Задание а) " + sum);
        System.out.println("Задание б) " + (a1+an));
        System.out.println("Задание в) " + (a1-a2));

    }
}
