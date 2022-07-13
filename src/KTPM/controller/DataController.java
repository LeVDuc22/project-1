/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package KTPM.controller;

import KTPMfinal.model.LoVaccine;
import KTPMfinal.model.Person;
import KTPMfinal.model.PhieuDangKyTiem;
import KTPMfinal.model.PhieuTiem;
import KTPMfinal.model.Vaccine;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface DataController {
    int VACCINE=1;
    int HOSO=2;
    int PHIEUTIEM=3;
    int PHIEUDK=4;
    int TIMKIEMTHEOCONGDUNG=5;
    int LOVACCINE =6;
    String Vaccine_File="VACCINE.Dat";
    String HoSo_File="HOSO.Dat";
    String PhieuTiem_File="PHIEUTIEM.Dat";
    String PhieuDKtiem_File="PHIEUDANGKYTIEM.Dat";
    String LoVaccine_File="LOVACCINE.Dat";
    <T> void writeToFile(List<T> data, String filename);
    <T> List<T> readToFile(String filename);
    List<Vaccine> SearchVaccine(List<Vaccine> dataList, String key);    
    List<Vaccine> SearchVaccine(List<Vaccine> dataList, String key, int k); 
     List<Vaccine> SearchVaccineByDTSD(List<Vaccine> dataList, String key); 
    List<Person> SearchPersonByName(List<Person> persons, String key);
    List<Person> SearchPersonByCMND(List<Person> persons, String cmnd);
    List<Person> SearchPersonById(List<Person> persons, String id);
    List<LoVaccine> SearchLoVacineByIdVaccine(List<LoVaccine> loVaccines , int key);
    List<LoVaccine> SearchLoVacineById(List<LoVaccine> loVaccines , String key);
    List<LoVaccine> SearchLoVacineByDate(List<LoVaccine> loVaccines, long n, long m );
    List<PhieuTiem> SearchPhieuTiemByID(List<PhieuTiem> phieuTiems, String Key);
    List<PhieuTiem> SearchPhieuTiemByName(List<PhieuTiem> phieuTiems, String name);
    List<PhieuTiem> SearchPhieuTiemByNameVaccine(List<PhieuTiem> phieuTiems, String nameVC );
    List<PhieuDangKyTiem> SearchPhieuDkTiemById(List<PhieuDangKyTiem> phieuDangKyTiems, String id);
    List<PhieuDangKyTiem> SearchPhieuDkTiemByName(List<PhieuDangKyTiem> phieuDangKyTiems, String name);
    List<PhieuDangKyTiem> SearchPhieuDkTiemByNameVC(List<PhieuDangKyTiem> phieuDangKyTiems, String nameVC);
    List<PhieuDangKyTiem> SearchPhieuDkTiemByDate(List<PhieuDangKyTiem> phieuDangKyTiems, long key);
}
