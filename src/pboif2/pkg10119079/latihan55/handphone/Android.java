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
public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man, String os,String model, int harga){
        super(man, os ,model, harga);
    }
    
    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
}
