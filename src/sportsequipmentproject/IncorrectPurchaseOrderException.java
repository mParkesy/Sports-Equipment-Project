/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsequipmentproject;

/**
 *
 * @author Parkesy
 */
public class IncorrectPurchaseOrderException extends Exception {

    /**
     * Creates a new instance of <code>IncorrectPurchaseOrderException</code>
     * without detail message.
     */
    public IncorrectPurchaseOrderException() {
    }

    /**
     * Constructs an instance of <code>IncorrectPurchaseOrderException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectPurchaseOrderException(String msg) {
        super(msg);
    }
}
