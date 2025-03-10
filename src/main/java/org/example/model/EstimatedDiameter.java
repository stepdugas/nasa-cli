package org.example.model;

public class EstimatedDiameter {

    private Miles miles;

    public Miles getMiles() {
        return miles;
    }

    public void setMiles(Miles miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "EstimatedDiameter{" +
                "miles=" + miles +
                '}';
    }
}
