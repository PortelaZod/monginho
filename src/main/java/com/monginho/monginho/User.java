package com.monginho.monginho;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "user")
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Getter
    @Setter
    private String nome;

    private String sobrenome;

    @Id
    private String id;
}
