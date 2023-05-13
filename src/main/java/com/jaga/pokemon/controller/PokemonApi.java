package com.jaga.pokemon.controller;

import com.jaga.pokemon.model.PokemonVO;
import com.jaga.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PokemonApi {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/test")
    public String hello(){
        return "hello";
    }

    @GetMapping("/get-all-pokemons")
    public List<PokemonVO> getAllPokemon(){
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/get-pokemon-by-id/{id}")
    public Optional<PokemonVO> getPokemonById(@PathVariable String id) {
        return pokemonService.getPokemonById(id);
    }

    @DeleteMapping("/delete-pokemon-by-id/{id}")
    public void deletePoKemonById(@PathVariable String id) {
        pokemonService.deletePoKemonById(id);
    }

    @GetMapping("/get-pokemon-for-users")
    public List<List<PokemonVO>> getPokemon(){
        return pokemonService.getPokemonForUser();
    }

    @PostMapping("/add-pokemon")
    public void addPokemon(@RequestBody List<PokemonVO> pokemonVOList){
        pokemonService.addPokemon(pokemonVOList);
    }
}
