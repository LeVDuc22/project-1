/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPM.exception;

/**
 *
 * @author Admin
 */
public class InvalidCmndException extends Exception {

    private String invalidCmnd;

    public InvalidCmndException() {
    }

    public InvalidCmndException(String invalidCmnd) {
        this.invalidCmnd = invalidCmnd;
    }

    public InvalidCmndException(String invalidCmnd, String message) {
        super(message);
        this.invalidCmnd = invalidCmnd;
    }

    public String getInvalidCmnd() {
        return invalidCmnd;
    }

    public void setInvalidCmnd(String invalidCmnd) {
        this.invalidCmnd = invalidCmnd;
    }

}
