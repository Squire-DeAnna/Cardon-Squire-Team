/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Hero;
import byui.cit260.conqueringConqueror.model.Map;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;
import conqueringconqueror.ConqueringConqueror;
import java.util.ArrayList;
import java.util.List;

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
        
        Map gameMap = new Map();
        game.setMap(gameMap);
        
        populateMapWithHeroes(gameMap);
        
        populateMapWithVillains(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        ConqueringConqueror.setGame(game);
    }
    
    public static void populateMapWithHeroes(Map map) {
        
        List<Hero> heroes = createHeroList();
        
        for(Hero h : heroes){
            
            boolean success = false;
            
            do {
                int col = (int) (Math.random() * Map.NUM_COLS);
                int row = (int) (Math.random() * Map.NUM_ROWS);
                
                success = false;
                
                if(map.getLocation(row, col).getHero() == null && map.getLocation(row, col).getVillain() == null) {
                    map.getLocation(row, col).setHero(h);
                    success = true;
                }
                
            } while(success == false);
    
        }
        
    }
        // may need to do villain differently since they aren't added to the heroes "team"
        public static void populateMapWithVillains(Map map) {
        
        List<Villain> villains = createVillainList();
        
        for(Villain v : villains){
            
            boolean success = false;
            
            do {
                int col = (int) (Math.random() * Map.NUM_COLS);
                int row = (int) (Math.random() * Map.NUM_ROWS);
                
                success = false;
                
                if(map.getLocation(row, col).getVillain() == null && map.getLocation(row, col).getHero() == null) {
                    map.getLocation(row, col).setVillain(v);
                    success = true;
                }
                
            } while(success == false);
    
        }
        
    }
    
    public static List<Hero> createHeroList() {
        
        List<Hero> heroList = new ArrayList<>();
        
        Hero wizard = new Hero();
        wizard.setName("Wizard");
        wizard.setAttackPoints(10);
        wizard.setHealth(40);
        heroList.add(wizard);
        
        
        Hero knight = new Hero();
        knight.setName("Knight");
        knight.setAttackPoints(8);
        knight.setHealth(35);
        heroList.add(knight);
        
        Hero akki = new Hero();
        akki.setName("Akki");
        akki.setAttackPoints(9);
        akki.setHealth(30);
        heroList.add(akki);
        
        return heroList;
    }
    
    public static List<Villain> createVillainList() {
        
        List<Villain> villainList = new ArrayList<>();
        
        Villain lugalzagesi = new Villain();
        lugalzagesi.setName("Lugalzagesi");
        lugalzagesi.setAttackPoints(10);
        lugalzagesi.setHealth(40);
        villainList.add(lugalzagesi);
        
        
        Villain umma = new Villain();
        umma.setName("Umma");
        umma.setAttackPoints(8);
        umma.setHealth(35);
        villainList.add(umma);
        
        Villain zababa = new Villain();
        zababa.setName("Zababa");
        zababa.setAttackPoints(9);
        zababa.setHealth(30);
        villainList.add(zababa);
        
        Villain sargon = new Villain();
        sargon.setName("Sargon");
        sargon.setAttackPoints(20);
        sargon.setHealth(150);
        villainList.add(sargon);
        
        return villainList;
    }
    
}
