/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan55.handphone;

/**
 *
 * @author        
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 101180878
 * Deskripsi Tugas : Handphone
 */
public class BlackBerry extends Handphone{
    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
