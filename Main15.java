package com.company;

import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {
        System.out.print("Введите количество участников: ");
        Scanner in = new Scanner(System.in);
        int  n= in.nextInt();
        int time=0;
        int min=0;
        for (int i=1;i<=n;i++){
            System.out.print("Время в минутах участника "+i+": ");
            time=in.nextInt();
            if(i==1) {min=time; System.out.println("Лучший результат " + min+" мин"); }
            else {
            if (time<=min) {
                min = time;

            }
                System.out.println("Лучший результат " + min+" мин");
            }
        }

    }
}