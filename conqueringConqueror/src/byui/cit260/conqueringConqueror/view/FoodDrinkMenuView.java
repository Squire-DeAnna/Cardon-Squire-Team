/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

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
            case 'Q':
                return true;
             
            default:
                System.out.println("Invalid option");
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
        System.out.println("\nCALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET");
    }

}
