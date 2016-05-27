/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erika
 */
public class QuestionControlTest {
    
    public QuestionControlTest() {
    }

    /**
     * Test of calcAreaTrapezoid method, of class QuestionControl.
     */
    @Test
    public void testCalcAreaTrapezoid() {
        System.out.println("calcAreaTrapezoid");
        
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double base1 = 17;
        double base2 = 24;
        double height = 32;
        
        double expResult = 656; // expected output returned value
        
        // create instance of QuestionControl class
        QuestionControl instance = new QuestionControl();
        
        // call function to run test
        double result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #2
         ***************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        base1 = -1;
        base2 = 24;
        height = 32;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #3
         ***************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        base1 = 17;
        base2 = -1;
        height = 32;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #4
         ***************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        base1 = 17;
        base2 = 24;
        height = -1;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #5
         ***************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        base1 = 0;
        base2 = 24;
        height = 32;
        
        expResult = 0; // expected output returned value
        
        // call function to run test
        result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #6
         ***************************/
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        base1 = 17;
        base2 = 0;
        height = 32;
        
        expResult = 0; // expected output returned value
        
        // call function to run test
        result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /****************************
         * Test case #7
         ***************************/
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        base1 = 17;
        base2 = 24;
        height = 0;
        
        expResult = 0; // expected output returned value
        
        // call function to run test
        result = instance.calcAreaTrapezoid(base1, base2, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);

    }
    
}
