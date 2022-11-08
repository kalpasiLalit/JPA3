package com.Jpa.jpapart3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Column(name = "subjectname")
    private String subjectName;



}
