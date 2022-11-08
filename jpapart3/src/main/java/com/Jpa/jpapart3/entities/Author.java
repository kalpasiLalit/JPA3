package com.Jpa.jpapart3.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String authorName;
    @Embedded
    private Address address;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Subject> subject = new ArrayList<>();

//    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
//    private Book book;
//
//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
//     private Set<Book> bookSet;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_table",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "authorid"), inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private Set<Book> books;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", address=" + address +
                ", Subject=" + subject +
                '}';
    }
}
