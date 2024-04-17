package io.eyano.eyanoschool.feesservice.entities;

import io.eyano.eyanoschool.feesservice.entitiesExt.ClassFees;
import io.eyano.eyanoschool.feesservice.entitiesExt.SchoolYear;
import jakarta.persistence.*;
import lombok.*;

/*
    * Fees is an entity that represents the fees that a student must pay
    * @Author : Pascal Tshingila
    * @Since : 02/02/2021
    * @Version : 1.0
 */

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder @ToString
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String designation;

    @Column(nullable = false)
    private double amount;

    //From the utility module
    @Transient
    private SchoolYear schoolYear;
    private Long idSchoolYear;

    //From the class module
    @Transient
    private ClassFees classFees;
    private Long idClassFess;

    @ManyToOne
    private TypeFees typeFees;

    @ManyToOne
    private SliceFees sliceFees;

    //Attribute to allow removing an entity
    private boolean remove;
}
