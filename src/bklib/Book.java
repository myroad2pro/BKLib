/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bklib;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class Book {
    protected String maSach, tieuDe, nhaXB;
    protected LocalDate ngayNhap;
    protected double soLuong, donGia, thanhTien;
    // setters
    protected void setMaSach(String ms){
        this.maSach = ms;
    }
    
    protected void setTieuDe(String td){
        this.tieuDe = td;
    }
    
    protected void setNhaXB(String nxb){
        this.nhaXB = nxb;
    }
    
    protected void setSoLuong(double sl){
        this.soLuong = sl;
    }
    
    protected void setDonGia(double dg){
        this.donGia = dg;
    }
    
    protected void setThanhTien(double tt){
        
    }
    
    protected void setNgayNhap(int ngay, int thang, int nam){
        this.ngayNhap = LocalDate.of(nam, thang, ngay);
    }
    //getters
    protected String getMaSach(){
        return this.maSach;
    }
    
    protected String getTieuDe(){
        return this.tieuDe;
    }
    
    protected String getNhaXB(){
        return this.nhaXB;
    }
    
    protected double getDonGia(){
        return this.donGia;
    }
    
    protected double getSoLuong(){
        return this.soLuong;
    }
    
    protected double getThanhTien(){
        return this.thanhTien;
    }
    
    protected LocalDate getNgayNhap(){
        return this.ngayNhap;
    }
    //constructors
    protected Book(){
        this.setMaSach("");
        this.setTieuDe("");
        this.setNhaXB("");
        this.setSoLuong(0);
        this.setDonGia(0);
        this.setThanhTien(0);
        this.setNgayNhap(1, 1, 1);
    }
    
    protected Book(String ms, String td, String nxb, double sl, double dg, 
            int ngay, int thang, int nam){
        this.setMaSach(ms);
        this.setTieuDe(td);
        this.setNhaXB(nxb);
        this.setSoLuong(sl);
        this.setDonGia(dg);
        this.setThanhTien(0);
        this.setNgayNhap(ngay, thang, nam);
    }
    // methods
    protected void nhapSach(){
        this.setMaSach(JOptionPane.showInputDialog("Nhap ma sach: "));
        this.setTieuDe(JOptionPane.showInputDialog("Nhap tieu de: "));
        this.setNhaXB(JOptionPane.showInputDialog("Nhap nha xuat ban: "));
        this.setSoLuong(Double.parseDouble(JOptionPane.showInputDialog("Nhap so luong: ")));
        this.setDonGia(Double.parseDouble(JOptionPane.showInputDialog("Nhap don gia: ")));
        int ngay = Integer.parseInt(JOptionPane.showInputDialog("Ngay nhap: "));
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Thang nhap: "));
        int nam = Integer.parseInt(JOptionPane.showInputDialog("Nam nhap: "));
        this.setNgayNhap(ngay, thang, nam);
    }
    
    protected String hienThiSach(){
        return "Ma Sach: " + this.getMaSach() + "\nTieu De: " + this.getTieuDe()
                + "\nNha XB: " + this.getNhaXB() + "\nDon Gia: " + this.getDonGia()
                + "\nSo Luong: " + this.getSoLuong() + "\nNgay Nhap: " + this.getNgayNhap().toString();
    }
}
