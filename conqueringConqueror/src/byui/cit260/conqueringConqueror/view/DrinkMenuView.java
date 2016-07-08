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
        
        switch(charSel){
            /*case 'W':
                drinkIntake();
                break;
            case 'J':
                drinkIntake();
                break;
            case 'M':
                drinkIntake();
                break;
            case 'N':
                drinkIntake();
                break;
            */
            case 'Q':
                return true;
             
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
        
        /*private void drinkIntake(){
            
            
        
    }*/
    }
}
    

