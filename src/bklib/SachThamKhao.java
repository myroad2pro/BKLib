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
public class SachThamKhao extends Book{
    private String chuyenNganh;
    private double thue;
    
    // setters
    public void setChuyenNganh(String cn){
        this.chuyenNganh = cn;
    }
    
    public void setThue(double t){
        this.thue = t;
    }
    // getters
    public String getChuyenNganh(){
        return this.chuyenNganh;
    }
    
    public double getThue(){
        return this.thue;
    }
    
    public double getThanhTien(){
        return (this.getDonGia()*this.getSoLuong() + this.getThue());
    }
    // constructors
    public SachThamKhao(){
        super();
        this.setChuyenNganh("");
        this.setThue(0);
    }
    
    public SachThamKhao(String ms, String td, String nxb, double sl, double dg, 
            int ngay, int thang, int nam, String cn, double t){
        super(ms, td, nxb, sl, dg, ngay, thang, nam);
        this.setChuyenNganh(cn);
        this.setThue(t);
    }
    // methods
    public void nhapSachThamKhao(){
        super.nhapSach();
        this.setChuyenNganh(JOptionPane.showInputDialog("Nhap Chuyen Nganh: "));
        this.setThue(Integer.parseInt(JOptionPane.showInputDialog("Nhap Thue: ")));
        this.setThanhTien(this.getThanhTien());
    }
    
    public String hienThiSach(){
        return super.hienThiSach() + "\nChuyen Nganh: " + this.getChuyenNganh() 
                + "\nThue: " + this.getThue() + "\nThanh Tien: " + this.getThanhTien();
    }
}
