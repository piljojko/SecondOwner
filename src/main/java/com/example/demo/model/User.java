package com.example.demo.model;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private Email email;
    private String username;
    private String password;


    public User(String name, String lastName, String email, String username, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = new Email(email);
        this.username = username;
        this.password = password;
    }

    public User(Long id, String name, String lastName, String email, String username, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = new Email(email);
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email.toString();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
