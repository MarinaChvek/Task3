package com.company;
import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int click = 1;
        while (click != 0) {
            System.out.println("Введите номер пункта");
            click = in.nextInt();
            switch (click) {
                case 0:
                    break;
                case 1:
                    int k = 1;
                    for (int m = 20; k <= 35; m++) {
                        System.out.println(k = m);
                    }
                    break;
                case 2:
                    Scanner f = new Scanner(System.in);
                    System.out.print("Введите числое b>=10: ");
                    int b = f.nextInt();
                    int i = 10;
                    if (b >= 10) {
                        for (i = 10; i <= b; i++) {
                            System.out.println(i * i);

                        }
                    }else{
                     System.out.println("Вы ввели число меньше 10");
                   }
                    break;
                case 3:
                    Scanner p = new Scanner(System.in);
                    System.out.print("Введите числое a<=50: ");
                    int a = p.nextInt();
                    if (a <= 50) {
                        for (int z = a; z <= 50; z++) {
                            System.out.println(Math.pow(z,3));

                        }
                    }else{
                        System.out.println("Вы ввели число больше 50");
                    }
                    break;
                case 4:
                    Scanner x = new Scanner(System.in);
                    System.out.print("Введите числое a ");
                    int l = x.nextInt();
                    System.out.print("Введите числое b>=a ");
                    int c = x.nextInt();
                    if (l <= c) {
                        for (int n = l; n <= c; n++) {
                            System.out.println(n);

                        }
                    }else{
                        System.out.println("Вы ввели число b, которое меньше a");
                    }
                    break;
                default:
                    System.out.println("Пример не выбран");
            }

        }
        in.close();
    }
}
