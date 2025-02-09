package com.example.demo.dto.users;

public class GetUserDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String username;

    public GetUserDTO(Long id, String name, String lastName, String email, String username) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User: " +
                name + " " + lastName +
                ", Email: " + email +
                ", Username: " + username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

}
