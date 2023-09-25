package com.crackelets.bigfun.platform.profile.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name="organizer_events")
public class OrganizerEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "organizer_id",nullable = false)
    @JsonIgnore
    private Organizer organizer;

    private Long eventId;

    public OrganizerEvent(Organizer organizer, Long eventId) {
        this.organizer = organizer;
        this.eventId = eventId;
    }
}
