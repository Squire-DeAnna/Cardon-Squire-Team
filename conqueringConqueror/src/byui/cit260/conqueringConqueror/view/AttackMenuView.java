/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import static byui.cit260.conqueringConqueror.control.BattleControl.attackEnemy;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;
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
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void attack() {
        Villain villain = new Villain();
        Player player = new Player();
        this.console.println(player.getName() + " has chossen to attack the enemy" + villain.getName());
        AttackVillainView attackVillain = new AttackVillainView();
        attackVillain.display();
        
    }

    private void flee() {
        Villain villain = new Villain();
        Player player = new Player();
        this.console.println(player.getName() + " has chossen to flee from " + villain.getName());
        GameMenuView gameMenu = new GameMenuView(){};
        gameMenu.display();
    }
}
