/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class RandomArray {
    private final Scanner scanner;
    
    
    public RandomArray() {
        this.scanner = new Scanner(System.in);
    }
    public RandomArray(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showArray() {
        int[] array = generateRandomEvenArray(20);
        System.out.println("Массив из 20 случайных четных чисел:");
        printArray(array);

        int min = findMin(array);
        int max = findMax(array);

        int sumWithoutMinMax = calculateSumWithoutMinMax(array, min, max);
        int countWithoutMinMax = array.length - 2; // Исключаем минимальное и максимальное значение

        double average = (double) sumWithoutMinMax / countWithoutMinMax;

        System.out.println("Среднее арифметическое элементов: " + average);
    }

    // Генерация массива из n случайных четных чисел
    private int[] generateRandomEvenArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(99); // Генерируем случайное число до 99
            // Проверяем, является ли число четным, и если нет, добавляем 1, чтобы сделать его четным
            if (randomNumber % 2 != 0) {
                randomNumber++;
            }
            array[i] = randomNumber;
        }
        return array;
    }

    // Поиск минимального значения в массиве
    private int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Поиск максимального значения в массиве
    private int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Вычисление суммы элементов массива без учета минимального и максимального
    private int calculateSumWithoutMinMax(int[] array, int min, int max) {
        int sum = 0;
        for (int num : array) {
            if (num != min && num != max) {
                sum += num;
            }
        }
        return sum;
    }

    // Вывод массива на экран
    private void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}