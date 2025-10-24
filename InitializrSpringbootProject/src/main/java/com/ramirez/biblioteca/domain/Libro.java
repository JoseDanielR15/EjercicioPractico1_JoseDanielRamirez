/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    private String isbn;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    // Relación con la tabla categoria (muchos libros pertenecen a una categoría)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    private LocalDate fechaPublicacion;

    private Boolean disponible = true;

    
    @Column(precision = 10, scale = 2)
    private BigDecimal precio;

    // ====== Getters y Setters ======

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Categoria getCategoria() { return categoria; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public LocalDate getFechaPublicacion() { return fechaPublicacion; }

    public void setFechaPublicacion(LocalDate fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public Boolean getDisponible() { return disponible; }

    public void setDisponible(Boolean disponible) { this.disponible = disponible; }

    public BigDecimal getPrecio() { return precio; }

    public void setPrecio(BigDecimal precio) { this.precio = precio; }

}

