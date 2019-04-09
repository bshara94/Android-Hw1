package com.example.hw1_mosa_t;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView likeSum;
    Button like;
    int _likeSum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        likeSum = findViewById(R.id.Sum);
        like = findViewById(R.id.LikeButton);
        like.setOnClickListener(new View.OnClickListener(){public void onClick(View v){likeSum.setText(++_likeSum + "");
        }
        });
    }
}
