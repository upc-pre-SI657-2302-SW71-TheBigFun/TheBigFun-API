package com.crackelets.bigfun.platform.profile.api.rest;

import com.crackelets.bigfun.platform.profile.domain.model.Organizer;
import com.crackelets.bigfun.platform.profile.domain.persistence.OrganizerRepository;
import com.crackelets.bigfun.platform.profile.domain.service.OrganizerEventService;
import com.crackelets.bigfun.platform.profile.mapping.OrganizerEventMapper;
import com.crackelets.bigfun.platform.profile.resource.OrganizerEventResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/api/v1/organizersto")
public class OrganizerEventController {

    private final OrganizerEventService organizerEventService;
    private final OrganizerRepository organizerRepository;

    private final OrganizerEventMapper mapper;

    public OrganizerEventController(OrganizerEventService organizerEventService, OrganizerRepository organizerRepository, OrganizerEventMapper mapper) {
        this.organizerEventService = organizerEventService;
        this.organizerRepository = organizerRepository;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<OrganizerEventResource> getAllOrganizerEvents(Pageable pageable){
        return mapper.modelListPage(organizerEventService.getAll(),pageable);
    }

    @GetMapping("{organizerId}/events")
    public Page<OrganizerEventResource> getAllEventsByOrganizerId(Pageable pageable, @PathVariable Long organizerId){
        return mapper.modelListPage(organizerEventService.getAllByOrganizerId(organizerId),pageable);
    }

    @PostMapping("{organizerId}/events/{eventId}")
    public ResponseEntity<?>addEventToOrganizer(@PathVariable Long organizerId,@PathVariable Long eventId){
        Organizer organizer=organizerRepository.findById(organizerId)
                .orElseThrow(()->new RuntimeException("The Organizer doesn't exist."));

        if(organizer.getEventsListByOrganizer()!=null){
            boolean eventExist=organizer.getEventsListByOrganizer().stream()
                    .anyMatch(event->event.getEventId().equals(eventId));
            if(eventExist) return ResponseEntity.badRequest().body("These event already exist for the Organizer.");
        }

        organizer.addEvent(organizer,eventId);
        organizerRepository.save(organizer);

        return ResponseEntity.ok("Event was added correctly.");
    }

}
