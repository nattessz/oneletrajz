package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class Bizonyitvany extends MainActivity implements View.OnClickListener{

    private ImageView images;
    private ImageButton next;
    private ImageButton pervius;
    private ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bizonyitvany);

        flipper = findViewById(R.id.viewflipp);
        //images = (ImageView)findViewById(R.id.images);
        next = findViewById(R.id.next);
        pervius = findViewById(R.id.pervius);

        next.setOnClickListener(this);
        pervius.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(v==next){
            flipper.showNext();
        }
        else if (v==pervius){
            flipper.showPrevious();
        }

    }
}
