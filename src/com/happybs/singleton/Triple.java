package com.happybs.singleton;

import java.util.Map;

public class Triple {
    private int id;
    private static Map<Integer, Triple> triples = Map.of(0,new Triple(0)
    ,1, new Triple(1)
    ,2, new Triple(2));

    public Triple(int i) {
        this.id = i;
    }

    public static Triple getInstance(int id) {
        return triples.get(id);
    }
}
