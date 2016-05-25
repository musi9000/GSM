package gsm;

/**
 *
 * @author mustafa
 */
public class GSMCallHistoryTest {
    
    public static void main(String[] args) {
        GSM[] arr = new GSM[16];

        GSM phoneApple = new GSM("Iphone", "Apple");
        phoneApple.setOwner("Mustafa");
        phoneApple.setPrice(539.00);
        
        GSM phoneNokia = new GSM("Nokia", "Lumia", 458.99, "Adem");

       
        arr[0] = phoneApple;
        arr[1] = phoneNokia;
        
        arr[0].addCall("12.09.2016", "12:33", 32);
        arr[0].addCall("13.09.2016", "15:22", 12);
        arr[0].addCall("14.09.2016", "12:33", 42);
        
        arr[0].printCallHistory();
        arr[0].calculateCalls(0.37);
    }

}
