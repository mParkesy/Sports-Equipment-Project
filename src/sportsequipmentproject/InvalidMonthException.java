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
public class InvalidMonthException extends Exception {

    /**
     * Creates a new instance of <code>InvalidMonthException</code> without
     * detail message.
     */
    public InvalidMonthException() {
    }

    /**
     * Constructs an instance of <code>InvalidMonthException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidMonthException(String msg) {
        super(msg);
    }
}
