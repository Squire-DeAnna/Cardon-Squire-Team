/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

/**
 *
 * @author deannasquire
 */
public class QuestionControl {
    
    public double calcAreaTrapezoid (double base1, double base2, double height) {
      
        if (base1 < 0) { //base1 is negative??
        return -1;
        }

        if (base2 < 0) { //base2 is negative??
        return -1;
        }

        if (height < 0) { //height is negative??
        return -1;
        }

        if (base1 == 0) { //base1 is 0??
        return 0; 
        }

        if (base2 == 0) { //base2 is 0??
        return 0;
        }

        if (height == 0) { //height is 0??
        return 0;
        }

    double bases = (base1 + base2)/2;
    double area = bases * height;
    return area;

        
    } 
    
}
