package models;

import javax.persistence.*;

@Entity
@Table(name="authors")

public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private int year;

    public Author(){

    }

    public Author(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
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

    @Column(name = "firstName")

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="lastName")

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "year")

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
