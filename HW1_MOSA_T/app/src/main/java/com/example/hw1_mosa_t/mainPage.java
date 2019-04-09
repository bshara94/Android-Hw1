package com.example.hw1_mosa_t;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mainPage extends Activity {
    Button button1,button2,button3,button4,button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.layout);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.Prof1);
        button2 = (Button) findViewById(R.id.Prof2);
        button3 = (Button) findViewById(R.id.Prof3);
        button4 = (Button) findViewById(R.id.Prof4);
        button5 = (Button) findViewById(R.id.Prof5);

        // Capture button clicks
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(mainPage.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(mainPage.this,MainActivity2.class);
                startActivity(myIntent);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(mainPage.this,MainActivity3.class);
                startActivity(myIntent);
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(mainPage.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(mainPage.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
    }


}
