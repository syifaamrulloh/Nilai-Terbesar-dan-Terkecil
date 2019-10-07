/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan23.nilai.terbesar.dan.terkecil;

/**
 *
 * @author 
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program Mencari Niai terbesar dan terkecil dari nilai Mahasiswa
 */
import java.util.*;

public class PBO11K10118910Latihan23NilaiTerbesarDanTerkecil {

    /**
     */
    public static Scanner input = new Scanner(System.in);
    public static ArrayList nilai = new ArrayList();
    
    public static void input_nilai(int i, String nama_p) {
        int n, l, h = 0;
        for (int j = 0; j < i; j++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (j + 1) + " = ");
            n = input.nextInt();
            nilai.add(n);
        }
        System.out.println("\n==========Hasil Nilai Mahasiswa ==========");
        for (int k = 0; k < i; k++) {
            System.out.println("Nilai Mahasiwa ke-" + (k + 1) + " " + nilai.get(k));            
        }
        
        for (int j = 0; j < i; j++) {
            if((int)nilai.get(j) > h)
               h = (int)nilai.get(j);
        }
        
        l = (int)nilai.get(0);
        for (int j = 0; j < i; j++) {
            if((int)nilai.get(j) < l)
                l = (int)nilai.get(j);
        }
        System.out.println("\nNilai terbesar adalah : " + h);
        System.out.println("Nilai terkecil adalah : " + l);
        System.out.println("\nNama Petugas : " + nama_p);
        
    }
    
    public static void main(String[] args) {
        int n;
        String namap;
        
        System.out.println("========== Program Nilai Terbesar dan Nilai Terkecil Nilai Mahasiswa ==========");
        System.out.print("Masukan nama Petugas : ");
        namap = input.nextLine();
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        input_nilai(n, namap);
    }
    
}
 