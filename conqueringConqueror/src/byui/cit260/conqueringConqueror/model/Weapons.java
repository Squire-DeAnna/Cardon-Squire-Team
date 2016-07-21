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
 * @author Jason
 */
public class Weapons implements Serializable {
    
    private String name;
    private String description;
    private double healthDecrease;
    private double attackDamage;
    private WeaponsType weaponsType;
    
    public Weapons(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHealthDecrease() {
        return healthDecrease;
    }

    public void setHealthDecrease(double healthDecrease) {
        this.healthDecrease = healthDecrease;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public WeaponsType getWeaponsType() {
        return weaponsType;
    }

    public void setWeaponsType(WeaponsType weaponsType) {
        this.weaponsType = weaponsType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.healthDecrease) ^ (Double.doubleToLongBits(this.healthDecrease) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.attackDamage) ^ (Double.doubleToLongBits(this.attackDamage) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.weaponsType);
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
        final Weapons other = (Weapons) obj;
        if (Double.doubleToLongBits(this.healthDecrease) != Double.doubleToLongBits(other.healthDecrease)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attackDamage) != Double.doubleToLongBits(other.attackDamage)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapons{" + "name=" + name + ", description=" + description + ", healthDecrease=" + healthDecrease + ", attackDamage=" + attackDamage + ", weaponsType=" + weaponsType + '}';
    }
    
    

}