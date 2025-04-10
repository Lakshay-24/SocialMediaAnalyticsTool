package com.example.socialmedia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    private String role="USER";

    public User() {
    }

    public User(String username, String password, String email) {
        this.password = password;
        this.email = email;
    }

 

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
