package com.d24.manage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto implements SuperDto{
    @Id
    private String res_id;
    private LocalDate date;

    @ToString.Exclude
    private StudentDto studentDto;

    @ToString.Exclude
    private RoomDto roomDto;

    private String status;
}
