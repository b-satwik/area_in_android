package com.example.square;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_result);

        TextView tvResult = findViewById(R.id.tvResult);
        Button btnBack = findViewById(R.id.btnBack);

        double resultValue = getIntent().getDoubleExtra("VALUE", 0.0);
        String shapeName = getIntent().getStringExtra("SHAPE");

        tvResult.setText("The Area of the " + shapeName + " is:\n" + resultValue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}