package com.crackelets.bigfun.platform.payment.api.rest;

import com.crackelets.bigfun.platform.payment.domain.service.PaymentService;
import com.crackelets.bigfun.platform.payment.mapping.PaymentMapper;
import com.crackelets.bigfun.platform.payment.resource.CreatePaymentResource;
import com.crackelets.bigfun.platform.payment.resource.PaymentResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {
private final PaymentService paymentService;
private final PaymentMapper mapper;


    public PaymentController(PaymentService paymentService, PaymentMapper mapper) {
        this.paymentService = paymentService;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<PaymentResource> getAllPayments(Pageable pageable){
        return mapper.modelListPage(paymentService.getAll(), pageable);
    }
    @GetMapping("{paymentId}")
    public PaymentResource getPaymentById(@PathVariable Long paymentId){
        return mapper.toResource(paymentService.getById(paymentId));
    }
    @PostMapping
    public ResponseEntity<PaymentResource> createPayment(@RequestBody CreatePaymentResource resource){
        return  new ResponseEntity<>(mapper.toResource(paymentService.create(mapper.toModel(resource))), HttpStatus.CREATED);
    }
    @DeleteMapping("{paymentId}")
    public ResponseEntity<?> deletePayment(@PathVariable Long paymentId){
        return paymentService.delete(paymentId);
    }
}
