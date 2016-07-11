/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import conqueringconqueror.ConqueringConqueror;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = ConqueringConqueror.getInFile();
    protected final PrintWriter console = ConqueringConqueror.getOutFile();
    
    public View(){
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    
    @Override
    public void display() {
        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);
        } while (!done);

    }
        
    
    @Override
     public String getInput() {
        console.println(displayMessage);
        String input = " ";
        boolean isValid = false;
        try {
            //while a valid name has not been retrieved
            while(!isValid){
            
            // get the value entered from the keyboard    
            //System.out.println("\n" + this.displayMessage);
            input = this.keyboard.readLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if(input == null || input.length() == 0){
                this.console.println("Invalid input - please enter a valid character.");
            } else {
                isValid = true;
            }
            break;
        }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
    }
        
        return input;
    }
}
