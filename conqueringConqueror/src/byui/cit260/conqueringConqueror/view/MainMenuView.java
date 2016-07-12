/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.GameControl;
import byui.cit260.conqueringConqueror.control.ProgramController;
import conqueringconqueror.ConqueringConqueror;
import static conqueringconqueror.ConqueringConqueror.getPlayer;
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
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.loadSavedGame();
                break;
            case 'S':
                this.saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
                
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void startNewGame() {
        ProgramController.createNewGame(ConqueringConqueror.getPlayer());
        
        this.console.println("\nWelcome, " + getPlayer().getName() + "!"
            +"\nAre you ready to conquer the conqueror?!");
        
        GameMenuView gameMenu = new GameMenuView() {};
        gameMenu.display();
    }

    private void loadSavedGame() {
        // prompt for and get the name of the file that the game is saved in
        this.console.println("\nEnter the file path for file where the game "
                                + "has been saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView() {};
        gameMenu.display();
    }

    private void saveCurrentGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\nEnter the file path for file where the game "
                                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveCurrentGame(ConqueringConqueror.getGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }

}
