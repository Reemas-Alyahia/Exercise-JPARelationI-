package com.example.jpa121.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    private Integer id;

    @NotNull(message = "Area cannot be null")
    @Column(columnDefinition = "int not null")
    private Integer area;

    @NotEmpty(message = "street cannot be empty")
    @Column(columnDefinition = "varchar(20)")
    private String street;

    @NotNull(message = " Building Number cannot be null")
    @Column(columnDefinition = "int not null")
    private Integer buildingNumber;


    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;
}
