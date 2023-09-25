package com.crackelets.bigfun.platform.profile.resource;

import com.crackelets.bigfun.platform.profile.domain.model.OrganizerEvent;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor

public class OrganizerResource {

    private Long id;
    private String userName;
    private String name;
    private String email;
    private Set<OrganizerEvent> eventsListByOrganizer;
}
