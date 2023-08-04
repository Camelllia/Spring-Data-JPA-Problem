package com.jpa.problem.sample.com.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    private String name;
}
