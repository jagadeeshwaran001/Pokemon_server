package com.jaga.pokemon.dao;

import com.jaga.pokemon.Repository.PokemonRepository;
import com.jaga.pokemon.model.PokemonVO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class PokemonDAO {

    @Autowired
    PokemonRepository pokemonRepository;

    public List<PokemonVO> getAllPokemon(){
       return pokemonRepository.findAll();
    }

    public List<List<PokemonVO>> getPokemonForUser() {
        List<PokemonVO> pokemonVOList = pokemonRepository.findAll();
        Collections.shuffle(pokemonVOList);
        List<PokemonVO> userA = pokemonVOList.subList(0,pokemonVOList.size()/2);
        List<PokemonVO> userB = pokemonVOList.subList(pokemonVOList.size()/2,pokemonVOList.size());
        List<List<PokemonVO>> usersPokemonList = new ArrayList<>();
        usersPokemonList.add(userA);
        usersPokemonList.add(userB);
        return usersPokemonList;
    }
    public Optional<PokemonVO> getPokemonById(String id) {
        return pokemonRepository.findById(new ObjectId(id));
    }

    public void addPokemon(List<PokemonVO> pokemonVOList){
        pokemonVOList.forEach(pokemonVO -> {
            pokemonRepository.save(pokemonVO);
        });
    }

    public void deletePoKemonById(String id) {
        pokemonRepository.deleteById(new ObjectId(id));
    }
}
