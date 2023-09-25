package com.crackelets.bigfun.platform.booking.mapping;

import com.crackelets.bigfun.platform.booking.domain.model.Event;
import com.crackelets.bigfun.platform.booking.resource.CreateEventResource;
import com.crackelets.bigfun.platform.booking.resource.EventResource;
import com.crackelets.bigfun.platform.booking.resource.UpdateEventResource;
import com.crackelets.bigfun.platform.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class EventMapper implements Serializable {


    @Autowired
    private EnhancedModelMapper mapper;

    public EventResource toResource(Event model){
        return mapper.map(model, EventResource.class);}

    public Page<EventResource> modelListPage(List<Event> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, EventResource.class), pageable, modelList.size());
    }

    public Event toModel(CreateEventResource resource){ return mapper.map(resource, Event.class);}

    public Event toModel(UpdateEventResource resource){ return mapper.map(resource, Event.class);}
}
