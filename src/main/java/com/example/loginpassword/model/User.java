package com.example.loginpassword.model;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user", schema = "public")
@Getter @Setter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String password;


}
