package com.company;
import java.util.Scanner;
public class Main10 {

    public static void main(String[] args) {
        boolean a=false, b=false, c=false;
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        double  n= in.nextDouble();
        while (n !=0) {
            if (n % 10 == 3) b = true;
            if (n % 10 == 2) a = true;
            if (n % 10 == 5) c = true;
            n = Math.floor(n/10);
        }
        if ((a)||(b)||(c)) {
            if (a) {    System.out.println("Число содержит цифру 2");}
            if (b) {    System.out.println("Число содержит цифру 3");}
            if (c) {    System.out.println("Число содержит цифру 5");}
        }
        else {    System.out.print("Нет нужных цифр");}


        }
    }
