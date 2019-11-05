/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan59.detectiveconan;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Detective Conon
 */
public class PBO11K10118905Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Detective conan = new Detective();
        conan.setNama("Shinichi Kudo");
        conan.setUmur(17);
        conan.setJenisKelamin("laki - laki");
        conan.tentang();
        conan.role();
        conan.kemampuanKhusus("selalu bisa menyelesaikan masalah yang sulit.\nSetelah menjadi Conan Edogawa dia selalu membantu detective Kogoro Mouri");
        System.out.println("");
        
        Sipil Chara = new Sipil();
        Chara.setNama("Ran Mouri");
        Chara.setUmur(17);
        Chara.setJenisKelamin("perempuan");
        Chara.tentang();
        Chara.role();
        Chara.hobi("Karate");
        System.out.println("");;    
        
        Villain villain = new Villain();
        villain.setNama("Vodka");
        villain.setUmur(30);
        villain.setJenisKelamin("laki - laki");
        villain.tentang();
        villain.role();
        villain.tindakKejahatan("Melakukan Pencurian");
    }
    
}
