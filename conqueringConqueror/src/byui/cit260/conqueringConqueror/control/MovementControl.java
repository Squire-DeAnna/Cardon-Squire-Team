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
import exception.MovementException;

/**
 *
 * @author deannasquire
 */
public class MovementControl {
    
    public boolean moveNorth(Game game) throws MovementException {
        
        Player player = game.getPlayer();
        Location currentLocation = game.getPlayer().getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            throw new MovementException("\nYou cannot move north.");
        }
        
        int currentCol = currentLocation.getCol();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        
        return true;
    }
    
    public boolean moveEast(Game game) throws MovementException {
        
        Player player = game.getPlayer();
        Location currentLocation = game.getPlayer().getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == Map.NUM_COLS - 1) {
            throw new MovementException("\nYou cannot move east.");
        }
        
        //other way to write it out...
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() + 1));
        
        return true;
    }
    
    public boolean moveSouth(Game game) throws MovementException {
        
        Player player = game.getPlayer();
        Location currentLocation = game.getPlayer().getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.NUM_ROWS - 1) {
            throw new MovementException("\nYou cannot move south.");
        }
       
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getCol()));
        
        return true;
    }
    
    public boolean moveWest(Game game) throws MovementException{
        
        Player player = game.getPlayer();
        Location currentLocation = game.getPlayer().getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getCol() == 0) {
            throw new MovementException("You cannot move west.");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getCol() - 1));
        
        return true;
    }
    
}
