
package com.models.storage;

import com.models.OperationIU;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author edangulo
 */
public class History {
     
    private static History instance;
    
    private ArrayList<OperationIU> operations;

    private History() {
        this.operations = new ArrayList<>();
    }
    public static History getInstance(){
        if (instance == null){
            instance = new History();
        }
        return instance;
    }
    public void addOperation(OperationIU operation) {
        this.operations.add(operation);
    }
    public ArrayList<OperationIU> getOperations() {
        return operations;
    }
    
}
