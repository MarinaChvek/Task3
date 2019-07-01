package com.company;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        double sr=0;
        double sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int  n= in.nextInt();
        for (int k=1;k<=n;k++) {
            System.out.print("Введите число а"+k+": ");
           int a = in.nextInt();
            sum += a;

        }
        if (n !=0) {
            sr = sum / n;
        }else {
            sr=0;

        }
        System.out.println("Среднее арифметическое = "+sr);
    }
}