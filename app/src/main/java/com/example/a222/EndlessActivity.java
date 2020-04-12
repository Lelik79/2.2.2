package com.example.a222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class EndlessActivity extends AppCompatActivity {

    private TextView url;
    private Button buttonBa;
    private Button buttonFw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endless);

        init();

        url.setText("Http://myfile.org/" + Integer.toString(new Random().nextInt(100) + 1));

        buttonBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        buttonFw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EndlessActivity.this, EndlessActivity.class);
                startActivity(intent);

            }
        });
    }

    private void init() {
        url = findViewById(R.id.textUrl);
        buttonBa = findViewById(R.id.buttonBack);
        buttonFw = findViewById(R.id.buttonForward);
    }
}