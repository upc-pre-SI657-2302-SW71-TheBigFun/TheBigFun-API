package com.crackelets.bigfun.platform.booking.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name="event_payments")
public class EventPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "event_id",nullable = false)
    @JsonIgnore
    private Event event;

    private Long paymentId;

    public EventPayment(Event event, Long paymentId) {
        this.event = event;
        this.paymentId = paymentId;
    }
}
