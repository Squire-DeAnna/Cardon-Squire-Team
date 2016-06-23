/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringconqueror;

import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Hero;
import byui.cit260.conqueringConqueror.model.Item;
import byui.cit260.conqueringConqueror.model.Location;
import byui.cit260.conqueringConqueror.model.Map;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;
import byui.cit260.conqueringConqueror.view.StartProgramView;

/**
 *
 * @author deannasquire
 */
public class ConqueringConqueror {
    
    private static Player player;
    private static Game game;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      StartProgramView startProgram = new StartProgramView();
      
      startProgram.startProgram(); 
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ConqueringConqueror.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        ConqueringConqueror.game = game;
    }
}
    
