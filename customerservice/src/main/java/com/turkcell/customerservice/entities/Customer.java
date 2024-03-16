package com.turkcell.customerservice.entities;

import com.turkcell.customerservice.enums.EnumGender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMERS")
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surname;

    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "PASSWORD", length = 100, nullable = false)
    private String password;

    @Column(name = "ADDRESS", length = 500, nullable = false)
    private String address;

    @Column(name = "PHONE_NUMBER", length = 11, nullable = false)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column (name = "GENDER", length = 100, nullable = false)
    private EnumGender gender;
}
