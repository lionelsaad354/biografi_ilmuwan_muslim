package com.republikgaming.mengenalilmuwanmuslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {
    private TextView getRating;
    private Button Submit;
    private AppCompatRatingBar RatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        getRating = findViewById(R.id.rate);
        Submit = findViewById(R.id.submit);
        RatingBar = findViewById(R.id.penilaian);
    }

    @Override
    protected void onStart() {
        super.onStart();
        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(android.widget.RatingBar ratingBar, float nilai, boolean b) {

                getRating.setText("Rating: " + nilai);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Rate App Is: " + RatingBar.getRating(), Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
