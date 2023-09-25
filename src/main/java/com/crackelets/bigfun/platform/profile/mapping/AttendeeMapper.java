package com.crackelets.bigfun.platform.profile.mapping;

import com.crackelets.bigfun.platform.profile.domain.model.Attendee;
import com.crackelets.bigfun.platform.profile.resource.AttendeeResource;
import com.crackelets.bigfun.platform.profile.resource.CreateAttendeeResource;
import com.crackelets.bigfun.platform.profile.resource.UpdateAttendeeResource;
import com.crackelets.bigfun.platform.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class AttendeeMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    public AttendeeResource toResource(Attendee model){ return mapper.map(model, AttendeeResource.class); }
    // model -> Resource


    public Attendee toModel(CreateAttendeeResource resource) {
        return mapper.map(resource, Attendee.class);
    }
    // Resource -> model


    public Attendee toModel(UpdateAttendeeResource resource) {
        return mapper.map(resource, Attendee.class);
    }

    public Page<AttendeeResource> modelListPage(List<Attendee> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, AttendeeResource.class), pageable, modelList.size());
    }

}
