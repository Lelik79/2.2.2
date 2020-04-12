package com.example.a222;

public class HealthIndicator {

    private double weight;
    private int steps;

    public HealthIndicator(double weight, int steps) {
        this.weight = weight;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Показатели здоровья: "+"вес "+weight+", шаги "+steps;
    }
}