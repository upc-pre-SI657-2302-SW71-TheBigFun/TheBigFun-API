package com.crackelets.bigfun.platform.payment.api.internal;

import com.crackelets.bigfun.platform.payment.domain.model.Payment;

import java.util.List;

public interface PaymentContextFacade {
    List<Payment> getAllPayments();
    
}
