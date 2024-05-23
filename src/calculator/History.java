/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author edangulo
 */
public class History {
    
    private ArrayList<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public ArrayList<Operation> getOperationsInReverseOrder() {
        ArrayList<Operation> reversedOperations = new ArrayList<>(operations);
        Collections.reverse(reversedOperations);
        return reversedOperations;
    }
}
