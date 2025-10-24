/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.service.impl;

import com.ramirez.biblioteca.domain.Categoria;
import com.ramirez.biblioteca.repository.CategoriaRepository;
import com.ramirez.biblioteca.service.CategoriaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository repo;
    public CategoriaServiceImpl(CategoriaRepository repo) { this.repo = repo; }

    @Override
    public List<Categoria> listarTodos() { return repo.findAll(); }

    @Override
    public Optional<Categoria> buscarPorId(Long id) { return repo.findById(id); }

    @Override
    public Categoria guardar(Categoria categoria) { return repo.save(categoria); }

    @Override
    public void eliminar(Long id) { repo.deleteById(id); }
}
