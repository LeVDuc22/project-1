/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPM.exception;

/**
 *
 * @author Admin
 */
public class InvalidSdtException extends Exception{
    private String invalidSdt;

    public InvalidSdtException() {
    }

    public InvalidSdtException(String invalidSdt) {
        this.invalidSdt = invalidSdt;
    }

    public InvalidSdtException(String invalidSdt, String message) {
        super(message);
        this.invalidSdt = invalidSdt;
    }

    public String getInvalidSdt() {
        return invalidSdt;
    }

    public void setInvalidSdt(String invalidSdt) {
        this.invalidSdt = invalidSdt;
    }
    
}
