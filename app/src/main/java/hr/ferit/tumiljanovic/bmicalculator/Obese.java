package hr.ferit.tumiljanovic.bmicalculator;

import android.content.Context;
import android.content.res.Resources;


public class Obese extends BMICategory {


    private String description;
    private String condition_name;
    private Context context;
    
    public Obese(Context context) {

        this.context=context;
        this.condition_name = context.getString(R.string.Obese);
        this.description = context.getString(R.string.Obese_description);
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
