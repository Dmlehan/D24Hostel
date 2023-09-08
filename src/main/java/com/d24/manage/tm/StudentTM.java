package com.d24.manage.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentTM {
    private String student_id;
    private String name;
    private String address;
    private String contact;
    private LocalDate date;
    private String gender;

}
