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
public class SachNgoaiVan extends Book{
    private String ngonNgu;
    
    // setters
    public void setNgonNgu(String nn){
        this.ngonNgu = nn;
    }
    //getters
    public String getNgonNgu(){
        return this.ngonNgu;
    }
    
    @Override
    public double getThanhTien(){
        return this.getDonGia() * this.getSoLuong() * 1.2;
    }
    //constructors
    public SachNgoaiVan(){
        super();
        setNgonNgu("");
    }
    
    public SachNgoaiVan(String ms, String td, String nxb, double sl, double dg, 
            int ngay, int thang, int nam, String nn){
        super(ms, td, nxb, sl, dg, ngay, thang, nam);
        this.setNgonNgu(nn);
    }
    //methods
    public void nhapSachNgoaiVan(){
        super.nhapSach();
        this.setNgonNgu(JOptionPane.showInputDialog("Nhap Ngon Ngu: "));
        this.setThanhTien(this.getThanhTien());
    }
    
    public String hienThiSach(){
        return super.hienThiSach() + "\nNgon Ngu: " + this.getNgonNgu() 
                + "\nThanh Tien: " + this.getThanhTien();
    }
}
