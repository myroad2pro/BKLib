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
public class QuanLySach {
    private Book[] bookList = new Book[100];
    private int[] bookType = new int[100];
    private int countBook = 0;
    private double tongThanhTienSGK, tongThanhTienSTK, tongThanhTienSNV; 
    // getters
    public int getCountBook(){
        return this.countBook;
    }
    
    public double getTongThanhTienSGK(){
        return this.tongThanhTienSGK;
    }
    
    public double getTongThanhTienSTK(){
        return this.tongThanhTienSTK;
    }
    
    public double getTongThanhTienSNV(){
        return this.tongThanhTienSNV;
    }
    // methods
    public void nhapSach(int mode){// 0: SGK, 1: STK, 2: SNV
        switch(mode){
            case 0:
                bookList[countBook] = new SachGiaoKhoa();
                bookType[countBook] = 0;
                SachGiaoKhoa sgk = new SachGiaoKhoa();
                sgk.nhapSachGiaoKhoa();
                bookList[countBook++] = sgk;
                tongThanhTienSGK += sgk.getThanhTien();
                break;
            case 1:
                bookList[countBook] = new SachThamKhao();
                bookType[countBook] = 1;
                SachThamKhao stk = new SachThamKhao();
                stk.nhapSachThamKhao();
                bookList[countBook++] = stk;
                tongThanhTienSTK += stk.getThanhTien();
                break;
            case 2:
                bookList[countBook] = new SachNgoaiVan();
                bookType[countBook] = 2;
                SachNgoaiVan snv = new SachNgoaiVan();
                snv.nhapSachNgoaiVan();
                bookList[countBook++] = snv;
                tongThanhTienSNV += snv.getThanhTien();
                break;
            default:
        }
    }
    
    public void listBook(int mode){
        for(int i = 0; i < countBook; i++){
            if(bookType[i] == mode){
                System.out.println("--------------------/------/-----------------------");
                System.out.println(bookList[i].hienThiSach());
            }
        }
        switch(mode){
            case 0:
                System.out.println("\nTong Thanh Tien SGK: " + this.getTongThanhTienSGK());
                break;
            case 1:
                System.out.println("\nTong Thanh Tien STK: " + this.getTongThanhTienSTK());
                break;
            case 2:
                System.out.println("\nTong Thanh Tien SNV: " + this.getTongThanhTienSNV());
                break;
            default:
        }
    }
    
    public void donGiaTB(int mode){
        double sum = 0, dgtb = 0;
        int count = 0;
        for(int i = 0; i < countBook; i++){
            if(bookType[i] == mode){
                sum += bookList[i].getThanhTien();
                count++;
            }
        }
        dgtb = sum / count;
        switch(mode){
            case 0:        
                JOptionPane.showMessageDialog(null, "Don Gia Trung Binh Sach Giao Khoa" + dgtb);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Don Gia Trung Binh Sach Tham Khao" + dgtb);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Don Gia Trung Binh Sach Tham Khao" + dgtb);
                break;
            default:
        }
    }
    
    public void listPublisherBooks(int mode){
        String nxb = JOptionPane.showInputDialog("Nhap Nha XB: ");
        for(int i = 0; i < this.getCountBook(); i++){
            if(bookType[i] ==  mode && bookList[i].getNhaXB().equals(nxb)){
                System.out.println(bookList[i].hienThiSach());
            }
        }
    }
}
