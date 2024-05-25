
package com.models;

/**
 *
 * @author edangulo
 */
public abstract class Operation {
    
    protected double number1;
    protected double number2;
    protected String operator;
    protected double result;

    public Operation(double number1, double number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = this.operate();
    }

    public double getResult(){
        return this.result;
    }
    
    public abstract double operate();
    
    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2 + " = " + result;
    }
    
}
