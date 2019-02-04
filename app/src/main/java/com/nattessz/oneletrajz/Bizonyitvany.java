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

        flipper = (ViewFlipper)findViewById(R.id.viewflipp);
        //images = (ImageView)findViewById(R.id.images);
        next = (ImageButton)findViewById(R.id.next);
        pervius = (ImageButton)findViewById(R.id.pervius);

        next.setOnClickListener((View.OnClickListener) this);
        pervius.setOnClickListener((View.OnClickListener) this);
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
