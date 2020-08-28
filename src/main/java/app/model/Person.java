package app.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String job;
}
