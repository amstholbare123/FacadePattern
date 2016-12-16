package butterknife.sample.com.facadepattern;

/**
 * Created by amol on 16/12/16.
 */
public class OrderFacade {
    private String outPutString;
    private Payment pymt = new Payment();
    private Inventory inventry = new Inventory();

    public String placeOrder(String orderId) {
        String step1 = inventry.checkInventory(orderId);
        String step2 = pymt.deductPayment(orderId);
        outPutString="Following steps completed:" + step1
                +" "+ "And" +" "+ step2;
        return outPutString;
    }
}