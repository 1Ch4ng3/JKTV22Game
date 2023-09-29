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
public class TemperaturConvertor {
    
    private final Scanner scanner;

    public TemperaturConvertor() {
        this.scanner = new Scanner(System.in);
    }

    public TemperaturConvertor(Scanner scanner) {
        this.scanner = scanner;
    }
    

    public void doConvert() {
        
        boolean repeat = true;
        do {
            System.out.println("---- Temperature Convert----");
            System.out.println("Выберите Coverter");
            System.out.println("0. Закончит ");
            System.out.println("1. C -> F");
            System.out.println("2. F -> C");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    convertCToF();
                    break;
                case 2:
                    convertFToC();
                default:
                    System.out.println("Выбирете номер из списка");
            }
            System.out.println("=================");
        }while(repeat);
    }

    private void convertCToF() {
        System.out.print("Type a trmperatur in C: ");
        double tempC = scanner.nextDouble(); scanner.nextLine();
        //convert
        double tempF = (tempC * 9/5) + 32;
        System.out.println("In F scala: "+ tempF);
    }

    private void convertFToC() {
        System.out.print("Type a trmperatur in F: ");
        double tempF = scanner.nextDouble(); scanner.nextLine();
        //convert
        double tempC = (tempF - 32) * 5/9;
        System.out.println("In C scala: "+ tempC);
    }
}

