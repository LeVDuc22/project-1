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
public class LoVaccine implements Serializable{
    private Vaccine vaccine;
    private String idLo;
    private Date ngayNhap;
    private Date nsxDate;
    private Date hsdDate;
    private int Soluong;
    private int soLuongConLai;
    public LoVaccine() {
        this.vaccine= null;
       
    }

    public LoVaccine(Vaccine vaccine, String idLo, String ngayNhap, String nsxDate, String hsdDate, int Soluong ,int soLuongConLai) throws InvalidDobException {
        this();
        this.vaccine = vaccine;
        this.idLo = idLo;
        setNgayNhap(ngayNhap);
        setNsxDate(nsxDate);
        setHsdDate(hsdDate);
        this.Soluong = Soluong;
        this.soLuongConLai = soLuongConLai;
    }
    
    public LoVaccine(Vaccine vaccine, String idLo, String ngayNhap, String nsxDate, String hsdDate, int Soluong) throws InvalidDobException {
        this();
        this.vaccine = vaccine;
        this.idLo = idLo;
        setNgayNhap(ngayNhap);
        setNsxDate(nsxDate);
        setHsdDate(hsdDate);
        this.Soluong = Soluong;
        this.soLuongConLai= Soluong;
    }

    public LoVaccine(Vaccine vaccine, String idLo, Date ngayNhap, Date nsxDate, Date hsdDate, int Soluong) {
        this.vaccine = vaccine;
        this.idLo = idLo;
        this.ngayNhap = ngayNhap;
        this.nsxDate = nsxDate;
        this.hsdDate = hsdDate;
        this.Soluong = Soluong;
    }

    public int getSoLuongConLai() {
        return soLuongConLai;
    }

    public void setSoLuongConLai(int soLuongConLai) {
        this.soLuongConLai = soLuongConLai;
    }

        
  
    public void setNewPhieuTiem(){
        this.soLuongConLai--;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getIdLo() {
        return idLo;
    }

    public void setIdLo(String idLo) {
        this.idLo = idLo;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap)  throws InvalidDobException{
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDobValid(ngayNhap)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dobStr);
                this.ngayNhap = simpleDateFormat.parse(ngayNhap);
            }
        } catch (InvalidDobException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public Date getNsxDate() {
        return nsxDate;
    }

    public void setNsxDate(String nsx) throws InvalidDobException{
      var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDobValid(nsx)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dobStr);
                this.nsxDate = simpleDateFormat.parse(nsx);
            }
        } catch (InvalidDobException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public Date getHsdDate() {
        return hsdDate;
    }

    public void setHsdDate(String hsd)  throws InvalidDobException{
       var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDobValid(hsd)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dobStr);
                this.hsdDate = simpleDateFormat.parse(hsd);
            }
        } catch (InvalidDobException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.idLo);
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
        final LoVaccine other = (LoVaccine) obj;
        return Objects.equals(this.idLo, other.idLo);
    }

    

   
    
}
