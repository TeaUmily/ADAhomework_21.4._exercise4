package hr.ferit.tumiljanovic.bmicalculator;

import android.content.res.Resources;

public class Healthy extends BMICategory {

    private String discription;
    private String condition_name;

    public Healthy() {
        this.condition_name = "Healthy";
        this.discription = "A BMI of 18.5 - 24.9 indicates that you are at a healthy weight for your height. By maintaining a healthy weight, you lower your risk of developing serious health problems.";
    }


    @Override
    public String getDescription() {
        return discription;
    }

    @Override
    public String getCondition_name() {
        return condition_name;
    }

   
}
