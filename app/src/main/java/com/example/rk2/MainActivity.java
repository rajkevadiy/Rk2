package com.example.rk2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    RadioButton radio,rad;
    EditText no1,no2;
    RadioButton add,sub,mul,div;
    CheckBox male,female;
    TextView sum;
    int ak,rk,kk,rr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     no1=findViewById(R.id.no1);
     no2=findViewById(R.id.no2);
     add=findViewById(R.id.add);
     sub=findViewById(R.id.sub);
     mul=findViewById(R.id.mul);
     div=findViewById(R.id.div);
     male=findViewById(R.id.male);
     female=findViewById(R.id.female);
     sum=findViewById(R.id.sum);

     add.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             if (isChecked){

                 ak=Integer.parseInt(no1.getText().toString())+Integer.parseInt(no2.getText().toString());

                 sum.setText(""+ak);

             }
         }

     });

        sub.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){

                    rk=Integer.parseInt(no1.getText().toString())-Integer.parseInt(no2.getText().toString());

                    sum.setText(""+rk);


                }
            }
        });


        mul.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){

                    kk=Integer.parseInt(no1.getText().toString())*Integer.parseInt(no2.getText().toString());

                    sum.setText(""+kk);


                }
            }
        });

        div.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){

                    ak=Integer.parseInt(no1.getText().toString())/Integer.parseInt(no2.getText().toString());

                    sum.setText(""+ak);


                }
            }

        });

        male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){


                    sum.setText(""+no1.getText().toString());

                }
            }

        });

        female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){


                    sum.setText(""+no2.getText().toString());



                }
            }

        });
    }
}
