    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPMfinal.model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Vaccine implements Serializable{
    private int id;
    private static int sId=100000;
    private String name;
    private String nhaSanXuat;
    private String congdung;
    private String doiTuongSuDung;
    private int Soluong;

    public Vaccine() {
        id=sId++;
    }

    public Vaccine(int id) {
        this.id = id;
    }


    public Vaccine(int id, String name, String maLo, String congdung, String Ngaynhap, int Soluong) {
        this.id = id;
        this.name = name;
        this.nhaSanXuat = maLo;
        this.congdung = congdung;
        this.doiTuongSuDung = Ngaynhap;
        this.Soluong = Soluong;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        Vaccine.sId = sId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaLo() {
        return nhaSanXuat;
    }

    public void setMaLo(String maLo) {
        this.nhaSanXuat = maLo;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public String getNgaynhap() {
        return doiTuongSuDung;
    }

    public void setNgaynhap(String Ngaynhap) {
        this.doiTuongSuDung = Ngaynhap;
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
        hash = 59 * hash + this.id;
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
        final Vaccine other = (Vaccine) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "id=" + id + ", name=" + name + ", maLo=" + nhaSanXuat + ", "
                + "congdung=" + congdung + ", Ngaynhap=" + doiTuongSuDung + ", Soluong=" + Soluong + '}';
    }
    
}
