/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPM.controller;

import KTPMfinal.model.ChiTietPhieuTiem;
import KTPMfinal.model.LoVaccine;
import KTPMfinal.model.Person;
import KTPMfinal.model.PhieuDangKyTiem;
import KTPMfinal.model.PhieuTiem;
import KTPMfinal.model.Vaccine;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class DataControllerImp implements DataController{

    @Override
    public <T> void writeToFile(List<T> data, String filename) {
        try 
            (FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(data);
        
    }
        catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public <T> List<T> readToFile(String filename) {
       List<T> data= new ArrayList<>();
       File file = new File(filename);
       if(file.length() >0 ){
           try (
                 FileInputStream fis = new FileInputStream(file);
               ObjectInputStream ois = new ObjectInputStream(fis)){
                   data = (List<T>) ois.readObject();
              
           }
            catch (FileNotFoundException ex) {
               ex.printStackTrace();
           }  
          catch (IOException ex) {
               ex.printStackTrace();
           } catch (ClassNotFoundException ex) {
               ex.printStackTrace();
           }   
    }
       return data;
    }

    @Override

    public List<Vaccine> SearchVaccine(List<Vaccine> dataList, String key) {
        List<Vaccine> result = new ArrayList<>();
        var regax= ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regax,Pattern.CASE_INSENSITIVE);
        Matcher matcher1;
//        Matcher matcher2;
//        Matcher matcher3;
        for (Vaccine vaccine : dataList ) {
            matcher1 = pattern.matcher(vaccine.getName());
            if(matcher1.matches()){
                result.add(vaccine);
            }
            
        }
        return result;
        
    }

    @Override
    public List<Vaccine> SearchVaccine(List<Vaccine> dataList, String key, int k) {
        List<Vaccine> result = new ArrayList<>();
        var regax= ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regax,Pattern.CASE_INSENSITIVE);
        Matcher matcher1;;
        for (Vaccine vaccine : dataList ) {
            matcher1 = pattern.matcher(vaccine.getCongdung());
            if(matcher1.matches()){
                result.add(vaccine);
            }           
        }
        return result;
        
    }

    @Override
    public List<Person> SearchPersonByName(List<Person> persons, String key) {
        List<Person> result = new ArrayList<>();
        var regax= ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regax,Pattern.CASE_INSENSITIVE);
        for (Person person : persons) {
            Matcher matcher= pattern.matcher(person.getFullname());
            if(matcher.matches()){
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public List<Person> SearchPersonByCMND(List<Person> persons, String cmnd) {
         List<Person> result = new ArrayList<>();
        var regax= ".*" + cmnd + ".*";
        Pattern pattern = Pattern.compile(regax);
        for (Person person : persons) {
            Matcher matcher= pattern.matcher(person.getCmnd());
            if(matcher.matches()){
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public List<Person> SearchPersonById(List<Person> persons, String id) {
         List<Person> result = new ArrayList<>();
        var regax= ".*" + id + ".*";
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (Person person : persons) {
            Matcher matcher= pattern.matcher(person.getId());
            if(matcher.matches()){
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public List<LoVaccine> SearchLoVacineByIdVaccine(List<LoVaccine> loVaccines, int key) {
        List<LoVaccine> result = new ArrayList<>();

        for (LoVaccine loVaccine : loVaccines) {
            if(loVaccine.getVaccine().getId()== key){
                result.add(loVaccine);
            }
        }
        return result;
    }

    @Override
    public List<LoVaccine> SearchLoVacineById(List<LoVaccine> loVaccines, String key) {
          List<LoVaccine> result = new ArrayList<>();
        var regax= ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regax,Pattern.CASE_INSENSITIVE);
        for (LoVaccine loVaccine : loVaccines) {
            Matcher matcher= pattern.matcher(loVaccine.getIdLo());
            if(matcher.matches()){
                result.add(loVaccine);
            }
        }
        return result;
    }

    @Override
    public List<LoVaccine> SearchLoVacineByDate(List<LoVaccine> loVaccines, long begin, long finish) {
          List<LoVaccine> result = new ArrayList<>();

        for (LoVaccine loVaccine : loVaccines) {
            var time = loVaccine.getNgayNhap().getTime();
            if(time >= begin && time <= finish){
                result.add(loVaccine);
            }
        }
        return result;
    }

    @Override
    public List<PhieuTiem> SearchPhieuTiemByID(List<PhieuTiem> phieuTiems, String Key) {
        List<PhieuTiem> result = new ArrayList<>();
        var regax= ".*" + Key + ".*";
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (PhieuTiem phieuTiem : phieuTiems) {
            Matcher matcher= pattern.matcher(phieuTiem.getIdPhieuTiem());
            if(matcher.matches()){
                result.add(phieuTiem);
            }
        }
        return result;
    }

    @Override
    public List<PhieuTiem> SearchPhieuTiemByName(List<PhieuTiem> phieuTiems, String name) {
         List<PhieuTiem> result = new ArrayList<>();
        var regax= ".*" + name + ".*";
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (PhieuTiem phieuTiem : phieuTiems) {
            Matcher matcher= pattern.matcher(phieuTiem.getPerson().getFullname());
            if(matcher.matches()){
                result.add(phieuTiem);
            }
        }
        return result;
    }

    @Override
    public List<PhieuTiem> SearchPhieuTiemByNameVaccine(List<PhieuTiem> phieuTiems, String nameVC) {
         List<PhieuTiem> result = new ArrayList<>();
        var regax= ".*" + nameVC + ".*";
       
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (PhieuTiem phieuTiem : phieuTiems) {
             ChiTietPhieuTiem chiTietPhieuTiem = phieuTiem.getMotChiTietPhieuTiem();
            Matcher matcher= pattern.matcher(chiTietPhieuTiem.getLoVaccine().getVaccine().getName());
            if(matcher.matches()){
                result.add(phieuTiem);
            }
        }
        return result;
    }

    @Override
    public List<PhieuDangKyTiem> SearchPhieuDkTiemById(List<PhieuDangKyTiem> phieuDangKyTiems, String id) {
         List<PhieuDangKyTiem> result = new ArrayList<>();
        var regax= ".*" + id + ".*";
       
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (PhieuDangKyTiem phieuDangKyTiem : phieuDangKyTiems) {
            Matcher matcher= pattern.matcher(phieuDangKyTiem.getMaPhieuDkTiem());
            if(matcher.matches()){
                result.add(phieuDangKyTiem);
            }
        }
        return result;
    }

    @Override
    public List<PhieuDangKyTiem> SearchPhieuDkTiemByName(List<PhieuDangKyTiem> phieuDangKyTiems, String name) {
         List<PhieuDangKyTiem> result = new ArrayList<>();
        var regax= ".*" + name + ".*";
       
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (PhieuDangKyTiem phieuDangKyTiem : phieuDangKyTiems) {
            Matcher matcher= pattern.matcher(phieuDangKyTiem.getPerson().getFullname());
            if(matcher.matches()){
                result.add(phieuDangKyTiem);
            }
        }
        return result;
    }

    @Override
    public List<PhieuDangKyTiem> SearchPhieuDkTiemByNameVC(List<PhieuDangKyTiem> phieuDangKyTiems, String nameVC) {
         List<PhieuDangKyTiem> result = new ArrayList<>();
        var regax= ".*" + nameVC + ".*";
       
        Pattern pattern = Pattern.compile(regax, Pattern.CASE_INSENSITIVE);
        for (PhieuDangKyTiem phieuDangKyTiem : phieuDangKyTiems) {
            Matcher matcher= pattern.matcher(phieuDangKyTiem.getVaccie().getName());
            if(matcher.matches()){
                result.add(phieuDangKyTiem);
            }
        }
        return result;
    }

    @Override
    public List<PhieuDangKyTiem> SearchPhieuDkTiemByDate(List<PhieuDangKyTiem> phieuDangKyTiems, long key) {
         List<PhieuDangKyTiem> result = new ArrayList<>();
         for (PhieuDangKyTiem phieuDangKyTiem : phieuDangKyTiems) {
            var time = phieuDangKyTiem.getNgayDkTiem().getTime();
            if(time == key){
                result.add(phieuDangKyTiem);
            }
        }
         return  result;
    }

    @Override
    public List<Vaccine> SearchVaccineByDTSD(List<Vaccine> dataList, String key) {
         List<Vaccine> result = new ArrayList<>();
        var regax= ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regax,Pattern.CASE_INSENSITIVE);
        Matcher matcher1;
//        Matcher matcher2;
//        Matcher matcher3;
        for (Vaccine vaccine : dataList ) {
            matcher1 = pattern.matcher(vaccine.getNgaynhap());
            if(matcher1.matches()){
                result.add(vaccine);
            }
            
        }
        return result;
    }

   
    
}
