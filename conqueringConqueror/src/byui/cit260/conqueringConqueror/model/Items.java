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
public class Items  implements Serializable{
    
    //class instance variables
    private String inventoryType;
    private double itemWeight;
    private double quantityInInventory;
    private double strengthIncrease;

    public Items() {
    }

    
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public double getQuantityInInventory() {
        return quantityInInventory;
    }

    public void setQuantityInInventory(double quantityInInventory) {
        this.quantityInInventory = quantityInInventory;
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
        hash = 47 * hash + Objects.hashCode(this.inventoryType);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.itemWeight) ^ (Double.doubleToLongBits(this.itemWeight) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.quantityInInventory) ^ (Double.doubleToLongBits(this.quantityInInventory) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.strengthIncrease) ^ (Double.doubleToLongBits(this.strengthIncrease) >>> 32));
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
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.itemWeight) != Double.doubleToLongBits(other.itemWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityInInventory) != Double.doubleToLongBits(other.quantityInInventory)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strengthIncrease) != Double.doubleToLongBits(other.strengthIncrease)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "inventoryType=" + inventoryType + ", itemWeight=" + itemWeight + ", quantityInInventory=" + quantityInInventory + ", strengthIncrease=" + strengthIncrease + '}';
    }
    
    
}
