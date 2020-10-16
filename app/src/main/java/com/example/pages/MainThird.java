
package com.example.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainThird extends AppCompatActivity {
    private Button mButton1;
    int ct1,ct2,ct3,ct4,ct5,ct6;
CheckBox c1,c2,c3,c4,c5,c6;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_main);
        mButton1 = (Button) findViewById(R.id.button1);
        final CheckBox c1=(CheckBox)findViewById(R.id.checkBox3);
        final CheckBox c2=(CheckBox)findViewById(R.id.checkBox4);

        final CheckBox c3=(CheckBox)findViewById(R.id.checkBox5);

        final CheckBox c4=(CheckBox)findViewById(R.id.checkBox6);

        final CheckBox c5=(CheckBox)findViewById(R.id.checkBox7);

        final CheckBox c6=(CheckBox)findViewById(R.id.checkBox8);




        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c1.isChecked() ) {
                    ct1=1;
                    //Toast.makeText(MainThird.this, String.valueOf(ct1), Toast.LENGTH_SHORT).show();
                  //  Toast.makeText(getApplicationContext(), ct1, Toast.LENGTH_SHORT).show();
                }
                else{
                    ct1=0;
                }
                if (c2.isChecked() ) {
                    ct2= 1;
                }
                else{
                    ct2=0;
                }
                if (c3.isChecked() ) {
                    ct3= 1;
                }
                else{
                    ct3=0;
                }
                if (c4.isChecked() ) {
                    ct4= 1;
                }
                else{
                    ct4=0;
                }
                if (c5.isChecked() ) {
                    ct5= 1;
                }
                else{
                    ct5=0;
                }
                if (c6.isChecked() ) {
                    ct6= 1;
                }
                else{
                    ct6=0;
                }

                if(ct1==1 && ct2==1 && ct3==1 && ct4==0 &&ct5==0 &&ct6==0 ){
                    String text = "MEDIUM";

                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));

                }
                else if(ct1==1 && ct2==1 && ct3==1 && ct4==1 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==1 && ct3==1 && ct4==1 &&ct5==0 &&ct6==0 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==1 && ct3==0 && ct4==0 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==0 && ct2==0 && ct3==1 && ct4==1 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct5==1 && ct6==1 && ct4==0 &&ct2==0 &&ct3==0 ){
                    String text = "MEDIUM";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==1 && ct5==0 && ct6==0 && ct4==0 &&ct2==0 &&ct3==0 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct5==1 && ct6==0 && ct4==0 &&ct2==0 &&ct3==0 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct5==0 && ct6==1 && ct4==0 &&ct2==0 &&ct3==0 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct5==0 && ct6==0 && ct4==1 &&ct2==0 &&ct3==0 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct5==0 && ct6==0 && ct4==0 &&ct2==1 &&ct3==0 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct5==0 && ct6==0 && ct4==0 &&ct2==0 &&ct3==1 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct5==0 && ct6==0 && ct4==1 &&ct2==1 &&ct3==1 ){
                    String text = "MEDIUM";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSeventh.class));
                }
                else if(ct1==0 && ct2==0 && ct3==0 && ct4==0 && ct5==0 && ct6==0 ){
                    String text = "LOW";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                  //  startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==1 && ct3==1 && ct4==1 &&ct5==1 &&ct6==0 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                   // startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==1 && ct3==1 && ct4==1 &&ct5==0 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==1 && ct3==1 && ct4==0 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==1 && ct3==0 && ct4==1 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    //startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==1 && ct2==0 && ct3==1 && ct4==1 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                   // startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }
                else if(ct1==0 && ct2==1 && ct3==1 && ct4==1 &&ct5==1 &&ct6==1 ){
                    String text = "HIGH";
                    Intent myIntent = new Intent(view.getContext(),MainSixth.class);
                    myIntent.putExtra("mytext",text);
                    startActivity(myIntent);
                    // startActivity(new Intent(MainThird.this, com.example.pages.MainSixth.class));
                }



                // startActivity(new Intent(MainThird.this, com.example.pages.MainFourth.class));
                // startActivity(new Intent(this,Main2Activity.class));
            }
        });

    }


}



