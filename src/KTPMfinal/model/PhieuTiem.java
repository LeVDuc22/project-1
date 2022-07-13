/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPMfinal.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class PhieuTiem implements Serializable{
    private Person person;
    private String idPhieuTiem;
  
    private List<ChiTietPhieuTiem> chiTietPhieuTiems;
    private static int soLanCapNhat= 0;

    public PhieuTiem() {
       this.chiTietPhieuTiems= new ArrayList<>();
    }

    public PhieuTiem(Person person, String idPhieuTiem, List<ChiTietPhieuTiem> chiTietPhieuTiems) {
        this.person = person;
        this.idPhieuTiem = idPhieuTiem;
        this.chiTietPhieuTiems = chiTietPhieuTiems;
    }

    public PhieuTiem(Person person, String idPhieuTiem) {
        this.person = person;
        this.idPhieuTiem = idPhieuTiem;
    }

 

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIdPhieuTiem() {
        return idPhieuTiem;
    }

    public void setIdPhieuTiem(String idPhieuTiem) {
        this.idPhieuTiem = idPhieuTiem;
    }

    public  void setChiTietPhieuTiem(ChiTietPhieuTiem chiTietPhieuTiem) {
        if(chiTietPhieuTiem != null)
        {
            this.chiTietPhieuTiems.add(chiTietPhieuTiem);
            
            soLanCapNhat++;
        }
    }

    public ChiTietPhieuTiem getMotChiTietPhieuTiem(){
        return chiTietPhieuTiems.get(0);
    }

    public List<ChiTietPhieuTiem> getChiTietPhieuTiems() {
        return chiTietPhieuTiems;
    }

//    public  void  setChiTietPhieuTiems( ChiTietPhieuTiem chiTietPhieuTiem) {
//        this.chiTietPhieuTiems.add(chiTietPhieuTiem);
//        this.chiTietPhieuTiems.get(soLanCapNhat).getLoVaccine().setSoLuongConlai(1);
//        soLanCapNhat++;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.person);
        hash = 53 * hash + Objects.hashCode(this.idPhieuTiem);
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
        final PhieuTiem other = (PhieuTiem) obj;
        if (!Objects.equals(this.idPhieuTiem, other.idPhieuTiem)) {
            return false;
        }
        return Objects.equals(this.person, other.person);
    }

 
        
}
