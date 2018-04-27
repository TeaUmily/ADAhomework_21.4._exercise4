package hr.ferit.tumiljanovic.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BMIDisplayActivity extends AppCompatActivity {


    @BindView(R.id.height_EditText) EditText EditText_height;
    @BindView(R.id.weight_EditText) EditText EditText_weight;
    @BindView(R.id.BMI_Display_TextView) TextView TextView_Display_BMI;
    @BindView(R.id.title_TextView) TextView TextView_title;
    @BindView(R.id.image_person_ImageView) ImageView ImageView_image_person;
    @BindView(R.id.description_TextView)  TextView TextView_discription;
    @BindView(R.id.Display_RelativeLayout) RelativeLayout RelativeLayout_Display;


    double mHight;
    double mWeight;
    double mResult;
    BMICalculator mCalculator;
    BMIChart mBMI_chart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmidisplay);
        ButterKnife.bind(this);
    }

   @OnClick (R.id.calculate_button)

    public void DisplayCondition(){
        try {
            checkInput();
            checkInputZero();
            checkHeight();
            checkWeight();

            setResources();

            mCalculator = new BMICalculator(mHight, mWeight);
            mResult = mCalculator.calculateBMI();
            mBMI_chart = new BMIChart(mResult);

            setElementsInLayout(mBMI_chart);

            TextView_Display_BMI.setText(String.valueOf(round(mResult)));
            TextView_title.setText(mBMI_chart.getBMICondition_name());
            TextView_discription.setText(mBMI_chart.getBMIDiscription());
        }

        catch(EmptyFieldException e){
            Toast toast= Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT);
            toast.show();
        }

        catch (InputZeroException e){
            Toast toast= Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT);
            toast.show();
        }

        catch(IllegalHeightException e){
            Toast toast= Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT);
            toast.show();
        }
        catch(IllegalWeightException e) {
            Toast toast = Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    private void checkInputZero()throws InputZeroException {
        if(Double.parseDouble(EditText_weight.getText().toString())==0 || Double.parseDouble(EditText_height.getText().toString())==0){
            throw new InputZeroException("Input can not be zero!");
        }
    }

    private void checkWeight()throws IllegalWeightException {
        if(Double.parseDouble(EditText_weight.getText().toString())>350){
            throw new IllegalWeightException("Illegal weight!");
        }
    }

    private void checkHeight() throws IllegalHeightException {
        if(Double.parseDouble(EditText_height.getText().toString())>2.5){
            throw new IllegalHeightException("Illegal height!");
        }
    }



    private void checkInput() throws EmptyFieldException {
        if(EditText_height.getText().toString().isEmpty() || EditText_weight.getText().toString().isEmpty()){
            throw new EmptyFieldException("Field empty!");
        }
    }

    private void setElementsInLayout(BMIChart mBMI_chart) {

            if(mBMI_chart.getBMICondition_name().equals("Underweight"))
            {
                ImageView_image_person.setImageResource(R.drawable.underweight);
                RelativeLayout_Display.setBackgroundColor(getResources().getColor(R.color.underweightBackground));

            }

            if(mBMI_chart.getBMICondition_name().equals("Healthy")){

                ImageView_image_person.setImageResource(R.drawable.healthy);
                RelativeLayout_Display.setBackgroundColor(getResources().getColor(R.color.healthyWeightBackground));
            }

            if(mBMI_chart.getBMICondition_name().equals("Overweight")) {

                ImageView_image_person.setImageResource(R.drawable.overweight);
                RelativeLayout_Display.setBackgroundColor(getResources().getColor(R.color.overweightBackground));
            }

            if(mBMI_chart.getBMICondition_name().equals("Obese")){

                ImageView_image_person.setImageResource(R.drawable.obese);
                RelativeLayout_Display.setBackgroundColor(getResources().getColor(R.color.obeseBackground));
            }

    }


    private void setResources() {
        mHight=Double.parseDouble(EditText_height.getText().toString());
        mWeight=Double.parseDouble(EditText_weight.getText().toString());
    }

    private double round(double value){
        return  (Math.round(value * 100.000) / 100.000);
    }


}