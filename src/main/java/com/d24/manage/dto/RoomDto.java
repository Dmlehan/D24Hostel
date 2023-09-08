package com.d24.manage.dto;

import com.d24.manage.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto implements SuperDto{
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;

    @ToString.Exclude
    private List<Reservation> reservationList = new ArrayList<>();

}
