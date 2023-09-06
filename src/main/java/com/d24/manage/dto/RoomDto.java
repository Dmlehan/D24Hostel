package com.d24.manage.dto;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class RoomDto implements SuperDto{
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;

    @ToString.Exclude
    private List<Reservation> reservationList = new ArrayList<>();

}
