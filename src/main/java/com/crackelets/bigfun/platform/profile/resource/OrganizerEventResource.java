package com.crackelets.bigfun.platform.profile.resource;

import com.crackelets.bigfun.platform.profile.domain.model.Organizer;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class OrganizerEventResource {

    private Long eventId;
    private Organizer organizer;
}
