package com.nattessz.oneletrajz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Animation animMoveUp;
    private ImageButton magyargomb;
    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        magyargomb =(ImageButton) findViewById(R.id.magygomb);
        //button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        animMoveUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);
        magyargomb.startAnimation(animMoveUp);
        //button1.startAnimation(animMoveUp);
        button2.startAnimation(animMoveUp);
        button3.startAnimation(animMoveUp);


        magyargomb.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
               openMagyar();
           }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNemet();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBiz();
            }
        });

    }

    private void openMagyar() {
        Intent intent= new Intent(this,MagyarNyelv.class);
        startActivity(intent);
    }

    private void openNemet() {
        Intent intent= new Intent(this,NemetNyelv.class);
        startActivity(intent);
    }

    private void openBiz() {
        Intent intent= new Intent(this,Bizonyitvany.class);
        startActivity(intent);
    }
}
