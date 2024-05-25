/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import calculator.Calculator;
import com.models.storage.History;
import com.models.Operation;
import com.controllers.util.Response;
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

    public Response add(double a, double b) {
        double result = calculator.add(a, b);
        Operation operation = new Operation(a, b, "+", result);
        history.addOperation(operation);
        return new Response(result, true, "Addition successful");
    }

    public Response subtract(double a, double b) {
        double result = calculator.subtract(a, b);
        Operation operation = new Operation(a, b, "-", result);
        history.addOperation(operation);
        return new Response(result, true, "Subtraction successful");
    }

    public Response multiply(double a, double b) {
        double result = calculator.multiply(a, b);
        Operation operation = new Operation(a, b, "*", result);
        history.addOperation(operation);
        return new Response(result, true, "Multiplication successful");
    }

    public Response divide(double a, double b) {
        double result = calculator.divide(a, b);
        Operation operation = new Operation(a, b, "/", result);
        history.addOperation(operation);
        return new Response(result, true, "Division successful");
    }

    public Response potency(double base, double exponent) {
        double result = calculator.potency(base, exponent);
        Operation operation = new Operation(base, exponent, "^", result);
        history.addOperation(operation);
        return new Response(result, true, "Potency successful");
    }

    }
