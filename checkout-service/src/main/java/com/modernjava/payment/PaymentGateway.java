package com.modernjava.payment;

import com.modernjava.domain.Card;
import com.modernjava.domain.PaymentResponse;

/**
 * @author kansanja on 18/12/23.
 */
public sealed abstract class PaymentGateway permits DebitCardPayment, CreditCardPayment, RewardsCardPayment {
    public abstract PaymentResponse makePayment(Card card, double amount);
}
