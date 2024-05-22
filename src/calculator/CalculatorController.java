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
}
