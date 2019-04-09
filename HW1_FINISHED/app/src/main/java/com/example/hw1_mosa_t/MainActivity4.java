package com.example.hw1_mosa_t;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    private ImageButton heart,rheart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        heart = (ImageButton)findViewById(R.id.imageButton);
        rheart = (ImageButton)findViewById(R.id.imageButton2);

        heart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                heart.setVisibility(View.INVISIBLE);
                rheart.setVisibility(View.VISIBLE);
            }
        });
        rheart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                rheart.setVisibility(View.INVISIBLE);
                heart.setVisibility(View.VISIBLE);
    }
});
    }
}