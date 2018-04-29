package hr.ferit.tumiljanovic.bmicalculator;

import android.content.Context;

public class Underweight extends BMICategory {

    private String description;
    private String condition_name;
    private Context context;

    public Underweight(Context context) {
        this.context = context;
        this.condition_name = context.getString(R.string.Underweight);
        this.description =context.getString(R.string.Underweight_description);
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
