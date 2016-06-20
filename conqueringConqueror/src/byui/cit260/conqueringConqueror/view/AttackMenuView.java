/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import static conqueringconqueror.ConqueringConqueror.getPlayer;

/**
 *
 * @author Jason
 */
public abstract class AttackMenuView extends View{
    
    
    public AttackMenuView(){
    
              super("\n************************************"
            + "\n|             Attack Menu            |"
            + "\n************************************"
            + "\nA - Attack Enemy"
            + "\nF - Flee From Enemy" );
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
            
            
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }

    private void attack() {
        System.out.println(getPlayer().getName() + " has chossen to attack the enemy" + getPlayer());
        
    }

    private void flee() {
        System.out.println(getPlayer().getName() + " has chossen to flee from the enemy");
        GameMenuView gameMenu = new GameMenuView(){};
        gameMenu.display();
    }
}
