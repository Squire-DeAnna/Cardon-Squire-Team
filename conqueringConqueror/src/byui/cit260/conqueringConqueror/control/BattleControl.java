/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Location;
import byui.cit260.conqueringConqueror.model.Map;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;

/**
 *
 * @author deannasquire
 */
public class BattleControl {
    
    public static void attackEnemy(Game game, Villain villain ){
        
        Player player = game.getPlayer();
        villain.getName();
        villain.getAttackPoints();
        villain.getHealth();
        player.getStrength();
        player.getAttackPoints();
        player.getHealth();
        
        if(player.getHealth() != 0 && villain.getHealth() != 0){
            player.getAttackPoints();
            villain.getAttackPoints();
            
        }
}
}
