package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    TextView selection;
    String [] items = {"D3", "S1", "S2", "S3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        selection = (TextView) findViewById(R.id.selection);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,items);
    aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(aa);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
        selection.setText(items[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView){
        selection.setText("");
    }
}