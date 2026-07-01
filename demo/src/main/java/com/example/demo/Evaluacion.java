package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evaluacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String procesador;
    private String grafica;
    private String diagnostico;

    // Constructores vacíos y con datos requeridos por el ORM
    public Evaluacion() {}

    public Evaluacion(String procesador, String grafica, String diagnostico) {
        this.procesador = procesador;
        this.grafica = grafica;
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "TEST GUARDADO [ID=" + id + "] -> CPU: " + procesador + " | GPU: " + grafica + " | Resultado: " + diagnostico;
    }
}