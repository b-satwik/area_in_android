package com.example.square;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SquareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_square);

        final EditText etSide = findViewById(R.id.etSide);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etSide.getText().toString();
                if (!input.isEmpty()) {
                    double side = Double.parseDouble(input);
                    double area = side * side;

                    // Carry values to ResultActivity
                    Intent intent = new Intent(SquareActivity.this, ResultActivity.class);
                    intent.putExtra("VALUE", area);
                    intent.putExtra("SHAPE", "Square");
                    startActivity(intent);
                } else {
                    Toast.makeText(SquareActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}