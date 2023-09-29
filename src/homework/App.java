/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
/*
 *
 * @author pupil
 */
import Tasks.Game;
import Tasks.NumberParser;
import Tasks.TemperaturConvertor;
import java.util.Scanner;
public class App {
    private final Scanner scanner;

    public App() {
       this.scanner = new Scanner(System.in);
    }

    public App(Scanner scanner){
        this.scanner = scanner;
    }
    
    
    public void run() {
        boolean repeat = true;
        do {
    
            System.out.println("Выберите задачу");
            System.out.println("0. Закончит програму");
            System.out.println("1. Конвертор температуры");
            System.out.println("2. фокус с числом");
            System.out.println("3. 20 Случайных чисел");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    TemperaturConvertor temperaturConvertor = new TemperaturConvertor(scanner);
                    temperaturConvertor.doConvert();
                    break;
                case 2:
                    NumberParser numerParser = new NumberParser(scanner);
                    numerParser.doParse();        
                    break;
                case 3:
                    RandomArray randomArray = new RandomArray(scanner);
                    randomArray.showArray();
                    break;
                    case 4:
                    Game game = new Game(scanner);
                    game.playGame();
                    break;
                default:
                    System.out.println("Выбирете номер из списка");
            }
        }while(repeat);
    }
    
}
