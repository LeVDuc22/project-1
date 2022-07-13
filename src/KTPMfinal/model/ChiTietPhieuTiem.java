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

/**
 *
 * @author Admin
 */
public class ChiTietPhieuTiem implements Serializable{
    private LoVaccine loVaccine;
    private String nhanVienTiem;
    private Date ngayTiem;

    public ChiTietPhieuTiem() {
        
    }

    public ChiTietPhieuTiem(LoVaccine loVaccine, String nhanVienTiem, String ngayTiem) throws InvalidDobException {
        this.loVaccine = loVaccine;
        this.nhanVienTiem = nhanVienTiem;
        setNgayTiem(ngayTiem);
    }

    public LoVaccine getLoVaccine() {
        return loVaccine;
    }

    public void setLoVaccine(LoVaccine loVaccine) {
        this.loVaccine = loVaccine;
    }

    public String getNhanVienTiem() {
        return nhanVienTiem;
    }

    public void setNhanVienTiem(String nhanVienTiem) {
        this.nhanVienTiem = nhanVienTiem;
    }

    public Date getNgayTiem() {
        return ngayTiem;
    }

    public void setNgayTiem(String ngayTiem) throws InvalidDobException{
         var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDobValid(ngayTiem)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dobStr);
                this.ngayTiem = simpleDateFormat.parse(ngayTiem);
            }
        } catch (InvalidDobException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }     
    
}
