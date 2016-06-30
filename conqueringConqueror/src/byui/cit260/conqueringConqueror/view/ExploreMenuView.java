/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import conqueringconqueror.ConqueringConqueror;

/**
 *
 * @author Jason
 */
public abstract class ExploreMenuView extends View {
    
    
    public ExploreMenuView(){
    
              super("\n************************************"
            + "\n|             Explore Menu            |"
            + "\n************************************"
            + "\nA - Attack Enemy"
            + "\nF - Flee From Enemy"
            + "\nL - Collect Found Treasure"
            + "\nE - Eat Food"
            + "\nD - Take a Drink"
            + "\nS - Search curent location"
            + "\nI - Check current inventory"
            + "\nT - Choose a direction to travel"
            + "\nQ - Quit to main menu");
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
            case 'T':
                travelDirection();
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

        private void attack() {
        AttackMenuView attackMenu = new AttackMenuView() {};
        attackMenu.display();
        }

        private void flee() {
            System.out.println("You have chossen to flee from the enemy " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void pickUpLoot() {
            System.out.println("You have chossen to pick up found treasures " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void eatFood() {
            EatMenuView eatMenu = new EatMenuView() {};
        eatMenu.display();
        }

        private void drinkWater() {
        DrinkMenuView drinkMenu = new DrinkMenuView() {};
        drinkMenu.display();
        }

        private void searchLocation() {
            //System.out.println("You have chossen to search your present location " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
            if(ConqueringConqueror.getPlayer().getLocation().getHero() != null){
                RecruitHeroView rhv = new RecruitHeroView();
                rhv.display();
            }
        }

        private void checkInventory() {
            InventoryMenuView inventoryMenu = new InventoryMenuView() {};
        inventoryMenu.display();
        }

    /*@Override
    public char doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    private void travelDirection() {
       TravelMenuView travelMenu = new TravelMenuView(){};
       travelMenu.display();
    }


    }  

