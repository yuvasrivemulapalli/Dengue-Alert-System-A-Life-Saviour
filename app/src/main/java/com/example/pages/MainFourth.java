
package com.example.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainFourth extends AppCompatActivity {
    private Button mButton;
    private EditText ed;
    //TextView tv;
    DatabaseReference ref,ref1;
    FirebaseDatabase db;
    private TextView tv1;
    Location location,locationcur;
    int cvij=0,chyd=0,cche=0,cban=0;

    //Cv cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_main);
        mButton = findViewById(R.id.button3);
        ed = findViewById(R.id.editText);
        db=FirebaseDatabase.getInstance();
        ref=db.getReference("Location");
        locationcur=new Location();

        //cv=new Location();
        //final String phoneNumber1="9398336795";
        ref= FirebaseDatabase.getInstance().getReference().child("Location");
        ref1=FirebaseDatabase.getInstance().getReference();
        tv1=(TextView)findViewById(R.id.textView25);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*
                locationcur.setLocation(ed.getText().toString().trim());
                if((ed.getText().toString().trim()).equals("vijayawada")){
                    // int cnt1=ref1.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").getValue().toString();
                    ref1.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());

                            cvij=intVal+1;
                            ref1.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").setValue(cvij);
                            tv1.setText(String.valueOf(cvij));
                        }


                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });}
                else if((ed.getText().toString().trim()).equals("hyderabad")){
                    ref1.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                            Toast.makeText(MainFourth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            chyd=intVal+1;
                            ref1.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").setValue(chyd);
                            tv1.setText(String.valueOf(chyd));


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });
                }
                else if((ed.getText().toString().trim()).equals("chennai")){
                    ref1.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                            Toast.makeText(MainFourth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            cche=intVal+1;
                            ref1.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").setValue(cche);
                            tv1.setText(String.valueOf(cche));


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });
                }
                else if((ed.getText().toString().trim()).equals("bangalore")){
                    ref1.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            int intVal = Integer.valueOf(dataSnapshot.getValue().toString());
                            Toast.makeText(MainFourth.this, String.valueOf(intVal), Toast.LENGTH_SHORT).show();
                            cban=intVal+1;
                            ref1.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").setValue(cban);
                            tv1.setText(String.valueOf(cban));


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }

                    });
                }
*/
                //ref.push().setValue(location);
               // Toast.makeText(MainFourth.this,"Inserted location",Toast.LENGTH_LONG).show();
                //  ref.child(String.valueOf(c+1)).setValue(location);
              /*  if((ed.getText().toString().trim()).equals("vijayawada"))
                {startActivity(new Intent(MainFourth.this, com.example.pages.Main4Activity.class));}
                //startActivity(new Intent(MainFourth.this, com.example.pages.MainNineth.class));*/
                if(((ed.getText().toString().trim()).equals("vijayawada"))||((ed.getText().toString().trim()).equals("VIJAYAWADA"))||((ed.getText().toString().trim()).equals("Vijayawada")))
                {startActivity(new Intent(MainFourth.this, com.example.pages.Main4Activity.class));}
                else if(((ed.getText().toString().trim()).equals("hyderabad"))||((ed.getText().toString().trim()).equals("HYDERABAD"))||((ed.getText().toString().trim()).equals("Hyderabad")))
                {startActivity(new Intent(MainFourth.this, com.example.pages.Main3Activity.class));}
                else if(((ed.getText().toString().trim()).equals("chennai"))||((ed.getText().toString().trim()).equals("CHENNAI"))||((ed.getText().toString().trim()).equals("Chennai")))
                {startActivity(new Intent(MainFourth.this, com.example.pages.Main2Activity.class));}
                else if(((ed.getText().toString().trim()).equals("bangalore"))||((ed.getText().toString().trim()).equals("BANGALORE"))||((ed.getText().toString().trim()).equals("Bangalore")))
                {startActivity(new Intent(MainFourth.this, com.example.pages.MainActivity.class));}
            }
        });
        Toast.makeText(MainFourth.this,"Firebase Connection Success",Toast.LENGTH_LONG).show();
    }
}




/*
package com.example.pages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;



import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;


import java.util.Map;

public class MainFourth extends AppCompatActivity {
    private Button mButton;
    private EditText ed;
    DatabaseReference ref,ref1;
    FirebaseDatabase db;
    private TextView tv;
    Location location;
   // long c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_main);
        mButton = findViewById(R.id.button3);
        ed = findViewById(R.id.editText);
        db=FirebaseDatabase.getInstance();
        ref=db.getReference("Location");
        location=new Location();
        ref= FirebaseDatabase.getInstance().getReference().child("Location");
        tv=(TextView)findViewById(R.id.textView24);
        ref1= FirebaseDatabase.getInstance().getReference().child("Location");
        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int n=0;
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    Map<String,Object> map=(Map<String,Object>)ds.getValue();
                    Object location=map.get("location");
                    int pval=Integer.parseInt(String.valueOf("location"));
                    n+=pval;
                    tv.setText(String.valueOf(n));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    c=(dataSnapshot.getChildrenCount());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        startActivity(new Intent(MainFourth.this, com.example.pages.MainFifth.class));
        location.setLocation(ed.getText().toString().trim());
        ref.push().setValue(location);
        Toast.makeText(MainFourth.this,"Inserted location",Toast.LENGTH_LONG).show();
        //  ref.child(String.valueOf(c+1)).setValue(location);
        }
        });
        Toast.makeText(MainFourth.this,"Firebase Connection Success",Toast.LENGTH_LONG).show();
        }
        }

*/

























/*
package com.example.pages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;



import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;


import java.util.Map;

public class MainFourth extends AppCompatActivity {
    private Button mButton;
    private EditText ed;
    //TextView tv;
    DatabaseReference ref,ref1;
    FirebaseDatabase db;
    private TextView tv1;
    Location location;
    Cv cv;
    int i=0;
    private int cvij=0,chyd=0,cche=0,cban=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_main);
        mButton = findViewById(R.id.button3);
        ed = findViewById(R.id.editText);
       db=FirebaseDatabase.getInstance();
        ref=db.getReference("Location");
        location=new Location();
        cv=new Cv();
        ref1= FirebaseDatabase.getInstance().getReference();
        //ref1=FirebaseDatabase.getInstance().getReference().child("Cv");
        //tv=(TextView)findViewById(R.id.textView24);
        tv1=(TextView)findViewById(R.id.textView25);
     //   ref1= FirebaseDatabase.getInstance().getReference().child("Location");
       // ref1.addValueEventListener(new ValueEventListener() {





        //DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child("courses").child("Business");


        //tv.setText(dt);




        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFourth.this, com.example.pages.MainFifth.class));
                    location.setLocation(ed.getText().toString().trim());

                    //ref.child("location").setValue(location);

                    if ((ed.getText().toString().trim()).equals("vijayawada")) {
                        //ref.child("location").setValue(location);
                        cvij=cvij+1;
                        cv.setCv(cvij);
                        ref1.child("Location").child("-M1RTs1--9yMd23Nw-mc").child("cv").setValue(cvij);
                        //ref.push().setValue(cvij);
                        tv1.setText(String.valueOf(cvij));
                        //ref.push().setValue(cv);
                    } else if ((ed.getText().toString().trim()).equals("hyderabad")) {
                       // ref.child("location").setValue(location);
                        chyd += 1;
                        cv.setCv(chyd);
                        ref1.child("Location").child("-M1R_vV-8POKfNGKvzV2").child("cv").setValue(chyd);
                        //ref.child("cv").setValue(chyd);
                        tv1.setText(String.valueOf(chyd));
                        //ref.push().setValue(cv);
                    } else if ((ed.getText().toString().trim()).equals("chennai")) {
                       // ref.child("location").setValue(location);
                        cche += 1;
                        cv.setCv(cche);
                        ref1.child("Location").child("-M1RX_Wz9_FsplEmyD_z").child("cv").setValue(cche);
                        //ref.child("cv").setValue(cche);
                        tv1.setText(String.valueOf(cche));
                        //ref.push().setValue(cv);
                    } else if ((ed.getText().toString().trim()).equals("bangalore")) {
                       // ref.child("location").setValue(location);
                        cban += 1;
                        cv.setCv(cban);
                        ref1.child("Location").child("-M1Ra-JpGCdKAaRdA4ua").child("cv").setValue(cban);
                       // ref.child("cv").setValue(cban);
                        tv1.setText(String.valueOf(cban));
                        //ref.push().setValue(cv);

                }


                //ref.push().setValue(location);
                Toast.makeText(MainFourth.this,"Inserted location",Toast.LENGTH_LONG).show();
          //  ref.child(String.valueOf(c+1)).setValue(location);
            }
        });

        Toast.makeText(MainFourth.this,"Firebase Connection Success",Toast.LENGTH_LONG).show();
    }
}

*/


/*
package com.example.pages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;



import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;


import java.util.Map;

public class MainFourth extends AppCompatActivity {
    private Button mButton;
    private EditText ed;
    DatabaseReference ref,ref1;
    FirebaseDatabase db;
    private TextView tv;
    Location location;
   // long c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_main);
        mButton = findViewById(R.id.button3);
        ed = findViewById(R.id.editText);
        db=FirebaseDatabase.getInstance();
        ref=db.getReference("Location");
        location=new Location();
        ref= FirebaseDatabase.getInstance().getReference().child("Location");
        tv=(TextView)findViewById(R.id.textView24);
        ref1= FirebaseDatabase.getInstance().getReference().child("Location");
        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int n=0;
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    Map<String,Object> map=(Map<String,Object>)ds.getValue();
                    Object location=map.get("location");
                    int pval=Integer.parseInt(String.valueOf("location"));
                    n+=pval;
                    tv.setText(String.valueOf(n));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    c=(dataSnapshot.getChildrenCount());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        startActivity(new Intent(MainFourth.this, com.example.pages.MainFifth.class));
        location.setLocation(ed.getText().toString().trim());
        ref.push().setValue(location);
        Toast.makeText(MainFourth.this,"Inserted location",Toast.LENGTH_LONG).show();
        //  ref.child(String.valueOf(c+1)).setValue(location);
        }
        });
        Toast.makeText(MainFourth.this,"Firebase Connection Success",Toast.LENGTH_LONG).show();
        }
        }

*/