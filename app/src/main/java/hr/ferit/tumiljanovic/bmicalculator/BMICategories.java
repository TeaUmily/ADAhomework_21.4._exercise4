package hr.ferit.tumiljanovic.bmicalculator;

import android.support.annotation.StringRes;

public enum BMICategories {
    UNDERWEIGHT(R.string.Underweight,R.string.Underweight_description),
    HEALTHY((R.string.Healthy),R.string.Healthy_description),
    OVERWEIGHT(R.string.Overweight, R.string.Overweight_description),
    OBESE(R.string.Obese,R.string.Obese_description);

    @StringRes
    private int nameResource;

    @StringRes
    private int descriptionResource;



    BMICategories(int nameRes, int descriptionRes) {
        this.nameResource = nameRes;
        this.descriptionResource=descriptionRes;
    }

    public int getNameResource() {
        return nameResource;
    }

    public int getDescriptionResource() {
        return descriptionResource;
    }
}
