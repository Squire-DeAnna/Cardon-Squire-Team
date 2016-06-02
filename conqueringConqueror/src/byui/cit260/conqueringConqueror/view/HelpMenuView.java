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
public class HelpMenuView {
    private final String menu = "\n"
            + "\nA - About Game"
            + "\nM - How to Move in Game"
            + "\nS - How Strength is Determined"
            + "\nQ - Quit"
            ;
    
    public HelpMenuView(){
        
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


    private void aboutGame() {
        System.out.println("===========================================");
        System.out.println("It’s 2340 BC and Sargon the Great");
        System.out.println("is feverously creating the Akkadian");
        System.out.println("Empire in Mesopotamia. He is ruthlessly");
        System.out.println("invading neighboring city states and");
        System.out.println("demanding they show allegiance to him.");
        System.out.println("You have no desire to be ruled by this");
        System.out.println("tyrannous dictator and decide to set");
        System.out.println("off on a quest to assassinate him.");
        System.out.println("");
        System.out.println("Your journey will start in the city of");
        System.out.println("Ur, and you will need to travel through");
        System.out.println("Lagash and Adab on your way to the");
        System.out.println("capital city, Akkad. Along your way you");
        System.out.println("will need to gather new weapons, make");
        System.out.println("friends who share your passion for freedom,");
        System.out.println("and stay alive. You will need to find");
        System.out.println("food and water, as well as protect");
        System.out.println("yourself from those who would wish to");
        System.out.println("stop you. In each new city the dangers");
        System.out.println("around you will become more unyielding,");
        System.out.println("so make sure you don’t head there before ");
        System.out.println("you feel prepared.");
        System.out.println("===========================================");
    }

    private void howToMove() {
        System.out.println("===========================================");
        System.out.println("The city will consist of a 5x5");
        System.out.println("map that you can move North, East");
        System.out.println("South, and West on.");
        System.out.println("===========================================");
        
    }

    private void howStrengthIsDetermined() {
        System.out.println("===========================================");
        System.out.println("Strength is determinded by how full/");
        System.out.println("hungry/thirsty the user is, strength");
        System.out.println("that is earned from experience in");
        System.out.println("battle, and strength points that come");
        System.out.println("from weapons.");
        System.out.println("===========================================");
    }
    
}


