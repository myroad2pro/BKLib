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
public class BKLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLySach bookList = new QuanLySach();
        int choice;
        do{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Chuong Trinh Quan Ly Sach\n"
                    + "0. Exit\n"
            + "1. Them Sach Giao Khoa\n" + "2. Them Sach Tham Khao\n" + "3. Them Sach Ngoai Van\n" 
            + "4. Hien Thi Danh Sach Sach Giao Khoa\n" 
            + "5. Hien Thi Danh Sach Sach Tham Khao\n" 
            + "6. Hien Thi Danh Sach Sach Ngoai Van\n"
            + "7. Hien Thi Trung Binh Cong Don Gia Sach Tham Khao\n"
            + "8. Hien Thi Danh Sach Sach Giao Khoa Cua NXB Tuy Chon\n"));
            switch(choice){
                case 0: 
                    break;
                case 1:
                    bookList.nhapSach(0);
                    break;
                case 2:
                    bookList.nhapSach(1);
                    break;
                case 3:
                    bookList.nhapSach(2);
                    break;
                case 4:
                    bookList.listBook(0);
                    break;
                case 5:
                    bookList.listBook(1);
                    break;
                case 6:
                    bookList.listBook(2);
                    break;
                case 7:
                    bookList.donGiaTB(1);
                    break;
                case 8:
                    bookList.listPublisherBooks(0);
                default:
                    JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
            }
        }while(choice != 0);
    }
    
}
