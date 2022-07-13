/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KTPM.controller;

import KTPM.exception.InvalidCmndException;
import KTPM.exception.InvalidDobException;
import KTPM.exception.InvalidNameException;
import KTPM.exception.InvalidPersonIdException;
import KTPM.exception.InvalidSdtException;
import KTPMfinal.model.LoVaccine;
import KTPMfinal.model.PhieuDangKyTiem;
import KTPMfinal.model.PhieuTiem;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class InfoFilterImp implements InfoFilter{

    @Override
    public boolean isIdValid(String id) throws InvalidPersonIdException {
        var regex="^[a-z]{2}\\d{4}$";
        Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(id);
        if(matcher.matches()){
            return true;
        }
        else{
            var msg="Mã hồ sơ không hợp lê: "+ id;
            throw new InvalidPersonIdException(id,msg);
        }
    }

    @Override
    public boolean isNameValid(String name) throws InvalidNameException {
         var regex="^(\\w+.*[^0-9].*)$";
        Pattern pattern= Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(name);
        if(matcher.matches()){
            return true;
        }
        else{
            var msg="Họ và tên không hợp lê: "+ name;
            throw new InvalidNameException(name,msg);
        }
    }

    @Override
    public boolean isCmndValid(String cmnd) throws InvalidCmndException {
         var regex="^[0-9]{9,13}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(cmnd);
        if(matcher.matches()){
            return true;
        }
        else{
            var msg="Số CMND/CCCD không hợp lê: "+ cmnd;
            throw new InvalidCmndException(cmnd,msg);
        }
    }

    @Override
    public boolean isDobValid(String dob) throws InvalidDobException {
         var regex="^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(dob);
        if(matcher.matches()){
            return true;
        }
        else{
            var msg="ngày sinh không hợp lê: " + dob;
            throw new InvalidDobException(dob,msg);
        }
    }

    @Override
    public boolean isSdtValid(String Sdt) throws InvalidSdtException {
          var regex="^(03|04|07|09)\\d{8}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(Sdt);
        if(matcher.matches()){
            return true;
        }
        else{
            var msg="Số điện thoại không hợp lê: "+ Sdt;
            throw new InvalidSdtException(Sdt,msg);
        }
    }

    @Override
    public boolean isRecordExit(List<LoVaccine> loVaccines, LoVaccine lovc) {
        return loVaccines.contains(lovc);
    }

    @Override
    public boolean isKiemTraPhieuTiem(List<PhieuTiem> phieuTiems, PhieuTiem phieuTiem) {
        return phieuTiems.contains(phieuTiem);
    }

    @Override
    public boolean isKiemTraPhieuDkTiem(List<PhieuDangKyTiem> phieuDangKyTiems, PhieuDangKyTiem phieuDangKyTiem) {
        return phieuDangKyTiems.contains(phieuDangKyTiem);
    }
    
}
