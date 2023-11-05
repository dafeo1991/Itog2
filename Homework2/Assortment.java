package Lesson_02.Homework2;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assortment {
    private List<Toy> toyList;

    public Assortment() {
        toyList = new ArrayList<>();
    }

    public void add(Toy toy) {
        toyList.add(toy);
    }

    public void print() {
        System.out.println("Наш ассортимент:");
        System.out.println();
        for (Toy toy : toyList) {
            System.out.println(toy.getNumToy() + " вес игрушки: " + toy.getWeight());

        }
        System.out.println();
    }




}