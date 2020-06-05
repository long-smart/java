package com.loong.learnjava.entity;

import javax.persistence.Column;

public class Book extends AbstractEntity {
    @Column(nullable = true, length = 100)
    private String title;

}
