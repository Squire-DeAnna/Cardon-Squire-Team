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
            + "\nW - Weapons"
            + "\nP - Team"
            + "\nS - Save"
            + "\nH - Help"
            + "\nQ - Quit");
    }
    
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

    private void viewMap() {
        System.out.println("\n" + ConqueringConqueror.getGame().getMap().getMapString());
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
        System.out.println("\nCALLED EAT/DRINK - NOT IMPLEMENTED YET");
    }

    private void weapons() {
        System.out.println("\nCALLED WEAPONS - NOT IMPLEMENTED YET");
    }

    private void team() {
        TeamMenuView teamMenu = new TeamMenuView() {};
        teamMenu.display();
    }

    private void saveCurrentGame() {
        System.out.println("\nCALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");        
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.display();
    }
}
