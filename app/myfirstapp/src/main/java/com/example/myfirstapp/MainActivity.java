package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNamEditTeext = (EditText) findViewById(R.id.firstNamEditText);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 =  Integer.parseInt(firstNamEditTeext.getText().toString());
                int num2 = Integer.parseInt((SecondNumEditText.getText().toString()));
                int result = num1 + num2;
                resultTextView.setText(result + "");

            }
        });
    }
}
