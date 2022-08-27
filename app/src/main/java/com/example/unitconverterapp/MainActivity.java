package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Unit Converter");

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"Click is Listening",Toast.LENGTH_SHORT).show();
//                String s = editTextTextPersonName.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView.setText(String.format("The corressponding value in Pound is %s", pound));
//
//            }
//        });
    }
        public void calculate(View view){
                String s = editTextTextPersonName.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText(String.format("The corressponding value in Pound is %s", pound));
        }


}