/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.controller;

import com.ramirez.biblioteca.domain.Libro;
import com.ramirez.biblioteca.domain.Categoria;
import com.ramirez.biblioteca.service.CategoriaService;
import com.ramirez.biblioteca.service.LibroService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;
    private final CategoriaService categoriaService;

    public LibroController(LibroService libroService, CategoriaService categoriaService) {
        this.libroService = libroService;
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public String lista(Model model, @RequestParam(value = "q", required = false) String q) {
        if (q != null && !q.isBlank()) {
            model.addAttribute("libros", libroService.buscarPorTitulo(q));
        } else {
            model.addAttribute("libros", libroService.listarTodos());
        }
        return "libros/list";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("libro", new Libro());
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "libros/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute @Valid Libro libro, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute("categorias", categoriaService.listarTodos());
            return "libros/form";
        }
        libroService.guardar(libro);
        return "redirect:/libros";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        libroService.buscarPorId(id).ifPresent(libro -> {
            model.addAttribute("libro", libro);
            model.addAttribute("categorias", categoriaService.listarTodos());
        });
        return "libros/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        libroService.eliminar(id);
        return "redirect:/libros";
    }
}

