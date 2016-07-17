/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.GameControl;
import byui.cit260.conqueringConqueror.model.Food;
import byui.cit260.conqueringConqueror.model.FoodType;
import byui.cit260.conqueringConqueror.model.Player;
import java.util.ArrayList;

/**
 *
 * @author deannasquire
 * @author Jason updated 7/16/16
 */
public abstract class EatMenuView extends View {
   
    public EatMenuView(){
     super ("\n************************************"
          + "\n|             Eat Menu             |"
            + "\n************************************"
            + "\n You currently have" + "..." + " in your pack"
            + "\n What would you like to EAT?"
            + "\nV - Venison"
            + "\nG - Goat"
            + "\nD - Dates"
            + "\nF - Grapes"
            + "\nL - Locusts"
            + "\nM - Lamb"
            + "\nB - Berries"
            + "\nR - Print Food Report"
            + "\nQ - Quit"
     );
    }
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        /* Venison,
    Goat,
    Dates,
    Grapes,
    Locusts,
    Lamb,
    Berries */
        
        switch(charSel){
            case 'G':
                eatGoat();
                break;
            case 'V':
                eatVenison();
                break;
            case 'D':
                eatDates();
                break;
            case 'P':
                eatGrapes();
                break;
            case 'L':
                eatLocusts();
                break;
            case 'M':
                eatLamb();
                break;    
            case 'B':
                eatBerries();
                break;
            case 'R':
                printFoodReport();
                break;
            case 'Q':
                return true;
             
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
        
       
    }

    private void printFoodReport() {
        
         this.console.println("\nEnter the file path for file where the report "
                                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
             ArrayList<Food> Foodlist = null;
            // save the game to the specified file
            GameControl.printFoodReport(Foodlist, filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void eatGoat() {
        
        Player player = new Player();
        player.getHealth();
        Food food = new Food();
        food.setFoodType(FoodType.Goat);
        food.setHealthIncrease(10);
            if(player.getHealth() == 100){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + food.getHealthIncrease();
       this.console.println(player.getName() + "\n Has chossen to eat " + food.getFoodType() + " and health has increased to " + playerHealth);
            }
    }

    private void eatVenison() {
        Player player = new Player();
        Food food = new Food();
        food.setFoodType(FoodType.Venison);
        food.setHealthIncrease(8);
        if(player.getHealth() == 100){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + food.getHealthIncrease();
       this.console.println(player.getName() + "\n Has chossen to eat " + food.getFoodType() + " and health has increased to " + playerHealth);
        }
    }

    private void eatDates() {
        Player player = new Player();
        Food food = new Food();
        food.setFoodType(FoodType.Dates);
        food.setHealthIncrease(6);
        if(player.getHealth() == 100){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + food.getHealthIncrease();
       this.console.println(player.getName() + "\n Has chossen to eat " + food.getFoodType() + " and health has increased to " + playerHealth);
        }
    }

    private void eatGrapes() {
        Player player = new Player();
        Food food = new Food();
        food.setFoodType(FoodType.Grapes);
        food.setHealthIncrease(6);
        double playerHealth = player.getHealth() + food.getHealthIncrease();
        if(player.getHealth() == 100){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
       this.console.println(player.getName() + "\n Has chossen to eat " + food.getFoodType() + " and health has increased to " + playerHealth);
        }
    }

    private void eatLocusts() {
        Player player = new Player();
        Food food = new Food();
        food.setFoodType(FoodType.Locusts);
        food.setHealthIncrease(12);
        if(player.getHealth() == 100){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + food.getHealthIncrease();
       this.console.println(player.getName() + "\n Has chossen to eat " + food.getFoodType() + " and health has increased to " + playerHealth);
        }
    }

    private void eatLamb() {
        Player player = new Player();
        Food food = new Food();
        food.setFoodType(FoodType.Lamb);
        food.setHealthIncrease(4);
        if(player.getHealth() == 100){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + food.getHealthIncrease();
       this.console.println(player.getName() + "\n Has chossen to eat " + food.getFoodType() + " and health has increased to " + playerHealth);
        }
    }

    private void eatBerries() {
        Player player = new Player();
        Food food = new Food();
        food.setFoodType(FoodType.Berries);
        food.setHealthIncrease(2);
        if(player.getHealth() == 100 ){
                this.console.println("Your health is at 100% you do not need any food right now");
            }else{
        double playerHealth = player.getHealth() + food.getHealthIncrease();
       this.console.println(player.getName() + "\n Has chossen to eat" + food.getFoodType() +  "and health has increased to " + playerHealth);
        }
    }
    }




