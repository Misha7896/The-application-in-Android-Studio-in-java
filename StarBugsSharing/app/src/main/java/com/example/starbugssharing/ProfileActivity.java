package com.example.starbugssharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void btnClicRent(View v) {
        Intent intent = new Intent(this, RentActivity.class);
        startActivity(intent);
    }
    public void btnClicPDD(View v) {
        Intent intent = new Intent(this, PDDActivity.class);
        startActivity(intent);
    }
    public void btnClicChaVo(View v) {
        Intent intent = new Intent(this, ChaVoActivity.class);
        startActivity(intent);
    }
    public void btnClicStarBugsPlus(View v) {
        Intent intent = new Intent(this, StarBugsPlusActivity.class);
        startActivity(intent);
    }
}