package com.crackelets.bigfun.platform.profile.domain.service;

import com.crackelets.bigfun.platform.profile.domain.model.Organizer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrganizerService {

    List<Organizer> getAll();

    Page<Organizer> getAll(Pageable pageable);

    Organizer getById(Long organizerId);

    Organizer getByName(String Name);

    Organizer create(Organizer organizer);

    Organizer update(Long organizerId,Organizer organizer);

    ResponseEntity<?> delete (Long organizerId);



    Organizer addEventToOrganizer(Long organizerId, String eventName);

    //ver  para el pago!!!!!!!!
    Organizer addPayToOrganizer(Long organizerId, Long paymentId);



}
