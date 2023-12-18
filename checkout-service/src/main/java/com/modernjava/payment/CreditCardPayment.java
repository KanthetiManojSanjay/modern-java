package com.modernjava.payment;

import com.modernjava.domain.Card;
import com.modernjava.domain.PaymentResponse;

/**
 * @author kansanja on 18/12/23.
 */
public final class CreditCardPayment extends PaymentGateway {
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire credit card payment for the amount of " + amount);
        return PaymentResponse.SUCCESS;
    }
}
