package com.example.g00nie.capstonecottonimages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity {

    CardView myCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        myCard = (CardView)findViewById(R.id.card_view);

        myCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreenActivity.this, ApprovalActivity.class);
                startActivity(intent);
            }
        });
    }
}
