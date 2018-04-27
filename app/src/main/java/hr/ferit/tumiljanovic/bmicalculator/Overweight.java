package hr.ferit.tumiljanovic.bmicalculator;

import android.content.res.Resources;

import butterknife.OnClick;

public class Overweight extends BMICategory {

    private String discription;
    private String condition_name;

    public Overweight() {
        this.condition_name = "Overweight";
        this.discription = "A BMI of 25 - 29.9 indicates that you are slightly overweight. You may be advised to lose some weight for health reasons. You are recommended to talk to your Doctor or a dietician for advice.Resources.getSystem().getString(R.string.overweight_description)";
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
