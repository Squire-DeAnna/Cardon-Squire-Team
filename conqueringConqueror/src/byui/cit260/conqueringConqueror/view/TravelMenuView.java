/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.MovementControl;
import byui.cit260.conqueringConqueror.model.Location;
import conqueringconqueror.ConqueringConqueror;
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
            + "\nW - Go West"
            + "\nM - View Map"
            + "\nL - View Location"
            + "\nQ - Quit");
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
            case 'M':
                viewMap();
                break;
            case 'L':
                viewLocation();
                break;
            case 'Q':
                return true;
                
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }

    private void goNorth() {
        MovementControl mc = new MovementControl();
        if(mc.moveNorth(ConqueringConqueror.getGame()) == false) {
            System.out.println("\nYou cannot move north.");
        }
    }

    private void goSouth() {
        MovementControl mc = new MovementControl();
        if(mc.moveSouth(ConqueringConqueror.getGame()) == false) {
            System.out.println("\nYou cannot move south.");
        }
    }

    private void goWest() {
        MovementControl mc = new MovementControl();
        if(mc.moveWest(ConqueringConqueror.getGame()) == false) {
            System.out.println("\nYou cannot move west.");
        }
    }

    private void goEast() {
        MovementControl mc = new MovementControl();
        if(mc.moveEast(ConqueringConqueror.getGame()) == false) {
            System.out.println("\nYou cannot move east.");
        }
    }

    private void viewMap() {
        System.out.println("\n" + ConqueringConqueror.getGame().getMap().getMapString());
    }

    private void viewLocation() {
        Location l = ConqueringConqueror.getGame().getPlayer().getLocation();
        System.out.println("\nYou are at: (" + l.getRow() + ", " + l.getCol() + ")");
    }
    
}