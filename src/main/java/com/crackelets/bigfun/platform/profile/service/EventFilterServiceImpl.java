package com.crackelets.bigfun.platform.profile.service;

import com.crackelets.bigfun.platform.booking.api.internal.BookingContextFacade;
import com.crackelets.bigfun.platform.booking.domain.model.Event;
import com.crackelets.bigfun.platform.profile.domain.service.EventFilterService;

import java.util.List;

public class EventFilterServiceImpl implements EventFilterService {
    private final BookingContextFacade bookingContextFacade;

    public EventFilterServiceImpl(BookingContextFacade bookingContextFacade) {
        this.bookingContextFacade = bookingContextFacade;
    }


/*    @Override
    public List<Event> getAllEventsByOrganizer(Long id) {
        return bookingContextFacade.getAllByOrganizerId(id);
    }*/
}
