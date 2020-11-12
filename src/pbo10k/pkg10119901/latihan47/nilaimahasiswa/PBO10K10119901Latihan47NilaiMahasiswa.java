/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan Nilai Mahasiswa
 *
 */
public class PBO10K10119901Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai n = new Nilai();
        
        float nilaiAkhir;
        String index, keterangan;
        
        n.setNilaiQuiz(75);
        n.setNilaiUTS(45);
        n.setNilaiUAS(34);
        
        System.out.println("QUIZ \t\t = " + n.getNilaiQuiz());
        System.out.println("UTS \t\t = " + n.getNilaiUTS());
        System.out.println("UAS \t\t = " + n.getNilaiUAS());
        
        nilaiAkhir  = n.hitungNilaiAkhir();
        index       = n.getIndex(nilaiAkhir);
        keterangan  = n.getKeterangan(index);
        
        System.out.println("\nNilai Akhir \t = " + nilaiAkhir);
        System.out.println("\nIndex \t\t = " + index);
        System.out.println("Keterangan \t = " + keterangan);
    }
    
}
