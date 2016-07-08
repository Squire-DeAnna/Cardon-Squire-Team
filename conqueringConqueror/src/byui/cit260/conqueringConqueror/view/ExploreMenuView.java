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
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

        private void attack() {
        AttackMenuView attackMenu = new AttackMenuView() {};
        attackMenu.display();
        }

        private void flee() {
            this.console.println("You have chossen to flee from the enemy " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
        }

        private void pickUpLoot() {
            this.console.println("You have chossen to pick up found treasures " + " NOT IMPLEMENTED YET"); //To change body of generated methods, choose Tools | Templates.
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

