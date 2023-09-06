package com.d24.manage.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class StudentDto {
    private String student_id;
    private String name;
    private String address;
    private String contact;
    private LocalDate date;
    private String gender;

    @ToString.Exclude
    private List<Reservation> list=new ArrayList<>();


}
