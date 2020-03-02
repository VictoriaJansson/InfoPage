package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attempts to launch an activity within our own app
        Button secondActivityBtn = (Button)findViewById(R.id.secondActivity);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() { //A new view, means that if I press on the button a new view is showing
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),SecondActivity.class);  // What is the context of this option?
                startIntent.putExtra("org.mentorschool.quicklauncher", "Hello World");
                startActivity(startIntent);
            }
        });

        // Attempts to launch an activity outside our app
        Button googleBtn = (Button) findViewById(R.id.googleBut);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.yahoo.com";
                Uri webadress = Uri.parse(google);

                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webadress);
                if (gotogoogle.resolveActivity(getPackageManager()) !=null);
                startActivity(gotogoogle);
            }
        });
    }
}
