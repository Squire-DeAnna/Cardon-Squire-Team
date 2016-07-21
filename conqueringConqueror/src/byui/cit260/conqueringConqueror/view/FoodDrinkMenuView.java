/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.model.Food;
import byui.cit260.conqueringConqueror.model.FoodType;
import java.sql.Array;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author deannasquire
 */
public abstract class FoodDrinkMenuView extends View {
    public FoodDrinkMenuView(){
     super ("\n************************************"
            + "\n|          Food/Drink Menu          |"
            + "\n************************************"
            + "\n Would you like to EAT or DRINK"
            + "\nE - Eat"
            + "\nD - Drink"
            + "\nS - Save"
            + "\nF - See available food"
            + "\nA - Short list of food"
            + "\nQ - Quit");
    }

    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
             case 'E':
                eatFood();
                break;
            case 'D':
                drink();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'F':
                displayAvailableFood();
                break;    
            case 'A':
                displayFood();
                break;
            case 'Q':
                return true;
            
             
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }   
        private void eatFood() {
        EatMenuView eatMenu = new EatMenuView() {};
        eatMenu.display();
    }
         private void drink() {
        DrinkMenuView drinkMenu = new DrinkMenuView() {};
        drinkMenu.display();
    }
         
         private void saveCurrentGame() {
        this.console.println("\nCALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

    private void displayAvailableFood() {
       
        for (FoodType foodType : FoodType.values()) {
            this.console.println("The available food Items are: " + foodType.name());
        }
    }

    private void displayFood() {
        String[] FoodType = { "Venison", "Goat", "Dates", "Grapes", "Locusts", "Lamb", "Berries"};
        
       String text = " ";
       for (int i = 2; i <= 4; i++ ){
           text += FoodType[i];
           this.console.println(FoodType[i] + " are a food type of the game");
    }
    }

}
