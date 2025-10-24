/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.repository;

import com.ramirez.biblioteca.domain.Queja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuejaRepository extends JpaRepository<Queja, Long> { }

