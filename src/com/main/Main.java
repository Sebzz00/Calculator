/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

import com.view.CalculatorFrame;

/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setVisible(true);
            }
        });
    }
}
