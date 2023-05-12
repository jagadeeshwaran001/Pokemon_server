package com.jaga.pokemon.service;

import com.jaga.pokemon.dao.PokemonDAO;
import com.jaga.pokemon.model.PokemonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    PokemonDAO pokemonDAO;

    public List<PokemonVO> getAllPokemon(){
        return pokemonDAO.getAllPokemon();
    }

    public void addPokemon(PokemonVO pokemonVO) {
        pokemonDAO.addPokemon(pokemonVO);
    }
}
