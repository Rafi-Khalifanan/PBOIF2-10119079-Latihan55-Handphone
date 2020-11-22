package pboif2.pkg10119079.latihan55.handphone;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Blackberry extends Handphone {
    private String pinBB;
    
    public Blackberry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getPinBB(){
        return pinBB;
    }
    
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}
