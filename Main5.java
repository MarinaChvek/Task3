package com.company;


public class Main5 {

    public static void main(String[] args) {
        double way=0;// всего намотал по этапам
        double distance=0; // расстояние от дома

        int  N= 100;
        double x;
        double l=1;
        for (double k = 1; k <= N; k++) {
            x=1/(k);
            way+=x;
            distance+=l*x;
             l=-l;
        }
        System.out.println("Весь путь: "+way+"\n "+"Расстояние от дома: "+distance);
    }
}