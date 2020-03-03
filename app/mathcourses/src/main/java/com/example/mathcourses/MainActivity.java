package com.example.mathcourses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linButton = (Button) findViewById(R.id.button1);
        Button aButton = (Button)findViewById(R.id.button2);
        Button anButton = (Button) findViewById(R.id.button3);
        Button fButton = (Button) findViewById(R.id.button4);
        Button pButton = (Button)findViewById(R.id.button5);
        Button sButton = (Button)findViewById(R.id.button6);
        Button dButton = (Button) findViewById(R.id.button7);

        linButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),linChapters.class);
                startActivity(startIntent);
            }
        });

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),an1Chapters.class);
                startActivity(startIntent);
            }
        });

        anButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),an2Chapters.class);
                startActivity(startIntent);
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),flerChapter.class);
                startActivity(startIntent);
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),probChapters.class);
                startActivity(startIntent);
            }
        });

        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),statChapters.class);
                startActivity(startIntent);
            }
        });

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(),diskChapters.class);
                startActivity(startIntent);
            }
        });
    }
}
