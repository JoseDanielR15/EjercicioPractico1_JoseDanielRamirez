/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.repository;

import com.ramirez.biblioteca.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByTituloContainingIgnoreCase(String titulo);
}
