package algorithms;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        int newElementsCount = 2;

        ArrayList<Integer> newArray = new ArrayList<>();
        for (int element : originalArray) {
            newArray.add(element);
        }

        for (int i = 0; i < newElementsCount; i++) {
            newArray.add(0); // добавляем новые элементы
        }

        System.out.println(newArray); // выводим результат
    }
}

