
package com.models;

/**
 *
 * @author sebas
 */
public class Divide extends Operation{

    public Divide(double num1, double num2) {
        super(num1, num2, "/");
    }
    @Override
    public double operate(){  
        return this.number1 / this.number2;
    }
}
