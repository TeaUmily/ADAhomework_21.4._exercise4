package hr.ferit.tumiljanovic.bmicalculator;

import android.content.res.Resources;

 public class Underweight extends BMICategory {

    private String discription;
    private String condition_name;

    public Underweight() {
        this.condition_name = "Underweight";
        this.discription ="A BMI of less than 18.5 indicates that you are underweight, so you may need to put on some weight. You are recommended to ask your Doctor or a dietician for advice.";
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
