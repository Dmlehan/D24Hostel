package com.d24.manage.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Reservation implements  SuperEntity{
    @Id
    private String res_id;
    private LocalDate date;

    @ToString.Exclude
    @ManyToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Student student;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL,fetch =FetchType.EAGER )
    private Room room;

   private String status;

}
