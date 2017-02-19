package com.example.g00nie.capstonecottonimages;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class OrderViewerActivity extends AppCompatActivity {

    CardView myCard;
    RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_viewer);

        myCard = (CardView)findViewById(R.id.card_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        //LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);

        rv.setHasFixedSize(true);
        myCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderViewerActivity.this, ApprovalActivity.class);
                startActivity(intent);
            }
        });
    }
    
}

