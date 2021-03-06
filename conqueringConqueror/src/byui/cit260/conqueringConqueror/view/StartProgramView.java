/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.ProgramController;
import byui.cit260.conqueringConqueror.model.Player;
import conqueringconqueror.ConqueringConqueror;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class StartProgramView {
    
    protected final BufferedReader keyboard = ConqueringConqueror.getInFile();
    protected final PrintWriter console = ConqueringConqueror.getOutFile();
    
    public StartProgramView(){
        
    }
    
    public void startProgram(){
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = ProgramController.createPlayer(playerName);
        
        ConqueringConqueror.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
        
        MainMenuView mainMenu = new MainMenuView() {};
        mainMenu.display();
        
    }
   
    public String getPlayerName(){
        
        boolean validName = false;
        // added String input as a variable
        String input;
        String playerName = "";
        //Scanner keyboard = new Scanner(System.in);
        
        this.console.println("Please enter your name: ");
        try {
           
        while(!validName) {
            input = keyboard.readLine();
            
            if(input == null || input.length() <= 2) {
                //validName = true;
                ErrorView.display(this.getClass().getName(), "Input is invalid - name must be at least 2 characters. Please Enter your name again.");
                 displayBanner();
               // name = input;
            
            } 
            
            else if(input.length() == 0 || input.length() >= 2){
                Player player = new Player();
                //ErrorView.display(this.getClass().getName(), "Input is invalid - name must be at least 2 characters.");
                validName = true;
                playerName = input;
            }
            
        }
       
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            
        }
        
        return playerName;
    }
    
    public void displayBanner(){
             
        String welcome = "";
        welcome = "===================================" +
                "\nWelcome to Conquering the Conqueror" +
                "\nGet ready for some fun!" +
                "\n===================================";
        
        this.console.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName){
       
    }
    
}
