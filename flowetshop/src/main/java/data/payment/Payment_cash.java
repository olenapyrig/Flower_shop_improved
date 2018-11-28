package data.payment;
import data.payment.Payment;
public class Payment_cash implements Payment {
    @Override
    public double pay(float sum) {
        return (double)sum;
    }
}
