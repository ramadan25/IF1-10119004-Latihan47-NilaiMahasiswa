/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan47.nilaimahasiswa;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini menampilkan Nilai Keseluruhan 
 */
public class IF110119004Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilaimahasiswa = new Nilai();
        
        nilaimahasiswa.setNilaiQuiz(75.0);
        nilaimahasiswa.setNilaiUts(45.0);
        nilaimahasiswa.setNilaiUas(34.0);
        
        double quiz = nilaimahasiswa.getNilaiQuiz();
        double uts = nilaimahasiswa.getNilaiUts();
        double uas = nilaimahasiswa.getNilaiUas();
        double nilaiAkhir = nilaimahasiswa.nilaiAkhir(quiz, uts, uas);
        char index = nilaimahasiswa.index(nilaiAkhir);
        String str = String.valueOf(index);
        String keterangan = nilaimahasiswa.keterangan(index);
        
        System.out.println("Quiz\t\t\t = " + quiz);
        System.out.println("UTS\t\t\t = " + uts);
        System.out.println("UAS\t\t\t = " + uas);
        System.out.println();
        System.out.println("Nilai Akhir\t\t = " + nilaiAkhir);
        System.out.println();
        System.out.println("Index\t\t\t = " + index);
        System.out.println("Keterangan\t\t = " + keterangan);
    }
    
}
