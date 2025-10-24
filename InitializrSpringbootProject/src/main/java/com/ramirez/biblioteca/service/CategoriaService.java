/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.service;

import com.ramirez.biblioteca.domain.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> listarTodos();
    Optional<Categoria> buscarPorId(Long id);
    Categoria guardar(Categoria categoria);
    void eliminar(Long id);
}
