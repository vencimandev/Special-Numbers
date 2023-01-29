package NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {

            int firstNumber = i / 1000 % 10;
            int secondNumber = i / 100 % 10;
            int thirdNumber = i / 10 % 10;
            int forthNumber = i % 10;

            boolean checkFirst = number % firstNumber == 0; // ако е вярно -> true, ако не -> false
            boolean checkSecond = secondNumber != 0 && number % secondNumber == 0;
            boolean checkThird = thirdNumber != 0 && number % thirdNumber == 0;
            boolean checkFourth = forthNumber != 0 && number % forthNumber == 0;

            if (checkFirst && checkSecond && checkThird && checkFourth) {
                System.out.printf("%d ", i);
            }

        }
    }
}

