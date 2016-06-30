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
            case 'Q':
                return true;
             
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
        
        /*private void foodIntake(){
            
            
        
    }*/
    }
}



