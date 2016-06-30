/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import conqueringconqueror.ConqueringConqueror;

/**
 *
 * @author deannasquire
 */
public abstract class TeamMenuView extends View {
 
   
    public TeamMenuView(){
     super ("\n************************************"
          + "\n|              Team                |"
          + "\n************************************"
            + "\n You currently have" +  " on your team"
            + "\nQ - Quit");
    }
    
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'Q':
                return true;
             
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
        
        /*private void drinkIntake(){
            
            
        
    }*/
    }
}