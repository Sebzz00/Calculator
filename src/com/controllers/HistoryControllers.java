
package com.controllers;

import com.controllers.util.Response;
import com.controllers.util.Status;
import com.models.OperationIU;
import com.models.storage.History;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author sebas
 */
public class HistoryControllers {
    
    public static Response getHistory(){
        try{
        History h = History.getInstance();
        ArrayList<OperationIU> operationHistorial = h.getOperations();
        
        if(operationHistorial.isEmpty()){
            return new Response("Empty operation history.", Status.NOT_FOUND);
        }
        ArrayList<String> operationStrings = new ArrayList<>();
        DecimalFormat formatter = new DecimalFormat(".###");
        for(OperationIU op : operationHistorial){
            String[] rawString = String.valueOf(op).split(" = ");
            String opString = rawString[0] + " = " + formatter.format(Float.parseFloat(rawString[1])).replaceAll(",", ".");
            operationStrings.add(opString);
        }
        Collections.reverse(operationStrings);
        DefaultListModel operationModel = new DefaultListModel();
        operationModel.addAll(operationStrings);
        return new Response("History found succesfully", Status.OK, operationModel);
        
        } catch(Exception ex){
            ex.printStackTrace();
            return new Response("Unexpected error!", Status.INTERNAL_SERVER_ERROR);
        }
        
    }
    
}
