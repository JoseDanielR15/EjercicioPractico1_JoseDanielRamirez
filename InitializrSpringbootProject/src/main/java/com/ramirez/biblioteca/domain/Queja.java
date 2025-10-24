/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "queja")
public class Queja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private String email;
    private String telefono;

    @Enumerated(EnumType.STRING)
    private TipoQueja tipo;

    private String asunto;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String mensaje;

    private Boolean tratado = false;

    @Column(name="created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public TipoQueja getTipo() { return tipo; }
    public void setTipo(TipoQueja tipo) { this.tipo = tipo; }
    public String getAsunto() { return asunto; }
    public void setAsunto(String asunto) { this.asunto = asunto; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    public Boolean getTratado() { return tratado; }
    public void setTratado(Boolean tratado) { this.tratado = tratado; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
