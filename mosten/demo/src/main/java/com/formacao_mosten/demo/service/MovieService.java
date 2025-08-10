package com.formacao_mosten.demo.service;

import com.formacao_mosten.demo.model.Movie;
import com.formacao_mosten.demo.model.MovieDTO;
import com.formacao_mosten.demo.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private IMovieRepository movieRepository;

    public Movie cadastrar(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> listarTodos() {
        return movieRepository.findAll();
    }

    public Movie votar(Long id, boolean positivo) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Filme não encontrado"));

        if (positivo) {
            movie.setVotosPositivos(movie.getVotosPositivos() + 1);
        } else {
            movie.setVotosNegativos(movie.getVotosNegativos() + 1);
        }

        return movieRepository.save(movie);
    }

    public int getTotalVotos() {
        return movieRepository.findAll().stream()
                .mapToInt(m -> m.getVotosPositivos() + m.getVotosNegativos()).sum();
    }

    public List<MovieDTO> listarMedias() {
        return movieRepository.findAll()
                .stream()
                .map(f -> new MovieDTO(f.getTitulo(), f.getMediaAvaliacao()))
                .toList();
    }
}