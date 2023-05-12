package com.jaga.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pokemon_details")
public class PokemonVO {
    @Id
    private String id;
    private String num;
    private String name;
    private String img;
    private ArrayList<String> type;
    private String heightInMeter;
    private String weightInKg;
    private String candy;
    private int candyCount;
    private String  egg;
    private float spawnChance;
    private float avgSpawns;
    private String spawnTime;
    private ArrayList<Float> multiplayer;
    private ArrayList<String> weaknesses;
    private ArrayList<HashMap<String,String>> nextEvolution;

}
