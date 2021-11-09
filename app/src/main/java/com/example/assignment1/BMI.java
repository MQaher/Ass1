package com.example.assignment1;

public class BMI {
    private int weight =0;
    private int height =0;
    private double BMI =0;

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }

    private  boolean isNull = true;

    public BMI(int weight, int height, double BMI ,boolean isnull) {
        this.weight = weight;
        this.height = height;
        this.BMI = BMI;
        this.isNull = isnull;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
}
