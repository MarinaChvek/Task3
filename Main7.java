package com.company;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        double sum1=0;//площадь
        double sum2=0;//количество жителей
        int n=12;
        for (int k=1;k<=n;k++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите значение площади и колиество жителей через пробел  для района "+k+": ");
            double  s= in.nextInt();
            double r=in.nextInt();
            sum1 += s;
            sum2 +=r;
        }

        System.out.println("Средняя плотность населения по области= "+sum2/sum1);
    }
}