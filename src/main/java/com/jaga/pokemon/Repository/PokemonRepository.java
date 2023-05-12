package com.jaga.pokemon.Repository;

import com.jaga.pokemon.model.PokemonVO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokemonRepository extends MongoRepository<PokemonVO, ObjectId> {
}
