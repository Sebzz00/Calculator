
package com.controllers.util;

/**
 *
 * @author sebas
 */
public class Response {
      
    private int status;
    private String message;
    private Object object;

    public Response(String message, int status, Object object) {
        this.message = message;
        this.status = status;
        this.object = object;
    }
    public Response(String message, int status) {
        this.message = message;
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public Object getObject() {
        return object;
    }  
}
