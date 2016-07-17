/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Erika
 */
public class Player implements Serializable {

    // class instance variables
    private String name;
    private double strength;
    private double maxStrength;
    private double currentCarry;
    private double maxCarry;
    private double attackPoints;
    private double health;
    List<Item> inventory;
    List<Hero> team;
    Location location;
    Food food;
    Drink drink;

    public Player() {
        inventory = new ArrayList<>();
        team = new ArrayList<>();
    }
    
    public void addItem(Item i){
        inventory.add(i);
    }
    
    public void addHero(Hero h){
        team.add(h);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
    
    public double getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(double maxStrength) {
        this.maxStrength = maxStrength;
    }

    public double getCurrentCarry() {
        return currentCarry;
    }

    public void setCurrentCarry(double currentCarry) {
        this.currentCarry = currentCarry;
    }

    public double getMaxCarry() {
        return maxCarry;
    }

    public void setMaxCarry(double maxCarry) {
        this.maxCarry = maxCarry;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.maxStrength) ^ (Double.doubleToLongBits(this.maxStrength) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.currentCarry) ^ (Double.doubleToLongBits(this.currentCarry) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.maxCarry) ^ (Double.doubleToLongBits(this.maxCarry) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxStrength) != Double.doubleToLongBits(other.maxStrength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentCarry) != Double.doubleToLongBits(other.currentCarry)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCarry) != Double.doubleToLongBits(other.maxCarry)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", strength=" + strength + ", maxStrength=" + maxStrength + ", currentCarry=" + currentCarry + ", maxWeight=" + maxCarry + '}';
    }

    /*public void setLocation(Location location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}
