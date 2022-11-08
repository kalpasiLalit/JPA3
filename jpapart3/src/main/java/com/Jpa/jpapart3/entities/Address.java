package com.Jpa.jpapart3.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
public class Address {
    @Column(name = "streetnumber")
    private String StreetNumber;
    private String location;
    private String state;
}

