/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.model.Drink;
import byui.cit260.conqueringConqueror.model.DrinkType;
import byui.cit260.conqueringConqueror.model.Player;

/**
 *
 * @author deannasquire
 * @author Jason updated 7/16/16
 */
public abstract class DrinkMenuView extends View {
    
   
    public DrinkMenuView(){
     super ("\n************************************"
          + "\n|            Drink Menu            |"
          + "\n************************************"
            + "\n You currently have" + "..." + " in your pack"
            + "\n What would you like to Drink?"
            + "\nW - Water"
            + "\nJ - Juice"
            + "\nM - Milk"
            + "\nN - Necter Of The Gods"
            + "\nQ - Quit"
     );
    }
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        /* Water,
    Juice,
    Milk,
    NectarOfTheGods */
        
        switch(charSel){
            case 'W':
                drinkWater();
                break;
            case 'J':
                drinkJuice();
                break;
            case 'M':
                drinkMilk();
                break;
            case 'N':
                drinkNectarOfGods();
                break;
            
            case 'Q':
                return true;
             
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
        
        
    }

    private void drinkWater() {
        Player player = new Player();
        player.getHealth();
        Drink drink = new Drink();
        drink.setDrinkType(DrinkType.Water);
        drink.setHealthIncrease(1);
        if(player.getHealth() == 100){
                this.console.println("Your heath is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + drink.getHealthIncrease();
        this.console.println(player.getName() + "has chosen to drink " + drink.getDrinkType() + " and has heath has increased to " + playerHealth);
        }
    }

    private void drinkJuice() {
        Player player = new Player();
        player.getHealth();
        Drink drink = new Drink();
        drink.setDrinkType(DrinkType.Juice);
        drink.setHealthIncrease(4);
        if(player.getHealth() == 100){
                this.console.println("Your heath is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + drink.getHealthIncrease();
        this.console.println(player.getName() + "has chosen to drink " + drink.getDrinkType() + " and has heath has increased to " + playerHealth);
        }
    }

    private void drinkMilk() {
        Player player = new Player();
        player.getHealth();
        Drink drink = new Drink();
        drink.setDrinkType(DrinkType.Milk);
        drink.setHealthIncrease(8);
        if(player.getHealth() == 100){
                this.console.println("Your heath is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + drink.getHealthIncrease();
        this.console.println(player.getName() + "has chosen to drink " + drink.getDrinkType() + " and has heath has increased to " + playerHealth);
        }
    }

    private void drinkNectarOfGods() {
        Player player = new Player();
        player.getHealth();
        Drink drink = new Drink();
        drink.setDrinkType(DrinkType.NectarOfTheGods);
        drink.setHealthIncrease(15);
        if(player.getHealth() == 100){
                this.console.println("Your heath is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + drink.getHealthIncrease();
        this.console.println(player.getName() + "has chosen to drink " + drink.getDrinkType() + " and has heath has increased to " + playerHealth);
        }
    }
}
    

