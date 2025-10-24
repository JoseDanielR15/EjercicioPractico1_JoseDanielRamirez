/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.controller;

import com.ramirez.biblioteca.domain.Categoria;
import com.ramirez.biblioteca.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;
    public CategoriaController(CategoriaService categoriaService) { this.categoriaService = categoriaService; }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "categorias/list";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categorias/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Categoria categoria) {
        categoriaService.guardar(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        categoriaService.eliminar(id);
        return "redirect:/categorias";
    }
}

