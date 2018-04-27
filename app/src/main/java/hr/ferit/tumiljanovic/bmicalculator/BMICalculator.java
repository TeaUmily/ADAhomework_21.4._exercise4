package hr.ferit.tumiljanovic.bmicalculator;

public class BMICalculator {

    private double height;
    private double weight;

    public BMICalculator(double mHeight, double mWeight) {
        this.height = mHeight;
        this.weight = mWeight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateBMI(){
        return weight /(height * height);
    }



}
