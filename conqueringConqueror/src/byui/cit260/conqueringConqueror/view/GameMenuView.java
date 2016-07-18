/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.GameControl;
import conqueringconqueror.ConqueringConqueror;

/**
 *
 * @author Erika
 */
public abstract class GameMenuView extends View {
    
    public GameMenuView() {
     
            super ("\n************************************"
            + "\n|             Game Menu            |"
            + "\n************************************"
            + "\nM - Map"
            + "\nI - Inventory"
            + "\nT - Travel"
            + "\nX - Explore"
            + "\nA - Attack"
            + "\nL - Loot"
            + "\nW - Weapons"
            + "\nP - Team"
            + "\nS - Save"
            + "\nH - Help"
            + "\nE - Exit Game");
    }
    
    public boolean doAction(String selection) {
        
        if(selection == null || selection.length() == 0) {
            return false;
        }
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'M':
                viewMap();
                break;
            case 'I':
                inventory();
                break;
            case 'T':
                travel();
                break;
            case 'X':
                explore();
                break;
            case 'A':
                attack();
                break;
            case 'L':
                loot();
                break;
            case 'W':
                weapons();
                break;
            case 'P':
                team();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'E':
                exitGame();
                break;
            case 'Q':
                return true;
                
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void viewMap() {
        this.console.println("\n" + ConqueringConqueror.getGame().getMap().getMapString());
    }

    private void inventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView() {};
        inventoryMenu.display();
    }

    private void travel() {
        TravelMenuView travelMenu = new TravelMenuView() {};
        travelMenu.display();
    }

    private void explore() {
        ExploreMenuView exploreMenu =  new ExploreMenuView() {};  
        exploreMenu.display();
    }

    private void loot() {
        this.console.println("CALLED LOOT - NOT IMPLEMENTED YET");
    }

    private void attack() {
       AttackMenuView attackMenu = new AttackMenuView(){};
       attackMenu.display();
    }

    private void eatDrink() {
        this.console.println("\nCALLED EAT/DRINK - NOT IMPLEMENTED YET");
    }

    private void weapons() {
        this.console.println("\nCALLED WEAPONS - NOT IMPLEMENTED YET");
    }

    private void team() {
        TeamMenuView teamMenu = new TeamMenuView() {};
        teamMenu.display();
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
            ErrorView.display("GameMenuView", ex.getMessage());
        }      
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }

    private void exitGame() {
        MainMenuView mainMenu = new MainMenuView() {};
        mainMenu.display();
    }
}
