package com.nattessz.oneletrajz;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Animation animMoveUp;
    private ImageButton magyargomb;
    private Button button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button5;
    private Animation animMoveRight;
    private Animation animMoveLeft;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        magyargomb = findViewById(R.id.magygomb);
        button5 = findViewById(R.id.button5);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        text5 = findViewById(R.id.textView5);
        animMoveUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);
        animMoveRight = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_down);
        animMoveLeft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        text1.startAnimation(animMoveRight);
        text2.startAnimation(animMoveLeft);
        text3.startAnimation(animMoveRight);
        text4.startAnimation(animMoveLeft);
        text5.startAnimation(animMoveRight);
        magyargomb.startAnimation(animMoveLeft);
        button2.startAnimation(animMoveRight);
        button3.startAnimation(animMoveLeft);
        button5.startAnimation(animMoveRight);

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

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+36304859485";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
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
