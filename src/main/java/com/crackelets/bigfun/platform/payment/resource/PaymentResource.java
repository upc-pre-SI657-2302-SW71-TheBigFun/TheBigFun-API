package com.crackelets.bigfun.platform.payment.resource;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResource {
    private Long id;
    private Date date;
    private String qrImg;
}
