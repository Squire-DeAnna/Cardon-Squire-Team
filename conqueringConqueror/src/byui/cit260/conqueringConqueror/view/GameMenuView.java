/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

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
            + "\nE - Explore"
            + "\nA - Attack"
            + "\nL - Loot"
            + "\nF - Eat/Drink"
            + "\nW - Weapons"
            + "\nP - Team"
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
            case 'M':
                viewMap();
                break;
            case 'I':
                inventory();
                break;
            case 'T':
                travel();
                break;
            case 'E':
                explore();
                break;
            case 'A':
                attack();
                break;
            case 'L':
                loot();
                break;
            case 'F':
                eatDrink();
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

    private void viewMap() {
        System.out.println(ConqueringConqueror.getGame().getMap().getMapString());
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
        //System.out.println("CALLED EXPLORE - NOT IMPLEMENTED YET");  
        ExploreMenuView exploreMenu =  new ExploreMenuView() {};  
        exploreMenu.display();
    }

    private void loot() {
        System.out.println("CALLED LOOT - NOT IMPLEMENTED YET");
    }

    private void attack() {
       AttackMenuView attackMenu = new AttackMenuView(){};
       attackMenu.display();
    }

    private void eatDrink() {
        System.out.println("CALLED EAT/DRINK - NOT IMPLEMENTED YET");
    }

    private void weapons() {
        System.out.println("CALLED WEAPONS - NOT IMPLEMENTED YET");
    }

    private void team() {
        System.out.println("CALLED TEAM - NOT IMPLEMENTED YET");
    }

    private void saveCurrentGame() {
        System.out.println("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");        
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }
}
