/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPMfinal.model;

import KTPM.controller.InfoFilterImp;
import KTPM.exception.InvalidDobException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class PhieuDangKyTiem implements Serializable{
    private Vaccine vaccie;
    private Person person;
    private Date ngayDkTiem;
    private String maPhieuDkTiem;

    public PhieuDangKyTiem() {
    }

    public PhieuDangKyTiem(Vaccine vaccie, Person person, String ngayDkTiem, String maPhieuDkTiem) throws InvalidDobException {
        this.vaccie = vaccie;
        this.person = person;
        setNgayDkTiem(ngayDkTiem);
        this.maPhieuDkTiem = maPhieuDkTiem;
    }

    
    public Vaccine getVaccie() {
        return vaccie;
    }

    public void setVaccie(Vaccine vaccie) {
        this.vaccie = vaccie;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getNgayDkTiem() {
        return ngayDkTiem;
    }

    public void setNgayDkTiem(String ngayDkTiem) throws InvalidDobException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDobValid(ngayDkTiem)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dobStr);
                this.ngayDkTiem = simpleDateFormat.parse(ngayDkTiem);
            }
        } catch (InvalidDobException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
       
    }

    public String getMaPhieuDkTiem() {
        return maPhieuDkTiem;
    }

    public void setMaPhieuDkTiem(String maPhieuDkTiem) {
        this.maPhieuDkTiem = maPhieuDkTiem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.person);
        hash = 83 * hash + Objects.hashCode(this.maPhieuDkTiem);
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
        final PhieuDangKyTiem other = (PhieuDangKyTiem) obj;
        if (!Objects.equals(this.maPhieuDkTiem, other.maPhieuDkTiem)) {
            return false;
        }
        return Objects.equals(this.person, other.person);
    }

   
   
    
    
}
