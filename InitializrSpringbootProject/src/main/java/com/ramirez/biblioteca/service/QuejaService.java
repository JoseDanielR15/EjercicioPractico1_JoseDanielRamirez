/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.service;

import com.ramirez.biblioteca.domain.Queja;
import java.util.List;
import java.util.Optional;

public interface QuejaService {
    List<Queja> listarTodos();
    Optional<Queja> buscarPorId(Long id);
    Queja guardar(Queja queja);
}

