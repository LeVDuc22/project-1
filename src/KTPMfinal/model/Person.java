/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPMfinal.model;

import KTPM.controller.InfoFilter;
import KTPM.controller.InfoFilterImp;
import KTPM.exception.InvalidCmndException;
import KTPM.exception.InvalidDobException;
import KTPM.exception.InvalidNameException;
import KTPM.exception.InvalidPersonIdException;
import KTPM.exception.InvalidSdtException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Person implements Serializable {

    private String Id;
    private Fullname fullname;
    private String Address;
    private String Cmnd;
    private String SDT;
    private Date dob;

    public Person() {
        fullname = new Fullname();
    }

    public Person(String Id) throws InvalidPersonIdException {
        setId(Id);
    }

    public Person(String Id, String fullname, String Address, String Cmmd, String SDT, String dob)
            throws InvalidPersonIdException, InvalidCmndException, InvalidDobException, InvalidSdtException, InvalidNameException {
        this();
        setId(Id);
        setFullname(fullname);
        this.Address = Address;
        setCmnd(Cmmd);
        setSDT(SDT);
        setDob(dob);
    }

//    public Person(String Id, String fullname, String Address, String SDT, String dob)
//            throws InvalidCmndException, InvalidPersonIdException, InvalidSdtException, InvalidDobException, InvalidNameException {
//        this();
//        setId(Id);
//        setCmnd(Cmnd);
//        setFullname(fullname);
//        this.Address = Address;
//        setSDT(SDT);
//        setDob(dob);
//    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) throws InvalidPersonIdException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isIdValid(Id)) {
                this.Id = Id;
            }
        } catch (InvalidPersonIdException ex) {
            throw ex;
        }

    }

    public String getFullname() {
        return this.fullname.lastString + " " + this.fullname.midString + this.fullname.firstString;
    }

    public void setFullname(String fullname) throws InvalidNameException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isNameValid(fullname)) {
                var words = fullname.split("\\s+");
                this.fullname.firstString = words[words.length - 1];
                this.fullname.lastString = words[0];
                for (int i = 1; i < words.length -1 ; i++) {
                    this.fullname.midString += words[i] + " ";
                }
            }
        } catch (InvalidNameException ex) {
            throw ex;
        }

    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCmnd() {
        return Cmnd;
    }

    public void setCmnd(String Cmmd) throws InvalidCmndException {
        var infoFiliter = new InfoFilterImp();
        try {
            if (infoFiliter.isCmndValid(Cmmd)) {
                this.Cmnd = Cmmd;
            }
        } catch (InvalidCmndException ex) {
            throw ex;
        }
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) throws InvalidSdtException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isSdtValid(SDT)) {
                this.SDT = SDT;
            }
        } catch (InvalidSdtException ex) {
            throw ex;
        }
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String dob) throws InvalidDobException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDobValid(dob)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dobStr);
                this.dob = simpleDateFormat.parse(dob);
            }
        } catch (InvalidDobException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    class Fullname implements Serializable {

        private String firstString;
        private String midString;
        private String lastString;

        public Fullname() {
            firstString = "";
            midString = "";
            lastString = "";
        }

        public Fullname(String firstString, String midString, String lastString) {
            this.firstString = firstString;
            this.midString = midString;
            this.lastString = lastString;
        }

        public String getFirstString() {
            return firstString;
        }

        public void setFirstString(String firstString) {
            this.firstString = firstString;
        }

        public String getMidString() {
            return midString;
        }

        public void setMidString(String midString) {
            this.midString = midString;
        }

        public String getLastString() {
            return lastString;
        }

        public void setLastString(String lastString) {
            this.lastString = lastString;
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.Id);
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
        final Person other = (Person) obj;
        return Objects.equals(this.Id, other.Id);
    }

}
