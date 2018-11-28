package data.payment;

import data.payment.Payment;

public class Payment_card implements Payment {
    @Override
    public double pay(float sum) {
        double CardFee = 2;
        return (double)sum + CardFee;
    }
}
