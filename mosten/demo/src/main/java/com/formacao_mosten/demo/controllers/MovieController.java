package com.formacao_mosten.demo.controllers;

import com.formacao_mosten.demo.model.Movie;
import com.formacao_mosten.demo.model.MovieDTO;
import com.formacao_mosten.demo.repository.IMovieRepository;
import com.formacao_mosten.demo.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private IMovieRepository repository;

    // Fazer o méto..do HTTP para cadastrar novos filmes e séries
    @PostMapping
    @Transactional
    public ResponseEntity<Movie> cadastrar(@RequestBody @Valid Movie movie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.cadastrar(movie));
    }

    @GetMapping
    public List<Movie> listar() {
        return movieService.listarTodos();
    }

    @PostMapping("/votar/{id}")
    public ResponseEntity<Movie> votar(@PathVariable Long id, @RequestParam boolean positivo) {
        return ResponseEntity.ok(movieService.votar(id, positivo));
    }

    @GetMapping("/total-votos")
    public ResponseEntity<Map<String, Integer>> totalVotos() {
        int total = movieService.getTotalVotos();
        return ResponseEntity.ok(Collections.singletonMap("totalVotos", total));
    }

    @GetMapping("/medias")
    public List<MovieDTO> listarMedias() {
        return movieService.listarMedias();
    }

}