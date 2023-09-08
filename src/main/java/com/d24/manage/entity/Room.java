package com.d24.manage.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Room implements SuperEntity {
    @Id
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;

    @ToString.Exclude
    @OneToMany(mappedBy = "room",targetEntity = Reservation.class)
    private List<Reservation> reservationList = new ArrayList<>();
}
