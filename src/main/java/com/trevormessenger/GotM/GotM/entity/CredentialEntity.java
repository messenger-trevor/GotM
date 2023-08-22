package com.trevormessenger.GotM.GotM.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Credential")
@Entity
@Data
public class CredentialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public CredentialEntity() {

    }
    public CredentialEntity(Integer user_id, String username, String password) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
    }
}
