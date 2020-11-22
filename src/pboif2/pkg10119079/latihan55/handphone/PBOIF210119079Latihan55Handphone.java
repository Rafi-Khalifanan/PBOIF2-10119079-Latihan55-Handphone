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
public class PBOIF210119079Latihan55Handphone {
    public static void main(String[] args) {
                Android android = new Android("Samsung","Android","Grand",3000000);
        
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore() + "\n");
        
        Blackberry blackberry = new Blackberry("BlackB","RIM","Curve",2000000);
        
        
        blackberry.setPinBB("BHS249");
        blackberry.displayProduct();
        System.out.println("PIN : " + blackberry.getPinBB() + "\n");
        
        WindowsPhone windowsphone = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        
        windowsphone.setWpKeyStore("UUUQIJWORJ");
        windowsphone.displayProduct();
        System.out.println("Wp Key Store : " + windowsphone.getWpKeyStore());
    }
    
}

