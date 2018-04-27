package hr.ferit.tumiljanovic.bmicalculator;

import android.content.res.Resources;

public class Obese extends BMICategory {

    private String discription;
    private String condition_name;
    
    public Obese() {
        this.condition_name = "Obese";
        this.discription ="A BMI of over 30 indicates that you are obese. Your health may be at risk if you do not lose weight. You are recommended to talk to your Doctor or a dietician for advice.";
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
