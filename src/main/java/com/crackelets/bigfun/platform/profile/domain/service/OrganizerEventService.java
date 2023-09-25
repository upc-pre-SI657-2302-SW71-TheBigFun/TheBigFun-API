package com.crackelets.bigfun.platform.profile.domain.service;

import com.crackelets.bigfun.platform.profile.domain.model.OrganizerEvent;

import java.util.List;

public interface OrganizerEventService {

    List<OrganizerEvent> getAll();
    List<OrganizerEvent> getAllByOrganizerId(Long organizerId);
}
