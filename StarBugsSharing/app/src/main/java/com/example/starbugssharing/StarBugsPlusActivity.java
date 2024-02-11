package com.example.starbugssharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StarBugsPlusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_bugs_plus);
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
    public void btnClicProfile(View v) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}