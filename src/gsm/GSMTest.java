package gsm;

/**
 *
 * @author mustafa
 */
public class GSMTest {

    public static void main(String[] args) {

        GSM[] arr = new GSM[16];

        GSM phoneApple = new GSM("Iphone", "Apple");
        phoneApple.setOwner("Mustafa");
        phoneApple.setPrice(539.00);
        
        GSM phoneNokia = new GSM("Nokia", "Lumia", 458.99, "Adem");

       
        arr[0] = phoneApple;
        arr[1] = phoneNokia;
        
        for (int i = 0; i < GSM.phoneCount; i++) {
            arr[i].printInfo();
        }
        
        
        
        
        System.out.println(GSM.getN95());
    }
}
