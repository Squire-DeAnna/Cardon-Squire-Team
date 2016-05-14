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
import byui.cit260.conqueringConqueror.model.Items;
import byui.cit260.conqueringConqueror.model.Location;
 

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
       
       
       
       Items itemsOne = new Items();
       
       itemsOne.setInventoryType("dagger");
       itemsOne.setItemWeight(7);
       itemsOne.setQuantityInInventory(3);
       itemsOne.setStrengthIncrease(2);
       
       String itemsInfo = itemsOne.toString();
       System.out.println(itemsInfo);
       
       
       
       Location locationOne = new Location();
       
       locationOne.setRow(2);
       locationOne.setColumn(4);
       locationOne.setVisited(true);
       locationOne.setDescription("enemy found");
       locationOne.setResourceAvailable("food found");
       locationOne.setResourceType("food");
       
       String locationInfo = locationOne.toString();
       System.out.println(locationInfo);
    }
}
    
