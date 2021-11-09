package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

public class healthy extends AppCompatActivity {
private EditText edtWeight;
private EditText edtHeight;
private double Bmi;

private int weight;
private int height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);
        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);



    }

    public void onClickBMI(View view) {
        String h = edtHeight.getText().toString();
        height = Integer.parseInt(h);

        String w = edtWeight.getText().toString();
        weight = Integer.parseInt(w);

        Bmi = BMI(height,weight);

        Toast.makeText(this, ""+Bmi, Toast.LENGTH_SHORT).show();

    }

    private double BMI(int height, int weight) {
        double BMI = weight/((Integer)(height/100));
        return BMI;
    }

    public void onClickSave(View view) {

        BMI bmi = new BMI(weight,height,Bmi,false);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String String = gson.toJson(bmi);

        editor.putString("BMI", String);
        editor.commit();

        Toast.makeText(this,"saved",Toast.LENGTH_SHORT).show();
    }
}