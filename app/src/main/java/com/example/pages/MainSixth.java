package com.example.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainSixth extends AppCompatActivity {
    private Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_main);
        b = findViewById(R.id.sixth);
        tv=(TextView)findViewById(R.id.textView44);
        tv.setText(getIntent().getStringExtra("mytext"));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainSixth.this,com.example.pages.MainFourth.class));
            }
        });

    }
}


