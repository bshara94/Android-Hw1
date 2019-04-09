package com.example.hw1_mosa_t;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {
    private ImageButton like,like2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        like = (ImageButton)findViewById(R.id.imageButton);
        like2 = (ImageButton)findViewById(R.id.imageButton2);

        like.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
                like.setVisibility(View.INVISIBLE);
                like2.setVisibility(View.VISIBLE);
            }
        });
        like2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                like2.setVisibility(View.INVISIBLE);
                like.setVisibility(View.VISIBLE);
            }
        });
    }
}
