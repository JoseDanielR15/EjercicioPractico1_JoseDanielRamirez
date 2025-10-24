/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.controller;

import com.ramirez.biblioteca.service.LibroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final LibroService libroService;

    public HomeController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("libroDestacado", libroService.listarTodos().stream().findFirst().orElse(null));
        return "index";
    }
}

