/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

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

    private void startNewGame() {
        ProgramController.createNewGame(ConqueringConqueror.getPlayer());
        
        System.out.println("Welcome, " + getPlayer().getName() + "!");
        
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
