package com.crackelets.bigfun.platform.profile.resource;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor

public class CreateOrganizerResource {

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(unique = true)
    private String userName;

    @NotNull
    @NotBlank
    @Size(max=60)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 255)
    private String email;

}
