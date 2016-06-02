/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.ProgramController;
import byui.cit260.conqueringConqueror.model.Player;
import conqueringconqueror.ConqueringConqueror;
import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    
    public void startProgram(){
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = ProgramController.createPlayer(playerName);
        
        ConqueringConqueror.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
    }
    
    public String getPlayerName(){
        
        boolean validName = false;
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        
        while(!validName) {
            String input = keyboard.nextLine();
            
            if(input == null || input.length() >= 2) {
                validName = true;
                name = input;
            } else {
                System.out.println("Input is invalide - name must be at least 2 characters.");
            }
        }
        
        return name;
    }
    
    public void displayBanner(){
             
        String welcome = "";
        welcome = "===============================" +
                "\nWelcome to Conquering the Conqueror" +
                "\nGet ready for some fun!" +
                "\n===================================";
        
        System.out.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName){
       
    }
    
}
