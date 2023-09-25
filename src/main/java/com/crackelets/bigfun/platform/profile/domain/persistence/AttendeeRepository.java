package com.crackelets.bigfun.platform.profile.domain.persistence;

import com.crackelets.bigfun.platform.profile.domain.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {

    Attendee findFirstByName(String name);

    Attendee findByUserName(String name);

    Attendee findByEmail(String email);

}
