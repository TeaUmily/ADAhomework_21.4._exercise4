package hr.ferit.tumiljanovic.bmicalculator;

public class BMIChart {

   private double BMI;
   private BMICategory category;



    public BMIChart(double BMI) {
        this.BMI = BMI;
        setCategory();
    }

    private void setCategory() {
        if(BMI < 18.5){
            category = new Underweight();
        }
        if(BMI >= 18.5 && BMI < 24.99){
            category = new Healthy();
        }
        if (BMI >= 25 && BMI < 29.99){
            category = new Overweight();
        }
        if(BMI >= 30){
            category = new Obese();
        }
    }

    public String getBMIDiscription(){
        return category.getDescription();
    }


    public String getBMICondition_name(){
        return category.getCondition_name();
    }


    public BMICategory getCategory() {
        return category;
    }
}
