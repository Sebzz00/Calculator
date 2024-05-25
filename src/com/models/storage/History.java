
package com.models.storage;

import com.models.Operation;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author edangulo
 */
public class History {
     
    private static History instance;
    
    private ArrayList<Operation> operations;

    private History() {
        this.operations = new ArrayList<>();
    }
    
    public static History getInstance(){
        if (instance == null){
            instance = new History();
        }
        return instance;
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
}
