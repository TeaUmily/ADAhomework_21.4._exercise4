package hr.ferit.tumiljanovic.bmicalculator;

import android.content.Context;

public class Healthy extends BMICategory {

    private String description;
    private String condition_name;
    private Context context;

    public Healthy(Context context) {
        this.context= context;
        this.condition_name = context.getString(R.string.Healthy);
        this.description = "A BMI of 18.5 - 24.9 indicates that you are at a healthy weight for your height. By maintaining a healthy weight, you lower your risk of developing serious health problems.";
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCondition_name() {
        return condition_name;
    }

   
}
