/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.model;

import java.io.Serializable;

/**
 *
 * @author Erika
 */
public class Game implements Serializable{
    
    private Player player;
    
    // class instance variables
    private double totalTime;
    // I know that is not correct, but using it as a placeholder.

    
    public Game() {
    }
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
     public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }   
}
