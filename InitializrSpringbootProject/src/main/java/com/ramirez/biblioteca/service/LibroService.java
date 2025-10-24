/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.service;

import com.ramirez.biblioteca.domain.Libro;
import java.util.List;
import java.util.Optional;

public interface LibroService {
    List<Libro> listarTodos();
    Optional<Libro> buscarPorId(Long id);
    Libro guardar(Libro libro);
    void eliminar(Long id);
    List<Libro> buscarPorTitulo(String q);
}

