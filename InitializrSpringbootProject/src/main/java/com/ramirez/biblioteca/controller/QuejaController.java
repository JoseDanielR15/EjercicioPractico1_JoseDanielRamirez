/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramirez.biblioteca.controller;

import com.ramirez.biblioteca.domain.Queja;
import com.ramirez.biblioteca.domain.TipoQueja;
import com.ramirez.biblioteca.service.QuejaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quejas")
public class QuejaController {
    private final QuejaService quejaService;
    public QuejaController(QuejaService quejaService) { this.quejaService = quejaService; }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("queja", new Queja());
        model.addAttribute("tipos", TipoQueja.values());
        return "quejas/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute @Valid Queja queja, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute("tipos", TipoQueja.values());
            return "quejas/form";
        }
        quejaService.guardar(queja);
        return "redirect:/quejas/gracias";
    }

    @GetMapping("/gracias")
    public String gracias() {
        return "quejas/thanks";
    }
}

