package com.generation.mapaendemico.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "parques")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Parque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
