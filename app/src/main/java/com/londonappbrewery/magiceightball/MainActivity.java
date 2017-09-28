package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_roll;
        btn_roll = (Button) findViewById(R.id.btn_roll);

       final ImageView ball_for_you;
        ball_for_you = (ImageView) findViewById(R.id.ball_for_you);

        final int [] ball={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random randomNumberGenerator = new Random();
                int number=randomNumberGenerator.nextInt(5);

                ball_for_you.setImageResource(ball[number]);
                Log.d("dd","press ko na!!"+number);

            }
        });

    }
}
