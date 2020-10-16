package com.example.pages;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main33Activity extends AppCompatActivity {
private Button b;
TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);
        tv1=(TextView)findViewById(R.id.textView4);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv2=(TextView)findViewById(R.id.textView7);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        b = (Button)findViewById(R.id.button9);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main33Activity.this,com.example.pages.PrecautionsActivity.class));
            }
        });

    }
}
