package com.jaga.pokemon.service;

import com.jaga.pokemon.dao.PokemonDAO;
import com.jaga.pokemon.model.PokemonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonDAO pokemonDAO;

    public List<PokemonVO> getAllPokemon(){
        return pokemonDAO.getAllPokemon();
    }

    public Optional<PokemonVO> getPokemonById(String id) {
        return pokemonDAO.getPokemonById(id);
    }

    public List<List<PokemonVO>> getPokemonForUser() {
        return pokemonDAO.getPokemonForUser();
    }

    public void addPokemon(List<PokemonVO> pokemonVOList) {
        pokemonDAO.addPokemon(pokemonVOList);
    }

    public void deletePoKemonById(String id) {
        pokemonDAO.deletePoKemonById(id);
    }
}
