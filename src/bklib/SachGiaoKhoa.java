/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bklib;

import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class SachGiaoKhoa extends Book{
    private int tinhTrang;   // 0: moi, 1: cu
    //setters
    public void setTinhTrang(int tt){
        this.tinhTrang = tt;
    }
    //getters
    public int getTinhTrang(){
        return this.tinhTrang;
    }
    
    @Override
    public double getThanhTien(){
        if(this.getTinhTrang() == 0){
            return (this.getDonGia() * this.getSoLuong());
        }else{
            return (this.getDonGia() * this.getSoLuong() * 0.5);
        }
    }
    //constructors
    public SachGiaoKhoa(){
        super();
        setTinhTrang(0);
    }
    
    public SachGiaoKhoa(String ms, String td, String nxb, double sl, double dg, 
            int ngay, int thang, int nam, int tt){
        super(ms, td, nxb, sl, dg, ngay, thang, nam);
        this.setTinhTrang(tt);
    }
    
    // methods
    public void nhapSachGiaoKhoa(){
        super.nhapSach();
        this.setThanhTien(this.getThanhTien());
        this.setTinhTrang(JOptionPane.showConfirmDialog(null, "Sach moi?", "Tinh Trang Sach", JOptionPane.YES_NO_OPTION));
    }
    
    public String hienThiSach(){
        return super.hienThiSach() + "\nTinh Trang Sach: " + ((this.getTinhTrang() == 0)?"moi":"cu") 
                + "\nThanh Tien: " + this.getThanhTien();
    }
}
