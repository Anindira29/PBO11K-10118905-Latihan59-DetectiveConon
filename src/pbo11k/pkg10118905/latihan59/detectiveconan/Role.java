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
public class Role extends Karakter {
    public void role() {
        System.out.println(getNama() +" adalah rakyat sipil.");
    }
    
    public void tentang() {
        System.out.println(getNama()+" adalah "+getJenisKelamin()+", umur "+getUmur()+" Tahun.");
    }
    
}
