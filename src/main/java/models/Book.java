package models;

import javax.persistence.*;

@Entity
@Table(name="books")

public class Book {

    private int id;
    private String title;
    private int year;
    private String gender;

    public Book(){

    }

    public Book(String title, int year, String gender) {
        this.title = title;
        this.year = year;
        this.gender = gender;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name ="year")

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Column(name="gender")

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
