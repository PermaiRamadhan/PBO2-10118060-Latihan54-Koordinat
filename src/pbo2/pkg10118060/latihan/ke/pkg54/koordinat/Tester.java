/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg54.koordinat;

/**
 *
 * @author 
 * NAMA     : Permai Ramadhan
 * KELAS    : IF-2
 * NIM      : 10118060
 * Deskripsi Program : Membuat program berbasis objek untuk mendapatkan
 * informasi warna koordinat beserta koordinatnya
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "
                + warnaKoordinat.getX() + ", y : " + warnaKoordinat.getY());
    }
    
}
