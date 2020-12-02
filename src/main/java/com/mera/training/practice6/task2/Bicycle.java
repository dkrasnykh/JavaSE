package com.mera.training.practice6.task2;

import java.util.Objects;

public class Bicycle {
    static final int SPEED_LIMIT = 50;
    private String modelName;
    private int maxSpeed;

    public Bicycle(String modelName, int maxSpeed) {
        if (maxSpeed < 0 || maxSpeed > SPEED_LIMIT) {
            throw new IllegalArgumentException(String.format("The maximum bicycle speed is %d (%d)", SPEED_LIMIT, maxSpeed));
        }
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Bicycle)) {
            return false;
        }
        Bicycle bicycle = (Bicycle) o;
        return maxSpeed == bicycle.maxSpeed &&
                modelName.equals(bicycle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
