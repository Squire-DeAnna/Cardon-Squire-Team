/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import conqueringconqueror.ConqueringConqueror;
import java.io.PrintWriter;

/**
 *
 * @author Erika
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = ConqueringConqueror.getOutFile();
    private static final PrintWriter logFile = ConqueringConqueror.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "\n************************************"
            + "\n- ERROR - " + errorMessage
            + "\n************************************");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
