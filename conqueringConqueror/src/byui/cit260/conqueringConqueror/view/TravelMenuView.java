/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.model.Player;
import static conqueringconqueror.ConqueringConqueror.getPlayer;

/**
 *
 * @author Jason
 */
public abstract class TravelMenuView extends View{
    
    public TravelMenuView(){
    
              super("\n************************************"
            + "\n|             Travel Menu            |"
            + "\n************************************"
            + "\nN - Go North"
            + "\nS - Go South"
            + "\nE - Go East"
            + "\nW - Go West");
    }
    
     public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'N':
                goNorth();
                break;
            case 'S':
                goSouth();
                break;
            case 'W':
                goWest();
                break;
            case 'E':
                goEast();
                break;
                        
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }

    private void goNorth() {
        System.out.println(getPlayer().getName() + " has selected to go North");
    }

    private void goSouth() {
        System.out.println(getPlayer().getName() + " has selected to go South");
    }

    private void goWest() {
        System.out.println(getPlayer().getName() + " has selected to go West");
    }

    private void goEast() {
        System.out.println(getPlayer().getName() + " has selected to go East");
    }
    
}
