package com.jaga.pokemon.controller;

import com.jaga.pokemon.model.PokemonVO;
import com.jaga.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/get-pokemon")
    public void getPokemon(){

    }

    @PostMapping("/add-pokemon")
    public void addPokemon(@RequestBody List<PokemonVO> pokemonVOList){
        for(PokemonVO pokemonVO : pokemonVOList) {
            pokemonService.addPokemon(pokemonVO);
        }
    }
}
