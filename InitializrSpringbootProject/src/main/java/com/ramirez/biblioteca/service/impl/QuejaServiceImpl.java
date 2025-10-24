/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.service.impl;

import com.ramirez.biblioteca.domain.Queja;
import com.ramirez.biblioteca.repository.QuejaRepository;
import com.ramirez.biblioteca.service.QuejaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class QuejaServiceImpl implements QuejaService {
    private final QuejaRepository repo;
    public QuejaServiceImpl(QuejaRepository repo) { this.repo = repo; }

    @Override
    public List<Queja> listarTodos() { return repo.findAll(); }

    @Override
    public Optional<Queja> buscarPorId(Long id) { return repo.findById(id); }

    @Override
    public Queja guardar(Queja queja) { return repo.save(queja); }
}

