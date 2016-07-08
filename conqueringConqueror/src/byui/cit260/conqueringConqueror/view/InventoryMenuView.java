/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import java.util.Scanner;

/**
 *
 * @author Erika
 */
public abstract class InventoryMenuView extends View {
    
    public InventoryMenuView() {
       
            super ("\n************************************"
            + "\n|          Inventory Menu          |"
            + "\n************************************"
            + "\nW - Weapons"
            + "\nF - Food/Drink"
            + "\nS - Save"
            + "\nH - Help"
            + "\nQ - Quit");
        
    }
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'W':
                weapons();
                break;
            case 'F':
                foodMenu();
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
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void weapons() {
        this.console.println("\nCALLED WEAPONS - NOT IMPLEMENTED YET");
    }

    private void foodMenu() {
        FoodDrinkMenuView foodMenu = new FoodDrinkMenuView() {};
        foodMenu.display();
    }

    private void saveCurrentGame() {
        this.console.println("\nCALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }

}
