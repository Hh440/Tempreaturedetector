package com.company.temperaturesetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n_chirps;
    Button calc;
    TextView display;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n_chirps=findViewById(R.id.inpch);
        calc=findViewById(R.id.btcalc);
        result=findViewById(R.id.tempres);
        display=findViewById(R.id.view);
        display.setVisibility(View.VISIBLE);
        result.setVisibility(View.GONE);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n_chirps.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter all fiels",Toast.LENGTH_LONG).show();
                }
                else {
                    String chirps = n_chirps.getText().toString();
                    int No_chirps = Integer.parseInt(chirps);
                    float calculation = (float) ((No_chirps / 3.0) + 4);
                    result.setText(getString(R.string.approx) + calculation + getString(R.string.degree));
                    result.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}