/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deannasquire
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test Case of calcPlayerStrengthAfterMovement method, 
     * of class PlayerControl.
     */
    @Test
    public void test1CalcPlayerStrengthAfterMovement() {
        System.out.println("\t Test for calcPlayerStrengthAfterMovement ");
        
     /**
     * Test Case1 
     **/ 
        System.out.println("\t Test Case #1 for Player Strength After Movement");
        double strength = 50.0;
        double movementStrength = 2.0;
        double maxStrength = 55.0;
        PlayerControl instance = new PlayerControl();
        double expResult = 48.0;
        
        
        double result = instance.calcPlayerStrengthAfterMovement(strength, 
                movementStrength, maxStrength);
        
        
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void test2CalcPlayerStrengthAfterMovement() {
        System.out.println("\t Test for calcPlayerStrengthAfterMovement ");
    /**
     * Test Case2 
     **/ 
        System.out.println("\t Test Case #2");
        double strength = 0.0;
        double movementStrength = 2.0;
        double maxStrength = 55.0;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        
        
        double result = instance.calcPlayerStrengthAfterMovement(strength, 
                movementStrength, maxStrength);
        
        
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test Case3 of calcPlayerStrengthAfterMovement method, 
     * of class PlayerControl.
     */
    @Test
    public void test3CalcPlayerStrengthAfterMovement() {
        System.out.println("\t Test Case #3 for Player Strength After Movement");
        double strength = 2.0;
        double movementStrength = 2.0;
        double maxStrength = 55.0;
        PlayerControl instance = new PlayerControl();
        double expResult = 0.0;
        
        
        double result = instance.calcPlayerStrengthAfterMovement(strength, 
                movementStrength, maxStrength);
        
        
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test1 of calcPlayerStrengthAfterBattle method, of class PlayerControl.
     */
    @Test
    public void test1CalcPlayerStrengthAfterBattle() {
        System.out.println("\t Test Case #1 for Player Strength After Battle");
        double strength = 50.0;
        double maxStrength = 55.0;
        double percentageOfStrength = 5.0;
        PlayerControl instance = new PlayerControl();
        double expResult = 49.5;
        
        
        double result = instance.calcPlayerStrengthAfterBattle(strength, 
                maxStrength, percentageOfStrength);
        
        
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test2 of calcPlayerStrengthAfterBattle method, of class PlayerControl.
     */
    @Test
    public void test2CalcPlayerStrengthAfterBattle() {
        System.out.println("\t Test Case #2 for Player Strength After Battle");
        double strength = -1.0;
        double maxStrength = 55.0;
        double percentageOfStrength = -10.0;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        
        
        double result = instance.calcPlayerStrengthAfterBattle(strength, 
                maxStrength, percentageOfStrength);
        
        
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test3 of calcPlayerStrengthAfterBattle method, of class PlayerControl.
     */
    @Test
    public void test3CalcPlayerStrengthAfterBattle() {
        System.out.println("\t Test Case #3 for Player Strength After Battle");
        double strength = 0.0;
        double maxStrength = 55.0;
        double percentageOfStrength = 0.0;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        
        
        double result = instance.calcPlayerStrengthAfterBattle(strength, 
                maxStrength, percentageOfStrength);
        
        
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test1 of calcPlayerStrengthAfterFood method, of class PlayerControl.
     */
    @Test
    public void test1CalcPlayerStrengthAfterFood() {
        System.out.println("\t Test Case #1 for Player Strength After Food");
        double strength = 49.0;
        double foodStrength = 5.0;
        double maxStrength = 55.0;
        PlayerControl instance = new PlayerControl();
        double expResult = 54.0;
        
        
        double result = instance.calcPlayerStrengthAfterFood(strength, 
                foodStrength, maxStrength);
       
        
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test2 of calcPlayerStrengthAfterFood method, of class PlayerControl.
     */
    @Test
    public void test2CalcPlayerStrengthAfterFood() {
        System.out.println("\t Test Case #2 for Player Strength After Food");
        double strength = -3.0;
        double foodStrength = 2.0;
        double maxStrength = 55.0;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        
        
        double result = instance.calcPlayerStrengthAfterFood(strength, 
                foodStrength, maxStrength);
       
        
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test3 of calcPlayerStrengthAfterFood method, of class PlayerControl.
     */
    @Test
    public void test3CalcPlayerStrengthAfterFood() {
        System.out.println("\t Test Case #3 for Player Strength After Food");
        double strength = 0.0;
        double foodStrength = 0.0;
        double maxStrength = 55.0;
        PlayerControl instance = new PlayerControl();
        double expResult = -1.0;
        
        
        double result = instance.calcPlayerStrengthAfterFood(strength, 
                foodStrength, maxStrength);
       
        
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcPlayerMaxCarry method, of class PlayerControl.
     */
    @Test
    public void testCalcPlayerMaxCarry() {
        System.out.println("calcPlayerMaxCarry");
        
        /****************************
         * Test case #1
        ***************************/
        System.out.println("\tTest case #1");
        
        // input values for test case #1
        double strength = 50;
        double maxCarry = 0.0;
        
        double expResult = 5; // expected output returned value
        
        // create instance of PlayerControl class
        PlayerControl instance = new PlayerControl();
        
        // call function to run test
        double result = instance.calcPlayerMaxCarry(strength, maxCarry);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #2
        ***************************/
        System.out.println("\tTest case #2");
        
        // input values for test case #2
        strength = -1;
        maxCarry = 0.0;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcPlayerMaxCarry(strength, maxCarry);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #3
        ***************************/
        System.out.println("\tTest case #3");
        
        // input values for test case #3
        strength = 9;
        maxCarry = 0.0;
        
        expResult = 0; // expected output returned value
        
        // call function to run test
        result = instance.calcPlayerMaxCarry(strength, maxCarry);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);

    }


    /**
     * Test of calcPlayerMaxStrength method, of class PlayerControl.
     */
    @Test
    public void testCalcPlayerMaxStrength() {
        System.out.println("calcPlayerMaxStrength");
        
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest case #1");
        
        // input values for test case #1
        double maxStrength = 70;
        
        double expResult = 84; // expected output returned value
        
        // create instance of PlayerControl Class
        PlayerControl instance = new PlayerControl();
        
        // call function to run test
        double result = instance.calcPlayerMaxStrength(maxStrength);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /****************************
         * Test case #2
         ***************************/
        System.out.println("\tTest case #2");
        
        // input values for test case #2
        maxStrength = -1;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcPlayerMaxStrength(maxStrength);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /****************************
         * Test case #3
         ***************************/
        System.out.println("\tTest case #3");
        
        // input values for test case #3
        maxStrength = 0;
        
        expResult = 0; // expected output returned value
        
        // call function to run test
        result = instance.calcPlayerMaxStrength(maxStrength);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);

    }
    
}
