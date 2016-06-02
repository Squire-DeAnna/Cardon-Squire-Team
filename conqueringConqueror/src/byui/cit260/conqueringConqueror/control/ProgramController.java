/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Player;
import conqueringconqueror.ConqueringConqueror;

/**
 *
 * @author Erika
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName){
        
        if(playerName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        game.setPlayer(player);
        ConqueringConqueror.setGame(game);
    }
    
}
