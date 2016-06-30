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

    private void weapons() {
        System.out.println("\nCALLED WEAPONS - NOT IMPLEMENTED YET");
    }

    private void foodMenu() {
        FoodDrinkMenuView foodMenu = new FoodDrinkMenuView() {};
        foodMenu.display();
    }

    private void saveCurrentGame() {
        System.out.println("\nCALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }

}
