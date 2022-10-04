package com.ducanh.casestudy.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "performance")
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}