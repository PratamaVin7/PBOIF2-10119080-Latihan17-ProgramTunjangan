/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan17.programtunjangan;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Program Tunjangan
 */
public class PBOIF210119080Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char menikah;
        double gajipokok,tunjangan,totalgaji;
        
        menikah='Y';
        gajipokok=6000000;
        tunjangan=(menikah=='Y')?0.35*gajipokok:0;
        totalgaji=gajipokok + tunjangan;
        
        System.out.println("===========Program Tunjangan===========");
        System.out.println("Berapa gaji pokok anda perbulan?:Rp. 6000000");
        System.out.println("Status Anda? (Menikah/Belum)    : Menikah");
        System.out.println();
        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok              : Rp "+gajipokok);
        System.out.println("Tunjangan               : Rp "+tunjangan);
        System.out.println("Total Gaji              : Rp "+totalgaji);
        System.out.println("(Developed by : Kevin Pratama Sinaga)");
    }
    
}