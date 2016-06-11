/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class ExploreMenuView {
    
    
    private final String menu = "\n"
            + "\nA - Attack Enemy"
            + "\nF - Flee From Enemy"
            + "\nL - Collect Found Treasure"
            + "\nE - Eat Food"
            + "\nD - Take a Drink"
            + "\nS - Search curent location"
            + "\nI - Check current inventory"
            + "\nQ - Quit to main menu"
            ;
    
    public ExploreMenuView(){
        
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
                attack();
                break;
            case 'F':
                flee();
                break;
            case 'L':
                pickUpLoot();
                break;
            case 'E':
                eatFood();
                break;
            case 'D':
                drinkWater();
                break;
            case 'S':
                searchLocation();
                break;
            case 'I':
                checkInventory();
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

        private void attack() {
            System.out.println("You have chossen to attack the enemy " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void flee() {
            System.out.println("You have chossen to flee from the enemy " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void pickUpLoot() {
            System.out.println("You have chossen to pick up found treasures " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void eatFood() {
            System.out.println("You have chossen to eat food and restore your energy " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void drinkWater() {
            System.out.println("You have chossen to drink water and refresh your energy " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void searchLocation() {
            System.out.println("You have chossen to search your present location " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void checkInventory() {
            System.out.println("You have chossen to check your available inventory " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }


    }  

