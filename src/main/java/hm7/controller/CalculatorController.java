package hm7.controller;

import hm7.model.CalculatorModel;
import hm7.view.CalculatorView;
import hm7.logger.CalculatorLogger;
public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;
    private CalculatorLogger logger;

    public CalculatorController(CalculatorView view, CalculatorModel model, CalculatorLogger logger) {
        this.view = view;
        this.model = model;
        this.logger = logger;
    }

    public void addNumbers(double num1, double num2) {
        model.add(num1, num2);
        double result = model.getResult();
        view.printResult(result);
        logger.log("Операция сложения: " + num1 + " + " + num2 + " = " + result);
    }

    public void multiplyNumbers(double num1, double num2) {
        model.multiply(num1, num2);
        double result = model.getResult();
        view.printResult(result);
        logger.log("Операция умножения: " + num1 + " * " + num2 + " = " + result);
    }

    public void divideNumbers(double num1, double num2) {
        try {
            model.divide(num1, num2);
            double result = model.getResult();
            view.printResult(result);
            logger.log("Операция деления: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
