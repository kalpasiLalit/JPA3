package com.Jpa.jpapart3;

import com.Jpa.jpapart3.entities.Address;
import com.Jpa.jpapart3.entities.Author;
import com.Jpa.jpapart3.entities.Book;
import com.Jpa.jpapart3.entities.Subject;
import com.Jpa.jpapart3.repos.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
class Jpapart3ApplicationTests {
    @Autowired
    EntityManager entityManager;
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Autowired
    AuthorRepository authorRepository;

//    @Test
//    void contextLoads() {
//}

    @Test()
    public void testPer() {
        Author author = new Author();
        author.setAuthorName("Sumit");
        Address address = new Address();
        address.setStreetNumber("21");
        address.setLocation("h-2 -70");
        address.setState("Up");
        author.setAddress(address);
        List<Subject> subject = new ArrayList<>();
        Subject subject1 = new Subject();
        subject1.setSubjectName("java");
        Subject subject2 = new Subject();
        subject2.setSubjectName("c++");
        subject.add(subject1);
        subject.add(subject2);
        Subject subject3 = new Subject();
        subject3.setSubjectName("python");
        subject.add(subject3);
        author.setSubject(subject);
        authorRepository.save(author);
    }

    @Test
    public void TestOneToOne() {
//        Author author = new Author();
//        author.setAuthorName("sumit");
//        Address address = new Address();
//        address.setStreetNumber("21");
//        address.setLocation("h-2 -70");
//        address.setState("Up");
//        author.setAddress(address);
//        List<Subject> subject = new ArrayList<>();
//        Subject subject1 = new Subject();
//        subject1.setSubjectName("java");
//        Subject subject2 = new Subject();
//        subject2.setSubjectName("c++");
//        subject.add(subject1);
//        subject.add(subject2);
//        Subject subject3 = new Subject();
//        subject3.setSubjectName("python");
//        subject.add(subject3);
//        author.setSubject(subject);
//        Book book = new Book();
//        book.setBookName("Programming");
//        author.setBook(book);
//        book.setAuthor(author);
//        authorRepository.save(author);
    }


    @Test
    public void testOneToMany() {
//        Author author = new Author();
//        author.setAuthorName("sumit");
//        Address address = new Address();
//        address.setStreetNumber("21");
//        address.setLocation("h-2 -70");
//        address.setState("Up");
//        author.setAddress(address);
//        Book book1 = new Book();
//        book1.setAuthor(author);
//        book1.setBookName("c++");
//        Book book2 = new Book();
//        book2.setAuthor(author);
//        book2.setBookName("java");
//        HashSet<Book> books = new HashSet<>();
//        books.add(book1);
//        books.add(book2);
//        author.setBookSet(books);
//        authorRepository.save(author);
    }


    @Test
    //@Transactional
    public void TestManyToMany() {
        Author author1 = new Author();
        author1.setAuthorName("puneet");
        Author author2 = new Author();
        author2.setAuthorName("vineet");


        Address address = new Address();
        address.setStreetNumber("21");
        address.setLocation("h-2 -70");
        address.setState("Up");
        author1.setAddress(address);
        author2.setAddress(address);

        List<Subject> subject = new ArrayList<>();
        Subject subject1 = new Subject();
        subject1.setSubjectName("python");
        Subject subject2 = new Subject();
        subject2.setSubjectName("c#");
        subject.add(subject1);
        subject.add(subject2);

        author1.setSubject(subject);
        author2.setSubject(subject);

        Book book1 = new Book();
        book1.setBookName("coding book");
        Book book2 = new Book();
        book2.setBookName("programming expert");
        HashSet<Book> bookHashSet = new HashSet<>();
        bookHashSet.add(book1);
        bookHashSet.add(book2);
        author1.setBooks(bookHashSet);
        author2.setBooks(bookHashSet);


        HashSet<Author> authorHashSet = new HashSet<>();
        authorHashSet.add(author1);
        authorHashSet.add(author2);
        book1.setAuthorSet(authorHashSet);
        book2.setAuthorSet(authorHashSet);

        authorRepository.save(author1);
        authorRepository.save(author2);



    }

//    @Test
//    @Transactional
//    public  void manyToManyTest2(){
//
//        Author author = new Author();
//        author.setAuthorName("Ameesh");
//
//        Address address = new Address();
//        address.setState("Delhi");
//        address.setLocation("Burari");
//        address.setStreetNumber("47");
//        author.setAddress(address);
//
//        List<Subject> subjects = new ArrayList<>() ;
//        Subject subject1 = new Subject();
//        subjects.add(subject1);
//        author.setSubject(subjects);
//        authorRepository.save(author);
//    }

}
