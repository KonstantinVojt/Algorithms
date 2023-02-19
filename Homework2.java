package algorithms;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Level 1");
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextInt();

        if (recursion(num) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("-----");

        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println("Сумма цифр ");
        System.out.println(sum(number));

        System.out.println("Level 2");

        System.out.println("Введите число");
        int input = scanner.nextInt();
        System.out.println("Ваши числа Фибоначи");


        for (int i = 0; i < input; ++i) {
            System.out.println(fibonacci(i));
        }


        System.out.println("-----");

        String str = "FDFDF";
        System.out.println("Ввша строка: " + str);

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }

    }

    public static int recursion(double number) {
        if (number == 1) {
            return 1;
        }
        else if (number > 1 && number < 2) {
            return 0;
        }
        else {
            return recursion(number / 2);
        }
    }

    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }

    }

    public static boolean isPalindrome(String str, int low, int high) {
        if (low >= high) {
            return true;
        }

        if (str.charAt(low) != str.charAt(high)) {
            return false;
        }

        return isPalindrome(str, low + 1, high - 1);
    }
}




