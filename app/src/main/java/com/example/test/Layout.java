package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        Button button = findViewById(R.id.button3);
        final boolean[] variable = {false};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (variable[0] == false) {
                    button.setText("Unfollow");
                    variable[0] = true;
                }
                else if (variable[0] == true){
                    button.setText("Follow");
                    variable[0] = false;
                }
            }
        });
    }
}