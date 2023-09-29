/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NumberParser {
    
    private final Scanner scanner;
    
    /**
     *
     */
    public NumberParser() {
        this.scanner = new Scanner(System.in);
    }
    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void doParse() {
        System.out.println("Введите трех значное число: ");
        
        int num = scanner.nextInt(); scanner.nextLine();
        int edCount = 0; // Количество единиц
        int decCount = 0; // Количество десятков
        int sumCount = 0; // Сумма цифр
        
        // Извлекаем цифры и вычисляем свойства
        int thirdDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        int firstDigit = num / 100;
        
        sumCount = firstDigit + secondDigit + thirdDigit;
        
        System.out.println("В этом числе:");
        System.out.println(" - единиц: " + thirdDigit);
        System.out.println(" - десятков: " + secondDigit);
        System.out.println(" - сумма цифр: " + sumCount);
    }
    
}
