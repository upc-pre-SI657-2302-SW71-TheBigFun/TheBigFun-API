package com.crackelets.bigfun.platform.profile.domain.service;

import com.crackelets.bigfun.platform.profile.domain.model.Attendee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AttendeeService {

    List<Attendee> getAll();

    Page<Attendee> getAll(Pageable pageable);

    Attendee getById(Long attendeeId);

    Attendee getByName(String name);

    Attendee create(Attendee attendee);

    Attendee update(Long id,Attendee attendee);

    ResponseEntity<?> delete (Long attendeeId);

    Attendee addEventToAttendee(Long attendeeId, String eventName);

    //List<Attendee> getAllByEventId(Long eventId);
}
