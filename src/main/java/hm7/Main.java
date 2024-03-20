package hm7;

import hm7.controller.CalculatorController;
import hm7.logger.CalculatorLogger;
import hm7.model.CalculatorModel;
import hm7.view.CalculatorView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorLogger logger = new CalculatorLogger();
        CalculatorController controller = new CalculatorController(view, model, logger);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();


        switch (operation) {
            case '+':
                controller.addNumbers(num1, num2);
                break;
            case '*':
                controller.multiplyNumbers(num1, num2);
                break;
            case '/':
                controller.divideNumbers(num1, num2);
                break;
            default:
                System.out.println("Неверная операция!");
        }

        scanner.close();
        logger.printLogs();
    }
}
