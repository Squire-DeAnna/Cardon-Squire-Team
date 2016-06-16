/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.ProgramController;
import conqueringconqueror.ConqueringConqueror;
import java.util.Scanner;

/**
 *
 * @author Erika
 */
public abstract class MainMenuView extends View {
    
    public MainMenuView() {
    
            super ("\n************************************"
            + "\n|             Main Menu            |"
            + "\n************************************"
            + "\nN - New Game"
            + "\nL - Load Game"
            + "\nS - Save Game"
            + "\nH - Help Menu"
            + "\nQ - Quit");
    }
    
    /*public void displayMenu(){
        
        char selection = ' ';
        
        do {
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        } while(selection != 'Q');
        
    }*/
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadSavedGame();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
                
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }
    
    /*public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
        
        while(!isValid){
            System.out.println("Please select an option:");
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input == null || input.length() == 0){
                System.out.println("Invalid input - please enter a valid character.");
            } else {
                isValid = true;
            }
        }
        
        return input.toUpperCase();
    }*/

    private void startNewGame() {
        ProgramController.createNewGame(ConqueringConqueror.getPlayer());
        GameMenuView gameMenu = new GameMenuView() {};
        gameMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("CALLED LOAD NEW GAME - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }
    
}
