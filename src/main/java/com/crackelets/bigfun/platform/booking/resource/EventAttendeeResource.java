package com.crackelets.bigfun.platform.booking.resource;

import com.crackelets.bigfun.platform.booking.domain.model.Event;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class EventAttendeeResource {

    private Long attendeeId;
    private Event event;
}
