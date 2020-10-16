/*
package com.example.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainNineth extends AppCompatActivity {
FirebaseDatabase db;
DatabaseReference ref,ref1,ref2,ref3;
TextView vij1,hyd1,che1,ban1;
private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nineth_main);
        vij1 = (TextView) findViewById(R.id.vij);
        hyd1 = (TextView) findViewById(R.id.hyd);
        che1 = (TextView) findViewById(R.id.che);
        ban1 = (TextView) findViewById(R.id.ban);
        db = FirebaseDatabase.getInstance();
        ref = db.getReference("Location");
        ref = FirebaseDatabase.getInstance().getReference();
        mButton = findViewById(R.id.button7);


        ref.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                vij1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        ref.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                che1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        ref.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                hyd1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        ref.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                ban1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
       mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainNineth.this, com.example.pages.Scrolling2Activity.class));

            }
        });
    }
}
*/

  package com.example.pages;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

public class MainNineth extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference ref,ref1,ref2,ref3;
    TextView vij1,hyd1,che1,ban1;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nineth_main);
        vij1 = (TextView) findViewById(R.id.vij);
        hyd1 = (TextView) findViewById(R.id.hyd);
        che1 = (TextView) findViewById(R.id.che);
        ban1 = (TextView) findViewById(R.id.ban);
        db = FirebaseDatabase.getInstance();
        ref = db.getReference("Location");
        ref = FirebaseDatabase.getInstance().getReference();
        mButton = findViewById(R.id.button7);


        ref.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                // Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                vij1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        ref.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                //  Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                che1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        ref.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                // Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                hyd1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        ref.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                //Toast.makeText(MainNineth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                ban1.setText(String.valueOf(intVal));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainNineth.this, com.example.pages.PrecautionsActivity.class));

            }
        });
    }
}
