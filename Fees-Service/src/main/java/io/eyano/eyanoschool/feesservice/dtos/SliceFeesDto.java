package io.eyano.eyanoschool.feesservice.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter @Setter @ToString @NoArgsConstructor
public class SliceFeesDto  {

    private Long id;

    @NotEmpty(message = "Empty field not allowed")
    @NotBlank(message = "White field not allowed")
    @Size(max = 50, min=5, message = "The length of the field must be between 4 and 50 characters." )
    private String designation;

    @Min(value = 1, message = "The field cannot be less than 1.")
    @Max(value = 100,message = "Maximum field length is 100 characters")
    private double percentage;
    private LocalDate date;
    private LocalDate datePayment;
    private LocalDate endDatePayment;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private boolean remove;

}
