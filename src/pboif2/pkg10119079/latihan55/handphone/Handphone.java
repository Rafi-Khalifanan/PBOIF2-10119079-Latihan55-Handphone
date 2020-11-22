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
public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct(){
        System.out.println("Manufaktur :" + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " +model);
        System.out.println("Harga : " +harga);
    }
}
