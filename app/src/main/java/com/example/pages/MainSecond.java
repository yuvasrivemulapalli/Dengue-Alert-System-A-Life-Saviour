package com.example.pages;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainSecond extends AppCompatActivity {
    private Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button4);
        b3 = findViewById(R.id.button5);
        // while(mButton==null) {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainSecond.this, com.example.pages.Main6Activity.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainSecond.this, com.example.pages.MainThird.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainSecond.this, com.example.pages.Main7Activity.class));
            }
        });
    }

}



