package com.loong.learnjava.service;


public class User {
    private Long id;

    private String email;

    private String password;

    private String name;

    private Long createdAt;

    public User() {
    }

    public User(String email, String password, String name, Long createAt) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.createdAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createAt) {
        this.createdAt = createAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", createAt=" + createdAt +
                '}';
    }
}

