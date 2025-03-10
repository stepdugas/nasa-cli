package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Neo {

    private String id;

    private String name;


    @JsonProperty("is_potentially_hazardous_asteroid")
    private boolean potentiallyHazardousAsteroid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPotentiallyHazardousAsteroid() {
        return potentiallyHazardousAsteroid;
    }

    public void setPotentiallyHazardousAsteroid(boolean potentiallyHazardousAsteroid) {
        this.potentiallyHazardousAsteroid = potentiallyHazardousAsteroid;
    }

    @Override
    public String toString() {
        return "Neo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", potentiallyHazardousAsteroid=" + potentiallyHazardousAsteroid +
                '}';
    }
}
