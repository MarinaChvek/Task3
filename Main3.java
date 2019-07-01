package com.company;
public class Main3 {

    public static void main(String[] args) {
        System.out.println("Таблица зависимости давления от высоты:");
        double z = 1.25 * Math.pow(10,-4);
        double p0 = 1.29;
        double p;
        for (int h = 0; h <= 1000; h += 100) {
            p = p0 * Math.exp(-h * z);
            System.out.println("h=" + h + "      p=" + p);
        }
    }
}