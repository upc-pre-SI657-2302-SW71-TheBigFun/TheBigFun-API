package com.crackelets.bigfun.platform.payment.service;

import com.crackelets.bigfun.platform.payment.api.internal.PaymentContextFacade;
import com.crackelets.bigfun.platform.payment.domain.model.Payment;
import com.crackelets.bigfun.platform.payment.domain.service.PaymentService;

import java.util.List;

public class PaymentContextFacadeImpl implements PaymentContextFacade {

    private final PaymentService paymentService;

    public PaymentContextFacadeImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentService.getAll();
    }
}
