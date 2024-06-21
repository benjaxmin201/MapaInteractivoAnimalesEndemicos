package com.generation.mapaendemico.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "centros")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Centro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String tipocentro;

    private String direccion;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region centroRegion;
}
