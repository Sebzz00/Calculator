
package com.models;

/**
 *
 * @author sebas
 */
public class Potency extends Operation {
    public Potency(double base, double exponent) {
        super(base, exponent, "^");
    }

    @Override
    public double operate() {
        return Math.pow(this.number1, this.number2);
    }
}
