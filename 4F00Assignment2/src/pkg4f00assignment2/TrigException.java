/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4f00assignment2;

/**
 *
 * @author Param
 */
public class TrigException extends RuntimeException {

    public TrigException() {
        super("Invalid angle!");
    }

    public TrigException(String message) {
        super(message);
    }
}
