package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

//        Level 1

        System.out.println("Level 1.");
        System.out.println("");
        System.out.println("Введите 7 цифр в массив");

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[7];
        int[] index = new int[7];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i <= index.length - 1; i++) {
            index[i] += i;
        }

        System.out.println(Arrays.toString(arr));


        System.out.println("Введите цифру из вашего массива индекс, которого хотите найти");
        int num = scanner.nextInt();

        for (int i = 0; i <= index.length - 1; i++) {
            if (arr[i] == num) {
                System.out.println("Индекс элемента: " + index[i]);
            }

        }

        System.out.println("");

//        Level 2

        System.out.println("Level 2.");
        System.out.println("");
        System.out.println("Квадрат каждого элемента массива: ");

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] *= arr[i];
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("Сумма квадратов всех элементов массива: ");
        System.out.println(sum);
    }

}
