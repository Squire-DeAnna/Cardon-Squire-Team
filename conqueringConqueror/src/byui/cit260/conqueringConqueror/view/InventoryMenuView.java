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
public class InventoryMenuView {
    private final String menu = "\n"
            + "\nW - Weapons"
            + "\nF - Food"
            + "\nS - Save"
            + "\nH - Help"
            + "\nQ - Quit"
            ;
    
    public InventoryMenuView(){
        
    }
    
    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        } while(selection != 'Q');
        
    }
    
    public void doAction(char selection) {
        
        switch(selection){
            case 'W':
                weapons();
                break;
            case 'F':
                food();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        
    }
    
    public String getInput() {
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
    }

    private void weapons() {
        System.out.println("CALLED WEAPONS - NOT IMPLEMENTED YET");
    }

    private void food() {
        System.out.println("CALLED FOOD - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

}
