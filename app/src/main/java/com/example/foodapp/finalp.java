package com.example.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import static android.widget.ArrayAdapter.*;

public class finalp extends AppCompatActivity implements View.OnClickListener, OnItemSelectedListener {
RadioGroup g1;
RadioButton b1;
Button submitc,submitb,submiti;
private Switch switch1;
Spinner spinner;
EditText input;
private CheckBox check1,check2,check3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalp);
        check1=(CheckBox)findViewById(R.id.dog);
        check2=(CheckBox)findViewById(R.id.cat);
        check3=(CheckBox)findViewById(R.id.cow);
        submitc=(Button)findViewById(R.id.submitc);
        submitc.setOnClickListener(this);
        check1.setOnClickListener(this);
        input=(EditText)findViewById(R.id.input);
        submiti=(Button)findViewById(R.id.submiti);
        addcb();
        onClickListnerButton();
        switchm();
        spinner=(Spinner)findViewById(R.id.spinner);
        if(spinner!=null){
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence>adapter= createFromResource(this,R.array.labels_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }



    public void switchm(){
        switch1=(Switch)findViewById(R.id.switch1);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch1.isChecked()){
                    Toast.makeText(finalp.this,"on",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
  public void onClickListnerButton(){
        g1=(RadioGroup)findViewById(R.id.rg);
        submitb=(Button)findViewById(R.id.rb);
        submitb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int selected=g1.getCheckedRadioButtonId();
              b1=(RadioButton)findViewById(selected);
              Toast.makeText(finalp.this,b1.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });

  }



public void addcb(){
       check1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(check1.isChecked()){
                   Toast.makeText(finalp.this,"dog",Toast.LENGTH_LONG).show();
               }
           }
       });
}


   @Override
    public void onClick(View view) { StringBuffer result=new StringBuffer();
        result.append("Dog :").append(check1.isChecked());
        result.append("\ncat :").append(check2.isChecked());
        result.append("\ncow :").append(check3.isChecked());

        Toast.makeText(finalp.this,result.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinner_item=adapterView.getItemAtPosition(i).toString();
        switch (i){

            case 0:
                 spinner_item=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(this,spinner_item,Toast.LENGTH_SHORT).show();
                break;
            case 2:
                 spinner_item=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(this,spinner_item,Toast.LENGTH_SHORT).show();
                break;
            case 3:
                 spinner_item=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(this,spinner_item,Toast.LENGTH_SHORT).show();
                break;
            case 4:
                 spinner_item=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(this,spinner_item,Toast.LENGTH_SHORT).show();
                break;
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void inputs(View view) {
        String inp=input.getText().toString();
        Toast.makeText(this,inp,Toast.LENGTH_SHORT).show();
    }
}
