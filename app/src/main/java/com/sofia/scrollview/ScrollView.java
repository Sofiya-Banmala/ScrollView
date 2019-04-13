package com.sofia.scrollview;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollView {
    private EditText etMake, etYear, etColor, etPrice, etSize;
    private Button btnCreate;
    private TextView tvRes;
    private int vehicleCount;

    public ScrollView(EditText etMake, EditText etYear, EditText etColor, EditText etPrice,
                      EditText etSize, Button btnCreate, TextView tvRes, int vehicleCount) {
        this.etMake = etMake;
        this.etYear = etYear;
        this.etColor = etColor;
        this.etPrice = etPrice;
        this.etSize = etSize;
        this.btnCreate = btnCreate;
        this.tvRes = tvRes;
        this.vehicleCount = vehicleCount;
    }

    public EditText getEtMake() {
        return etMake;
    }

    public void setEtMake(EditText etMake) {
        this.etMake = etMake;
    }

    public EditText getEtYear() {
        return etYear;
    }

    public void setEtYear(EditText etYear) {
        this.etYear = etYear;
    }

    public EditText getEtColor() {
        return etColor;
    }

    public void setEtColor(EditText etColor) {
        this.etColor = etColor;
    }

    public EditText getEtPrice() {
        return etPrice;
    }

    public void setEtPrice(EditText etPrice) {
        this.etPrice = etPrice;
    }

    public EditText getEtSize() {
        return etSize;
    }

    public void setEtSize(EditText etSize) {
        this.etSize = etSize;
    }

    public Button getBtnCreate() {
        return btnCreate;
    }

    public void setBtnCreate(Button btnCreate) {
        this.btnCreate = btnCreate;
    }

    public TextView getTvRes() {
        return tvRes;
    }

    public void setTvRes(TextView tvRes) {
        this.tvRes = tvRes;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    @Override
    public String toString() {
        return "ScrollView{" +
                "etMake=" + etMake +
                ", etYear=" + etYear +
                ", etColor=" + etColor +
                ", etPrice=" + etPrice +
                ", etSize=" + etSize +
                ", btnCreate=" + btnCreate +
                ", tvRes=" + tvRes +
                ", vehicleCount=" + vehicleCount +
                '}';
    }
}