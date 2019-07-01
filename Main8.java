package com.company;

public class Main8 {
    public static void main(String[] args) {
        double r = 1000;
        double p = 1000;
        double s;
        for (int i = 1; i <= 12; i++) {
            r = r + 0.2 * r;

            if (i >= 3) {
                System.out.println("Сумма вклада через " + i + " месяца составила " + r + " рублей");
            }
        }
            for (int m = 1; m <= 10; m++) {
                s = 0.2 * p;
                p = p + 0.2 * p;

                System.out.println("Прирост суммы вклада за " + m + " месяц составил " + s + " рублей");
            }


        }

    }
