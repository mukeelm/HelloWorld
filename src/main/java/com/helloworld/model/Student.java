package com.helloworld.model;

import lombok.*;


import javax.persistence.*;
@Entity
@Table(name = "Student")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empID;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL_ID")
    private String emailId;

    public Student(String firstName, String lastName, String emailId) {

    }
}