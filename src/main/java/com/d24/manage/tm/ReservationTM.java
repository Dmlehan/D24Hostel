package com.d24.manage.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationTM {
    private String res_id;
    private LocalDate date;
    private String student_id;
    private String student_name;
    private String room_type_id;
    private String status;
}
