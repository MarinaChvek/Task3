package com.company;
import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количество учащихся");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите рост учеников по списку");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }


            int k=0;
            while(k<size-1) {
                if (array[k]<=array[k+1]) {
                    break;
                }   else { k=k+1;}
            }
                if (k==size-1){ System.out.println("Порядок убывания соблюдается");
                }
                else {System.out.println("Порядок убывания не соблюдается");}

    }
}