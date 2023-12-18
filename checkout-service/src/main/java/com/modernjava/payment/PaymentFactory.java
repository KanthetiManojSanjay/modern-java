package com.modernjava.payment;

import com.modernjava.domain.CardType;

/**
 * @author kansanja on 18/12/23.
 */
public class PaymentFactory {
    public static PaymentGateway paymentGateway(CardType cardType) {
        return switch (cardType) {
            case CREDIT -> new CreditCardPayment();
            case DEBIT -> new DebitCardPayment();
            case REWARDS -> new RewardsCardPayment();
            case null -> throw new IllegalArgumentException("CardType null not supported");
        };

    }
}
