package com.example.a222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubscribeActivity extends AppCompatActivity {

    private TextView na;
    private TextView em;
    private TextView textView;
    private Button buttonOk;
    private Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        init();

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Подписка на рассылку успешно оформлена для пользователя " + na.getText() + " на электронный адрес: " + em.getText());
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                em.setText("");
                na.setText("");
                textView.setText("");
            }
        });
    }

    private void init() {
        na = findViewById(R.id.editName);
        em = findViewById(R.id.editEmail);
        buttonOk = findViewById(R.id.buttonOk);
        buttonClear = findViewById(R.id.buttonClear);
        textView = findViewById(R.id.textMessage);
    }
}