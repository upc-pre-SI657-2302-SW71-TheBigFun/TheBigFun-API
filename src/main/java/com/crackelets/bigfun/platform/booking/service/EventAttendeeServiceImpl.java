package com.crackelets.bigfun.platform.booking.service;

import com.crackelets.bigfun.platform.booking.domain.model.EventAttendee;
import com.crackelets.bigfun.platform.booking.domain.persistence.EventAttendeeRepository;
import com.crackelets.bigfun.platform.booking.domain.persistence.EventRepository;
import com.crackelets.bigfun.platform.booking.domain.service.EventAttendeeService;
import com.crackelets.bigfun.platform.shared.exception.ResourceValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import java.util.List;

@Service
public class EventAttendeeServiceImpl implements EventAttendeeService {

    private static final String ENTITY = "Event";

    private final EventAttendeeRepository eventAttendeeRepository;

    private final EventRepository eventRepository;

    private final Validator validator;

    public EventAttendeeServiceImpl(EventAttendeeRepository eventAttendeeRepository, EventRepository eventRepository, Validator validator) {
        this.eventAttendeeRepository = eventAttendeeRepository;
        this.eventRepository = eventRepository;
        this.validator = validator;
    }


    @Override
    public List<EventAttendee> getAll() {
        return eventAttendeeRepository.findAll();
    }

    @Override
    public EventAttendee create(EventAttendee eventAttendee) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long eventAttendeeId) {
        return null;
    }

    @Override
    public List<EventAttendee> getAllByAttendeeId(Long attendeeId) {
        return eventAttendeeRepository.findAllByAttendeeId(attendeeId);
    }

    @Override
    public List<EventAttendee> getAllAttendeesByEventId(Long eventId) {
        var event=eventRepository.findById(eventId);
        if(event==null) throw new ResourceValidationException("the event doesn't exist");
        return eventAttendeeRepository.findAllByEvent(event);
    }
}
