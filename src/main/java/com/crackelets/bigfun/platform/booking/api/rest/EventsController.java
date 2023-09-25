package com.crackelets.bigfun.platform.booking.api.rest;


import com.crackelets.bigfun.platform.booking.domain.service.EventService;
import com.crackelets.bigfun.platform.booking.mapping.EventMapper;
import com.crackelets.bigfun.platform.booking.resource.CreateEventResource;
import com.crackelets.bigfun.platform.booking.resource.EventResource;
import com.crackelets.bigfun.platform.booking.resource.UpdateEventResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/api/v1/events")
public class EventsController {

    private  final EventService eventService;

    private final EventMapper mapper;


    public EventsController(EventService eventService, EventMapper mapper) {
        this.eventService = eventService;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<EventResource> getAllEvents(Pageable pageable){
        return mapper.modelListPage(eventService.getAll(), pageable);
    }

    @PostMapping
    public ResponseEntity<EventResource> createEvent(@RequestBody CreateEventResource resource){
        return new ResponseEntity<>(mapper.toResource(eventService.create(mapper.toModel(resource))), HttpStatus.CREATED);
    }

    //@PostMapping()

    @PutMapping("{eventId}")
    public EventResource updateEvent(@PathVariable Long eventId,
                                     @RequestBody UpdateEventResource resource){
        return mapper.toResource(eventService.update(eventId, mapper.toModel(resource)));
    }

/*    @GetMapping("org/{organizerId}")
    public Page<EventResource> getAllEventsByOrginerId(Pageable pageable,@PathVariable Long organizerId){
        return mapper.modelListPage(eventService.getAllByOrganizerId(organizerId), pageable);
    }*/

    @DeleteMapping("{eventId}")
    public ResponseEntity<?> deleteEvent(@PathVariable Long eventId){ return eventService.delete(eventId);}




}
