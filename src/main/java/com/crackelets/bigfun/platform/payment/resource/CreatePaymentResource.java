package com.crackelets.bigfun.platform.payment.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaymentResource {

    private Date date;

    @NotNull
    @NotBlank
    @Size(max = 500)
    private String qrImg;
}
