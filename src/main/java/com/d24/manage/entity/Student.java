package com.d24.manage.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Student {
    @Id
    private String student_id;
    private String name;
    private String address;
    private String contact;
    private LocalDate date;
    private String gender;

    @ToString.Exclude
    @OneToMany(mappedBy = "student",targetEntity = Reservation.class)
    private List<Reservation> list=new ArrayList<>();
}
