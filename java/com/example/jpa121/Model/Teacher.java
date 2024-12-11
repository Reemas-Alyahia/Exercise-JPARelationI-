package com.example.jpa121.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "name cannot be Empty!")
    @Column(columnDefinition = "varchar(20) not null")
    private String name;

    @NotNull(message = "age must be not null")
    @Column(columnDefinition = "int not null")
    private Integer age;

    @Email(message = "but Email in good way")
    @Column
    private String email;

    @NotNull
    @Column(columnDefinition = "int not null")
    private Integer salary;



   @OneToOne(cascade =CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;



}
