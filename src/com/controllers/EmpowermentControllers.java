
package com.controllers;

import com.controllers.util.Response;
import com.controllers.util.Status;
import com.models.OperationIU;
import com.models.Empowerment;
import com.models.storage.History;
import java.text.DecimalFormat;

/**
 *
 * @author sebas
 */
public class EmpowermentControllers {
     
    public static Response createOperation(String num1, String num2) {

        DecimalFormat formatter = new DecimalFormat(".###");
        try {
            double n1, n2;

            if (num1.equals("")) {
                return new Response("This box must not be empty", Status.BAD_REQUEST);
            }

            if (num2.equals("")) {
                return new Response("This box must not be empty", Status.BAD_REQUEST);
            }

            try {
                n1 = Double.parseDouble(num1);
            } catch (NumberFormatException e) {
                return new Response("You must enter a number", Status.BAD_REQUEST);
            }

            try {
                n2 = Double.parseDouble(num2);
            } catch (NumberFormatException e) {
                return new Response("You must enter a number", Status.BAD_REQUEST);
            }

            String a[] = num1.split("\\.");
            if (a.length > 1) {

                if (a[1].length() > 3) {
                    return new Response("The number 1 must not exceed 3 decimal places.", Status.BAD_REQUEST);
                }
            }
            String b[] = num2.split("\\.");
            if (b.length > 1) {
                if (b[1].length() > 3) {
                    return new Response("The number 2 must not exceed 3 decimal places.", Status.BAD_REQUEST);
                }
            } 
            History history = History.getInstance();
            OperationIU op = new Empowerment(n1, n2);
            String result = formatter.format(op.getResult());

            history.addOperation(op);

            return new Response("Operated Succesfully", Status.OK, result.replace(",", "."));

        } catch (Exception e) {
            e.printStackTrace();
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
} 
}
