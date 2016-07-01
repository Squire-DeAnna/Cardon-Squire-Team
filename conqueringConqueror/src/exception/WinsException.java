/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Jason
 */
public class WinsException extends Exception {

    public WinsException() {
    }

    public WinsException(String message) {
        super(message);
    }

    public WinsException(String message, Throwable cause) {
        super(message, cause);
    }

    public WinsException(Throwable cause) {
        super(cause);
    }

    public WinsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
