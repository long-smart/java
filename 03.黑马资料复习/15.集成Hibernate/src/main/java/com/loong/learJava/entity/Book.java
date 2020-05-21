package com.loong.learJava.entity;

import javax.persistence.*;

@Entity
public class Book extends AbstractEntity {
    private String title;

    @Column(nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}