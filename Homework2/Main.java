package Lesson_02.Homework2;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Assortment toyAssortment = new Assortment();


        toyAssortment.add(new Toy("Игрушка №1", 0.2));
        toyAssortment.add(new Toy("Игрушка №2", 1.0));
        toyAssortment.add(new Toy("Игрушка №3", 0.7));
        toyAssortment.add(new Toy("Игрушка №4", 1.2));
        toyAssortment.add(new Toy("Игрушка №5", 2.3));


        toyAssortment.print();

        System.out.println("Введите максимальный вес игрушки в килограммах, если напишите 10 это выход");

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();


            if (num == 1 ) {
                System.out.println("Вам нужна игрушка №1 или игрушка №3");
                System.out.println();
                main(args);
            }
            else if (num == 2 ) {
                System.out.println("Вам нужна игрушка игрушка №2 или №4");
                System.out.println();
                main(args);
            }
            else if (num == 3) {
                System.out.println("Вам нужна игрушка №5");
                System.out.println();
                main(args);
            } else if (num == 10) {
                System.exit(1);

            } else {
                 System.out.println("Такой игрушки нет");
                System.out.println();
                 main(args);
             }




    }
}
