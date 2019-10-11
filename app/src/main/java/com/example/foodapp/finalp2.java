package com.example.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class finalp2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalp2);
        spinner=(Spinner)findViewById(R.id.spin);
        if(spinner!=null){
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.my,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            String item=adapterView.getItemAtPosition(i).toString();
            switch (i){
                case 0:
                    item=adapterView.getItemAtPosition(0).toString();
                    Toast.makeText(this,item,Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    item=adapterView.getItemAtPosition(1).toString();
                    Toast.makeText(this,item,Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    item=adapterView.getItemAtPosition(2).toString();
                    Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
