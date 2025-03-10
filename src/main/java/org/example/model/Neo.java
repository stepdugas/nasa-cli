package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Neo {

    private String id;

    private String name;


    @JsonProperty("is_potentially_hazardous_asteroid")
    private boolean potentiallyHazardousAsteroid;
}
