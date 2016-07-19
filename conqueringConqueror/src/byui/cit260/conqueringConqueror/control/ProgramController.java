/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import byui.cit260.conqueringConqueror.model.Drink;
import byui.cit260.conqueringConqueror.model.Food;
import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Hero;
import byui.cit260.conqueringConqueror.model.Map;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;
import byui.cit260.conqueringConqueror.model.Weapons;
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
        
        populateMapWithFood(gameMap);
        
        populateMapWithDrinks(gameMap);
        
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
        
        public static void populateMapWithFood(Map map) {
            
        List<Food> food = createFoodList();
        
        for(Food f : food) {
            
            boolean success = false;
            
            do {
                int col = (int) (Math.random() * Map.NUM_COLS);
                int row = (int) (Math.random() * Map.NUM_ROWS);
                
                success = false;
                
                if(map.getLocation(row, col).getFood() == null) {
                    map.getLocation(row, col).setFood(f);
                    success = true;
                }
                
            } while(success == false);
        }
            
        }
        
        public static void populateMapWithDrinks(Map map) {
            
        List<Drink> drinks = createDrinkList();
        
        for(Drink d : drinks) {
            
            boolean success = false;
            
            do {
                int col = (int) (Math.random() * Map.NUM_COLS);
                int row = (int) (Math.random() * Map.NUM_ROWS);
                
                success = false;
                
                if(map.getLocation(row, col).getDrink() == null) {
                    map.getLocation(row, col).setDrink(d);
                    success = true;
                }
                
            } while(success == false);
        }
            
        }
        
        public static void populateMapWithWeapons(Map map) {
            
        List<Weapons> weapon = createWeaponList();
        
        for(Weapons w : weapon) {
            
            boolean success = false;
            
            do {
                int col = (int) (Math.random() * Map.NUM_COLS);
                int row = (int) (Math.random() * Map.NUM_ROWS);
                
                success = false;
                
                if(map.getLocation(row, col).getWeapon() == null) {
                    map.getLocation(row, col).setWeapon(w);
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
    
    public static List<Food> createFoodList() {
        
        List<Food> foodList = new ArrayList<>();
        
        Food venison = new Food();
        venison.setName("Venison");
        venison.setHealthIncrease(4);
        foodList.add(venison);
        
        Food goat = new Food();
        goat.setName("Goat");
        goat.setHealthIncrease(3);
        foodList.add(goat);
        
        Food dates = new Food();
        dates.setName("Dates");
        dates.setHealthIncrease(4);
        foodList.add(dates);
        
        Food grapes = new Food();
        grapes.setName("Grapes");
        grapes.setHealthIncrease(4);
        foodList.add(grapes);
        
        Food locust = new Food();
        locust.setName("Locust");
        locust.setHealthIncrease(2);
        foodList.add(locust);
        
        Food lamb = new Food();
        lamb.setName("Lamb");
        lamb.setHealthIncrease(6);
        foodList.add(lamb);
        
        Food berries = new Food();
        berries.setName("Berries");
        berries.setHealthIncrease(5);
        foodList.add(berries);
        
        return foodList;
    }
    
    public static List<Drink> createDrinkList() {
        
        List<Drink> drinkList = new ArrayList<>();
        
        Drink water = new Drink();
        water.setName("Water");
        water.setHealthIncrease(5);
        drinkList.add(water);
        
        Drink juice = new Drink();
        juice.setName("Juice");
        juice.setHealthIncrease(4);
        drinkList.add(juice);
        
        Drink milk = new Drink();
        milk.setName("Milk");
        milk.setHealthIncrease(3);
        drinkList.add(milk);
        
        Drink nectar = new Drink();
        nectar.setName("Nectar of the Gods");
        nectar.setHealthIncrease(6);
        drinkList.add(nectar);
        
        return drinkList;
    }
    
    public static List<Weapons> createWeaponList() {
        
        List<Weapons> weaponList = new ArrayList<>();
        
        Weapons sword = new Weapons();
        sword.setName("Sword");
        sword.setAttackDamage(12);
        weaponList.add(sword);
        
        Weapons axe = new Weapons();
        axe.setName("Axe");
        axe.setAttackDamage(9);
        weaponList.add(axe);
        
        Weapons knife = new Weapons();
        knife.setName("Knife");
        knife.setAttackDamage(7);
        weaponList.add(knife);
        
        Weapons fists = new Weapons();
        fists.setName("Fists");
        fists.setAttackDamage(4);
        weaponList.add(fists);
        
        return weaponList;
    }
    
}
