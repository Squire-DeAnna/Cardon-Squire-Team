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
      
      playerOne.setName("Lizzy");
      playerOne.setStrength(25);
      playerOne.setCurrentCarry(40);
      playerOne.setMaxWeight(60);
      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      
      
      
      Game gameOne = new Game();
      
      gameOne.setTotalTime(961);
      
      String gameInfo = gameOne.toString();
      System.out.println(gameInfo);
      
      
      
      Map mapOne = new Map();
      
      
      
      Location locationOne = new Location();
      
      locationOne.setLocationType("Bob");
      locationOne.setDescription("Bobby");
      locationOne.setVisited(true);
      
      String locationInfo = locationOne.toString();
      System.out.println(locationInfo);
      
      
      
      Item itemOne = new Item();
      
      itemOne.setName("dagger");
      itemOne.setWeight(5);
      itemOne.setQuantity(1);
      itemOne.setStrengthIncrease(4.2);
      
      String itemInfo = itemOne.toString();
      System.out.println(itemInfo);
      
      
      
      Hero heroOne = new Hero();
      
      heroOne.setName("Maximus");
      heroOne.setDescription("akdsjflkajdflk");
      heroOne.setHitPoints(20);
      
      String heroInfo = heroOne.toString();
      System.out.println(heroInfo);
      
      
      
      Villain villainOne = new Villain();
      
      villainOne.setName("Maximus");
      villainOne.setDescription("akdsjflkajdflk");
      villainOne.setHitPoints(20);
      
      String villainInfo = villainOne.toString();
      System.out.println(villainInfo);
    }
}
    
