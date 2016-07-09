/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.GameControl;
import byui.cit260.conqueringConqueror.model.Food;
import java.util.ArrayList;

/**
 *
 * @author deannasquire
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
        
        switch(charSel){
            /*case 'V':
                foodIntake();
                break;
            case 'G':
                foodIntake();
                break;
            case 'D':
                foodIntake();
                break;
            case 'F':
                foodIntake();
                break;
            case 'L':
                foodIntake();
                break;
            case 'M':
                foodIntake();
                break;    
            case 'B':
                foodIntake();
                break;*/
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
        
        /*private void foodIntake(){
            
            
        
    }*/
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
    }




