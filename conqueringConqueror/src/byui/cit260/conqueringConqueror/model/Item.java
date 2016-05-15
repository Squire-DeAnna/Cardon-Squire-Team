/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Erika
 */
public class Item implements Serializable{
    
    // class instance variables
    private String name;
    private double weight;
    private double quantity;
    private double strengthIncrease;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getStrengthIncrease() {
        return strengthIncrease;
    }

    public void setStrengthIncrease(double strengthIncrease) {
        this.strengthIncrease = strengthIncrease;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.strengthIncrease) ^ (Double.doubleToLongBits(this.strengthIncrease) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strengthIncrease) != Double.doubleToLongBits(other.strengthIncrease)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", weight=" + weight + ", quantity=" + quantity + ", strengthIncrease=" + strengthIncrease + '}';
    }
    
    
}
