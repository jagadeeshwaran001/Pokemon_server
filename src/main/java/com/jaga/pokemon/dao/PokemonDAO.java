package com.jaga.pokemon.dao;

import com.jaga.pokemon.Repository.PokemonRepository;
import com.jaga.pokemon.model.PokemonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PokemonDAO {

    @Autowired
    PokemonRepository pokemonRepository;

    public List<PokemonVO> getAllPokemon(){
       return pokemonRepository.findAll();
    }

    public void addPokemon(PokemonVO pokemonVO){
        pokemonRepository.save(pokemonVO);
    }
}
