/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */

public class Game {
    private final Scanner scanner;
    private final int maxAttempts = 5;
    private int secretNumber;
    private boolean hasGuessed;
    private int score;

    public Game() {
        this.scanner = new Scanner(System.in);
        this.secretNumber = generateSecretNumber();
        this.hasGuessed = false;
        this.score = 0;
    }

    public Game(Scanner scanner) {
        this.scanner = scanner;
        this.secretNumber = generateSecretNumber();
        this.hasGuessed = false;
        this.score = 0;
    }

    public void playGame() {
        System.out.println("Добро пожаловать в игру угадывания числа!");
        System.out.println("У вас есть " + maxAttempts + " попыток, чтобы угадать число от 1 до 100.");
        
        do {
            playRound();
            
            if (hasGuessed) {
                score += maxAttempts;
                System.out.println("Ваш текущий счет: " + score);
            } else {
                System.out.println("Игра окончена. Вы не угадали число. Загаданное число было " + secretNumber + ".");
            }
            
            System.out.print("Хотите сыграть еще раз? (1 - да, 2 - нет): ");
            
            int playAgain = 0;
            boolean validInput = false;
            
            while (!validInput) {
                try {
                    playAgain = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Пожалуйста, введите цифру (1 - да, 2 - нет): ");
                    scanner.nextLine(); // Очистить буфер ввода
                }
            }
            
            if (playAgain != 1) {
                break;
            }
            
            this.secretNumber = generateSecretNumber();
            this.hasGuessed = false;
        } while (true);
        
        System.out.println("Спасибо за игру! Ваш итоговый счет: " + score);
    }

    private void playRound() {
        for (int attempts = 1; attempts <= maxAttempts && !hasGuessed; attempts++) {
            System.out.print("Попытка " + attempts + ". Введите вашу догадку: ");
            
            int userGuess = 0;
            boolean validInput = false;
            
            while (!validInput) {
                try {
                    userGuess = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Пожалуйста, введите число от 1 до 10: ");
                    scanner.nextLine(); // Очистить буфер ввода
                }
            }

            if (userGuess < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else if (userGuess > secretNumber) {
                System.out.println("Загаданное число меньше.");
            } else {
                hasGuessed = true;
                System.out.println("Поздравляю! Вы угадали число " + secretNumber + " за " + attempts + " попыток.");
            }
        }
    }

    private int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Генерируем случайное число от 1 до 10
    }
    
}
 

