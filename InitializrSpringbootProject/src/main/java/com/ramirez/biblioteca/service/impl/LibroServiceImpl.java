/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.service.impl;

import com.ramirez.biblioteca.domain.Libro;
import com.ramirez.biblioteca.repository.LibroRepository;
import com.ramirez.biblioteca.service.LibroService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibroServiceImpl implements LibroService {

    private final LibroRepository repo;

    public LibroServiceImpl(LibroRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Libro> listarTodos() { return repo.findAll(); }

    @Override
    public Optional<Libro> buscarPorId(Long id) { return repo.findById(id); }

    @Override
    public Libro guardar(Libro libro) { return repo.save(libro); }

    @Override
    public void eliminar(Long id) { repo.deleteById(id); }

    @Override
    public List<Libro> buscarPorTitulo(String q) { return repo.findByTituloContainingIgnoreCase(q); }
}

