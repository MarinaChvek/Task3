package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int g=10;
        Scanner in = new Scanner(System.in);
        int click = 1;
        while (click != 0) {
            System.out.println("Введите номер примера (для выхода нажмите цифру 0)");
            click = in.nextInt();
            switch (click) {
                case 0:
                    break;
                case 1:

                    System.out.println("Введите x1: ");
                    double x1 = in.nextDouble();
                    System.out.println("Введите x2: ");
                    double x2 = in.nextDouble();
                    double y;
                    y = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
                    System.out.println("Результат " + y);
                    break;
                case 2:
                    System.out.println("Введите x1: ");
                    double x3 = in.nextDouble();
                    System.out.println("Введите x2: ");
                    double x4 = in.nextDouble();
                    System.out.println("Введите x3: ");
                    double x5 = in.nextDouble();
                    double y1;
                    y1 = x3 * x4 + x3 * x5 + x4 * x5;
                    System.out.println("Результат " + y1);
                    break;
                case 3:
                    System.out.println("Введите v0: ");
                    double v0 = in.nextDouble();
                    System.out.println("Введите t: ");
                    double t = in.nextDouble();
                    System.out.println("Введите a: ");
                    double a = in.nextDouble();
                    double y2;
                    y2=v0*t+(a*Math.pow(t, 2))/2;
                    System.out.println("Результат " + y2);
                    break;
                case 4:
                    System.out.println("Введите m ");
                    double m = in.nextDouble();
                    System.out.println("Введите v ");
                    double v = in.nextDouble();
                    System.out.println("Введите h ");
                    double h = in.nextDouble();
                    double y3;
                    y3=(m*Math.pow(v, 2))/2+m*g*h;
                    System.out.println("Результат " + y3);
                    break;
                case 5:
                    System.out.println("Введите R1 ");
                    double R1 = in.nextDouble();
                    System.out.println("Введите R2 ");
                    double R2 = in.nextDouble();
                    double y4;
                    y4=1/R1+1/R2;
                    System.out.println("Результат " + y4);
                    break;
                case 6:
                    System.out.println("Введите m ");
                    double m1 = in.nextDouble();
                    System.out.println("Введите угол alpha ");
                    double alpha = in.nextDouble();
                    double y5;
                    y5=m1*g*Math.cos(alpha);
                    System.out.println("Результат " + y5);
                    break;
                case 7:
                    System.out.println("Введите R ");
                    double R = in.nextDouble();
                    double y6;
                    y6=2*R*Math.PI;
                    System.out.println("Результат " + y6);
                    break;
                case 8:
                    System.out.println("Введите b ");
                    double b1 = in.nextDouble();
                    System.out.println("Введите a ");
                    double a1 = in.nextDouble();
                    System.out.println("Введите c ");
                    double c1=in.nextDouble();
                    double y7;
                    y7=Math.pow(b1,2)-4*a1*c1;

                    System.out.println("Результат " + y7);
                    break;
                case 9:
                    System.out.println("Выволнение действия9");
                    break;
                default:
                    System.out.println("Пример не выбран");
            }

        }
        in.close();
    }
}
