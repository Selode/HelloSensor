package com.example.selode.hellosensor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button compassButton;
    private Button accelButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compassButton = (Button) findViewById(R.id.compassButton);
        compassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompass(v);
            }
        });
        accelButton = (Button) findViewById(R.id.sensorButton);
        accelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccel(v);
            }
        });
    }

    public void openCompass(View view){
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);

    }

    public void openAccel(View view){
        Intent intent = new Intent(this, Acc.class);
        startActivity(intent);
    }
}
