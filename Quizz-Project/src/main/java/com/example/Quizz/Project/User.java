package com.example.Quizz.Project;
import javax.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    
    
        public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
