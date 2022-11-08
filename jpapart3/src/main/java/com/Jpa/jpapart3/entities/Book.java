package com.Jpa.jpapart3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
//    @OneToOne
//    @JoinColumn(name = "author_id")
//    private Author author;
//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    private Author author;
    @ManyToMany(mappedBy = "books",cascade = CascadeType.ALL)
    private Set<Author> authorSet;

    private String bookName;

}
