/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];
        
        man[0] = new Manager();
        man[0].setNama("Bagus Alamsyah");
        man[0].setNip("178923");
        man[0].setGolongan("1");
        man[0].setTunjangan(5500000);
        man[0].setBagian("Administrasi");
        
        man[1] = new Manager();
        man[1].setNama("Indah Damayanti");
        man[1].setNip("198723");
        man[1].setGolongan("2");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        staff1[0] = new Staff();
        staff1[0].setNama("Muhammad Alif");
        staff1[0].setNip("197234");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(15000);
        
        staff1[1] = new Staff();
        staff1[1].setNama("Budi Andi");
        staff1[1].setNip("1436756");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(65000);
        man[0].setStaff(staff1);
        
        staff2[0] = new Staff();
        staff2[0].setNama("Putra Adi");
        staff2[0].setNip("1873452");
        staff2[0].setGolongan("2");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(65000);
        
        staff2[1] = new Staff();
        staff2[1].setNama("Prima Ari");
        staff2[1].setNip("18734342");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
        
        staff2[2] = new Staff();
        staff2[2].setNama("Indah Sintya");
        staff2[2].setNip("18735472");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        man[1].setStaff(staff2);
        
        man[0].cetakInfo();
        man[1].cetakInfo();
        
    }
}
