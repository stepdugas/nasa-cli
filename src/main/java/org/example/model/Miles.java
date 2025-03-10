package org.example.model;

public class Miles {

    private double estimatedDiameterMin;
    private double estimatedDiameterMax;

    public double getEstimatedDiameterMin() {
        return estimatedDiameterMin;
    }

    public void setEstimatedDiameterMin(double estimatedDiameterMin) {
        this.estimatedDiameterMin = estimatedDiameterMin;
    }

    public double getEstimatedDiameterMax() {
        return estimatedDiameterMax;
    }

    public void setEstimatedDiameterMax(double estimatedDiameterMax) {
        this.estimatedDiameterMax = estimatedDiameterMax;
    }

    @Override
    public String toString() {
        return "Miles{" +
                "estimatedDiameterMin=" + estimatedDiameterMin +
                ", estimatedDiameterMax=" + estimatedDiameterMax +
                '}';
    }
}
