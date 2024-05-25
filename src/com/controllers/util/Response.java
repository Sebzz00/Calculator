/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers.util;

/**
 *
 * @author sebas
 */
public class Response {
     private Object result;
    private boolean success;
    private String message;

    public Response(Object result, boolean success, String message) {
        this.result = result;
        this.success = success;
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
