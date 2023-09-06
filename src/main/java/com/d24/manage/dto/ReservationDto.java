package com.d24.manage.dto;

import lombok.*;

import javax.persistence.Access;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@ToString


public class ReservationDto  implements  SuperDto{
    private String res_id;
    private LocalDate date;

    @ToString.Exclude
    private StudentDto studentDto;

    @ToString.Exclude
    private RoomDto roomDto;

    private String status;

}
