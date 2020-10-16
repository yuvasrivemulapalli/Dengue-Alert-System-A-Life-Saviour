package com.example.pages;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView4);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv2=(TextView)findViewById(R.id.textView7);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        mButton = findViewById(R.id.button10);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.example.pages.Precautions2.class));

            }
        });
    }
}
