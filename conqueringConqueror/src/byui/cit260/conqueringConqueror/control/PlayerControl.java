/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import byui.cit260.conqueringConqueror.model.Item;
import java.util.List;

/**
 *
 * @author deannasquire
 */



public class PlayerControl {
    
    public double calcPlayerStrengthAfterMovement(double strength, 
            double movementStrength, double maxStrength) {

	if (strength <= 0.0) {
		return -1.0;
        }

	if (strength >= maxStrength) {
		return maxStrength;
        }


	movementStrength = 2;
	strength = strength - movementStrength;

	return strength;

    }
        
    public double calcPlayerStrengthAfterBattle(double strength, 
            double maxStrength, double percentageOfStrength){

	if (strength <= 0.0) {
		return -1.0;
        }

	if (strength >= maxStrength) {
		return maxStrength;
        }

	percentageOfStrength = strength * 0.01;
        strength = strength - percentageOfStrength;
	return strength;
    }

        
    public double calcPlayerStrengthAfterFood(double strength, 
            double foodStrength, double maxStrength){

	if (strength <= 0.0) {
		return -1.0;
        }

	if (strength >= maxStrength) {
		return maxStrength;
        }

	strength = strength + foodStrength;

	return strength;
    }
    
    /**
    *
    * @author Erika
    */
    
    public double calcPlayerMaxCarry(double strength, double maxCarry){
        
        if (strength < 0) {
            return -1.0;
        }
        
        if (strength <= 9) {
            return 0;
        }
        
        maxCarry = strength * .1;
        
        return maxCarry;
        
    }
    
    public double calcPlayerMaxStrength(double maxStrength){
        
        if (maxStrength < 0) {
            return -1.0;
        }
        
        if (maxStrength == 0) {
            return 0;
        }
        
        maxStrength = maxStrength * 1.2;
        
        return maxStrength;
    }
    
    public double calcPlayerCurrentCarry(List<Item> items){
        
        if (items == null || items.size() == 0) {
            return 0;
        }
        
        double currentCarry = 0;
        
        for(Item item : items){
            currentCarry += item.getWeight();
        }
        
        return currentCarry;
    }
}
