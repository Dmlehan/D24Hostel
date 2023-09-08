package com.d24.manage.dto;


import com.d24.manage.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto implements SuperDto{
    private String student_id;
    private String name;
    private String address;
    private String contact;
    private LocalDate date;
    private String gender;

    @ToString.Exclude
    private List<Reservation> list=new ArrayList<>();
}
