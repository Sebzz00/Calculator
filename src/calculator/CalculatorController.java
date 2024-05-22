/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class CalculatorController {
    private Calculator calculator;
    private History history;

    public CalculatorController(Calculator calculator, History history) {
        this.calculator = calculator;
        this.history = history;
    }

    public double add(double number1, double number2) {
        double result = calculator.add(number1, number2);
        history.addOperation(new Operation(number1, number2, "+", result));
        return result;
    }

    public double subtract(double number1, double number2) {
        double result = calculator.subtract(number1, number2);
        history.addOperation(new Operation(number1, number2, "-", result));
        return result;
    }

    public double multiply(double number1, double number2) {
        double result = calculator.multiply(number1, number2);
        history.addOperation(new Operation(number1, number2, "*", result));
        return result;
    }

    public double divide(double number1, double number2) {
        double result = calculator.divide(number1, number2);
        history.addOperation(new Operation(number1, number2, "/", result));
        return result;
    }

    public double power(double number1, double number2) {
        double result = calculator.power(number1, number2);
        history.addOperation(new Operation(number1, number2, "^", result));
        return result;
    }

    public ArrayList<Operation> getHistory() {
        return history.getOperationsInReverseOrder();
    }
}
