package com.modernjava.payment;

import com.modernjava.domain.Card;
import com.modernjava.domain.PaymentResponse;

/**
 * @author kansanja on 18/12/23.
 */
public final class RewardsCardPayment extends PaymentGateway {
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire Rewards card payment for the amount of " + amount);
        return PaymentResponse.SUCCESS;
    }
}
