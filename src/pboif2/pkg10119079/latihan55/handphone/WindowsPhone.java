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
public class WindowsPhone extends Handphone {
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore=wpKeyStore;
    }
    
}
