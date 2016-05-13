/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringconqueror;

import byui.cit260.conqueringConqueror.model.Map;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Character;
import byui.cit260.conqueringConqueror.model.Game;
 

/**
 *
 * @author deannasquire
 */
public class ConqueringConqueror {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Fred Flinstone");
       playerOne.setStrength(6);
       playerOne.setCurrentCarry(10);
       playerOne.setMaxWeight(15);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
      
       Map mapOne = new Map();
       
       mapOne.setColumnCount(5);
       mapOne.setRowCount(5);
       
       String mapInfo = mapOne.toString();
       System.out.println(mapInfo);
       
       
       Character characterOne = new Character();
       
       characterOne.setCoordinates(mapInfo);
       characterOne.setDescription("Likes dinosaurs");
       characterOne.setName("Bam Bam");
       
       String characterInfo = characterOne.toString();
       System.out.println(characterInfo);
       
       
       
       Game gameOne = new Game();
       
       gameOne.setTotalTime(10);
       
       String gameInfo = gameOne.toString();
       System.out.println(gameInfo);
       
    }
}
    
