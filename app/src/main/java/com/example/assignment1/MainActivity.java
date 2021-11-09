package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickOpenFullBody(View view) {
        Intent intent = new Intent(this,Full_Body_Workout.class);
        startActivity(intent);
    }

    public void OnClickOpenLowerBody(View view) {
        Intent intent = new Intent(this,Lower_Body_Workout.class);
        startActivity(intent);
    }

    public void OnClickOpenBicepsChest(View view) {
        Intent intent = new Intent(this,Biceps_Chest_Workout.class);
        startActivity(intent);
    }


    public void ABSOnClick(View view) {
        Intent intent = new Intent(this,ABS_Workout.class);
        startActivity(intent);
    }

    public void onClickBMI(View view) {
        Intent intent = new Intent(this,healthy.class);
        startActivity(intent);
    }

    public void onClickFoodSupplements(View view) {
        Intent intent = new Intent(this,Healthy_Things.class);
        startActivity(intent);
    }
}