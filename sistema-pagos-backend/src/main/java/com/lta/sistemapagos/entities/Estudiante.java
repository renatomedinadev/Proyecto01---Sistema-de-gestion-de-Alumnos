package com.lta.sistemapagos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    @Id
    private String id;

    private String nombre;

    private String apellido;

    @Column(unique = true)
    private String codigo;

    private String programaId;

    private String foto;
    
}
