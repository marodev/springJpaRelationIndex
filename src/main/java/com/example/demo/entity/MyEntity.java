package com.example.demo.entity;

import javax.persistence.*;

@Table(indexes = {
        @Index(name = "my_index", columnList = "id, firstname", unique = true)
})
@Entity
public class MyEntity {
    @Id
    private Long id;

    @ManyToOne
    private Person person;
}

