package com.example.pages;

        import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main6Activity extends AppCompatActivity {
    private Button mButton;
    private EditText ed,ed1;
    //TextView tv;
    DatabaseReference ref,ref1;
    FirebaseDatabase db;
    private TextView tv1;
    Location location;
    String txtMessage="Dengue Alert!";
    int cvij=0,chyd=0,cche=0,cban=0;

    //Cv cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mButton = findViewById(R.id.button3);
        ed = findViewById(R.id.editText);
        ed1=findViewById(R.id.editText2);
        db=FirebaseDatabase.getInstance();
        ref=db.getReference("Location");
        location=new Location();
        ref= FirebaseDatabase.getInstance().getReference().child("Location");
        ref1=FirebaseDatabase.getInstance().getReference();
        tv1=(TextView)findViewById(R.id.textView25);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                location.setLocation(ed.getText().toString().trim());
                if(((ed.getText().toString().trim()).equals("vijayawada"))||((ed.getText().toString().trim()).equals("VIJAYAWADA"))||((ed.getText().toString().trim()).equals("Vijayawada"))){
                    ref1.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());

                            //  Toast.makeText(MainFourth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            cvij=intVal+1;
                            ref1.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").setValue(cvij);
                           // tv1.setText(String.valueOf(cvij));


                        }


                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });}
                else if(((ed.getText().toString().trim()).equals("hyderabad"))||((ed.getText().toString().trim()).equals("HYDERABAD"))||((ed.getText().toString().trim()).equals("Hyderabad"))){
                    ref1.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                           // Toast.makeText(Main6Activity.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            chyd=intVal+1;
                            ref1.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").setValue(chyd);
                          //  tv1.setText(String.valueOf(chyd));

                             }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });
                }
                else if(((ed.getText().toString().trim()).equals("chennai"))||((ed.getText().toString().trim()).equals("CHENNAI"))||((ed.getText().toString().trim()).equals("Chennai"))){
                    ref1.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                           // Toast.makeText(Main6Activity.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            cche=intVal+1;
                            ref1.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").setValue(cche);
                            //tv1.setText(String.valueOf(cche));


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });
                }
                else if(((ed.getText().toString().trim()).equals("bangalore"))||((ed.getText().toString().trim()).equals("BANGALORE"))||((ed.getText().toString().trim()).equals("Bangalore"))){
                    ref1.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                            //Toast.makeText(Main6Activity.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            cban=intVal+1;
                            ref1.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").setValue(cban);
                          //  tv1.setText(String.valueOf(cban));

                              }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });
                }

                //ref.push().setValue(location);
                Toast.makeText(Main6Activity.this,"Location Stored",Toast.LENGTH_LONG).show();
                //  ref.child(String.valueOf(c+1)).setValue(location);

               /* if(((ed1.getText().toString().trim()).equals("vijayawada"))||((ed1.getText().toString().trim()).equals("VIJAYAWADA"))||((ed1.getText().toString().trim()).equals("Vijayawada")))
                {startActivity(new Intent(Main6Activity.this, com.example.pages.Main44Activity.class));}*/
                if(((ed1.getText().toString().trim()).equals("vijayawada"))||((ed1.getText().toString().trim()).equals("VIJAYAWADA"))||((ed1.getText().toString().trim()).equals("Vijayawada")))
                {startActivity(new Intent(Main6Activity.this, com.example.pages.Main44Activity.class));}
                else if(((ed1.getText().toString().trim()).equals("hyderabad"))||((ed1.getText().toString().trim()).equals("HYDERABAD"))||((ed1.getText().toString().trim()).equals("Hyderabad")))
                {startActivity(new Intent(Main6Activity.this, com.example.pages.Main33Activity.class));}
                else if(((ed1.getText().toString().trim()).equals("chennai"))||((ed1.getText().toString().trim()).equals("CHENNAI"))||((ed1.getText().toString().trim()).equals("Chennai")))
                {startActivity(new Intent(Main6Activity.this, com.example.pages.Main22Activity.class));}
                else if(((ed1.getText().toString().trim()).equals("bangalore"))||((ed.getText().toString().trim()).equals("BANGALORE"))||((ed.getText().toString().trim()).equals("Bangalore")))
                {startActivity(new Intent(Main6Activity.this, com.example.pages.Main1Activity.class));}
            }
        });
       // Toast.makeText(Main6Activity.this,"Firebase Connection Success",Toast.LENGTH_LONG).show();
    }
}


