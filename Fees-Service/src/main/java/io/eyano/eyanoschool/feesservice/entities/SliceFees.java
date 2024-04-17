package io.eyano.eyanoschool.feesservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder @ToString
public class SliceFees {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String designation;

    @Column(nullable = false)
    private double percentage;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalDate datePayment;
    @Column(nullable = false)
    private LocalDate endDatePayment;


    //Attribute to allow removing an entity
    private boolean remove;
}
