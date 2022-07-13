/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPMfinal.model;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Account {
   private String Id;
   private String passString;
   public Account(){
   }

    public Account(String Id, String passString) {
        this.Id = Id;
        this.passString = passString;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPassString() {
        return passString;
    }

    public void setPassString(String passString) {
        this.passString = passString;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.Id);
        hash = 29 * hash + Objects.hashCode(this.passString);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return Objects.equals(this.passString, other.passString);
    }
   
        
}
