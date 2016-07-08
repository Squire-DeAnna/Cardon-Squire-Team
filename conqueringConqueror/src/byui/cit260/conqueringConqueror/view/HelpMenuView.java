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
public abstract class HelpMenuView extends View {
    
    public HelpMenuView() {
    
            super ("\n************************************"
            + "\n|             Help Menu            |"
            + "\n************************************"
            + "\nA - About Game"
            + "\nM - How to Move in Game"
            + "\nS - How Strength is Determined"
            + "\nQ - Quit");
    
    }
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'A':
                aboutGame();
                break;
            case 'M':
                howToMove();
                break;
            case 'S':
                howStrengthIsDetermined();
                break;
            case 'Q':
                return true;
                
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void aboutGame() {
        this.console.println("===========================================");
        this.console.println("|                About Game               |");
        this.console.println("===========================================");
        this.console.println("It’s 2340 BC and Sargon the Great");
        this.console.println("is feverously creating the Akkadian");
        this.console.println("Empire in Mesopotamia. He is ruthlessly");
        this.console.println("invading neighboring city states and");
        this.console.println("demanding they show allegiance to him.");
        this.console.println("You have no desire to be ruled by this");
        this.console.println("tyrannous dictator and decide to set");
        this.console.println("off on a quest to assassinate him.");
        this.console.println("");
        this.console.println("Your journey will start in the city of");
        this.console.println("Ur, and you will need to travel through");
        this.console.println("Lagash and Adab on your way to the");
        this.console.println("capital city, Akkad. Along your way you");
        this.console.println("will need to gather new weapons, make");
        this.console.println("friends who share your passion for freedom,");
        this.console.println("and stay alive. You will need to find");
        this.console.println("food and water, as well as protect");
        this.console.println("yourself from those who would wish to");
        this.console.println("stop you. In each new city the dangers");
        this.console.println("around you will become more unyielding,");
        this.console.println("so make sure you don’t head there before ");
        this.console.println("you feel prepared.");
        this.console.println("===========================================");
    }

    private void howToMove() {
        this.console.println("===========================================");
        this.console.println("|               How To Move               |");
        this.console.println("===========================================");
        this.console.println("The city will consist of a 5x5");
        this.console.println("map that you can move North, East");
        this.console.println("South, and West on.");
        this.console.println("===========================================");
        
    }

    private void howStrengthIsDetermined() {
        this.console.println("===========================================");
        this.console.println("|      How Is Strength Determined         |");
        this.console.println("===========================================");
        this.console.println("Strength is determinded by how full/");
        this.console.println("hungry/thirsty the user is, strength");
        this.console.println("that is earned from experience in");
        this.console.println("battle, and strength points that come");
        this.console.println("from weapons.");
        this.console.println("===========================================");
    }
    
}


