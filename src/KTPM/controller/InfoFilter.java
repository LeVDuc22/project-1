/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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

/**
 *
 * @author Admin
 */
public interface InfoFilter {

    boolean isIdValid(String id) throws InvalidPersonIdException;

    boolean isNameValid(String name) throws InvalidNameException;

    boolean isCmndValid(String cmnd) throws InvalidCmndException;

    boolean isDobValid(String dob) throws InvalidDobException;

    boolean isSdtValid(String Sdt) throws InvalidSdtException;
    boolean isRecordExit(List<LoVaccine> loVaccines, LoVaccine lovc);
    boolean isKiemTraPhieuTiem(List<PhieuTiem> phieuTiems, PhieuTiem phieuTiem);
    boolean isKiemTraPhieuDkTiem(List<PhieuDangKyTiem> phieuDangKyTiems, PhieuDangKyTiem phieuDangKyTiem);
}
