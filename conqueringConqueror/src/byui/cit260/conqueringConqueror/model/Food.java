/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.model;

import java.util.Objects;

/**
 *
 * @author Jason
 */
public class Food {
    
    private String name;
    private String description;
    private double healthIncrease;
    private FoodType foodType;
    
    public Food(){
        
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

    public double getHealthIncrease() {
        return healthIncrease;
    }

    public void setHealthIncrease(double healthIncrease) {
        this.healthIncrease = healthIncrease;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.healthIncrease) ^ (Double.doubleToLongBits(this.healthIncrease) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.foodType);
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
        final Food other = (Food) obj;
        if (Double.doubleToLongBits(this.healthIncrease) != Double.doubleToLongBits(other.healthIncrease)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.foodType != other.foodType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", description=" + description + ", healthIncrease=" + healthIncrease + ", foodType=" + foodType + '}';
    }

    
    
}
