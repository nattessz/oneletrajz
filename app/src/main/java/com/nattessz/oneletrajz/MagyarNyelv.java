package com.nattessz.oneletrajz;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MagyarNyelv extends MainActivity implements NavigationView.OnNavigationItemSelectedListener{

    ListView listView;
    private DrawerLayout magyarDrawer;
    private ActionBarDrawerToggle magyarTog;
    private TextView focim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.magyarnyelv);

        Toast.makeText(this, "Válassz egy menüpontot!", Toast.LENGTH_LONG).show();
        focim = findViewById(R.id.focimmagy);
        magyarDrawer = findViewById(R.id.magyardraw);
        FrameLayout frameLayout = findViewById(R.id.magycontent);
        magyarTog = new ActionBarDrawerToggle(this,magyarDrawer,R.string.nyit,R.string.zar);
        magyarDrawer.addDrawerListener(magyarTog);
        magyarTog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = findViewById(R.id.design_navigation_view2);
        navigationView.setNavigationItemSelectedListener(this);

        focim.setText("Személyes adataim:");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.magycontent, new FragmentAdataim());
        ft.commit();

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // menu gomb vezérlés
        int id = item.getItemId();

        if (id == R.id.szemelyes) {
            focim.setText("Személyes adataim:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentAdataim());
            ft.commit();
        }
        else if (id == R.id.munka) {
            focim.setText("Munkahelyeim:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentMunka());
            ft.commit();
        } else if (id == R.id.tanulmany) {
            focim.setText("Tanulmányaim:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentTanul());
            ft.commit();
        }
        else if (id == R.id.nyelv) {
            focim.setText("Nyelvismeret:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentNyelv());
            ft.commit();
        }
        else if (id == R.id.szakma) {
            focim.setText("Szakmai cél:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentSzakma());
            ft.commit();
        }
        else if (id == R.id.ismeret) {
            focim.setText("Tapasztalat, jártasság:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentTapaszt());
            ft.commit();
        }
        else if (id == R.id.tulahdonsag) {
            focim.setText("Személyes tulajdonságaim:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentSzemely());
            ft.commit();
        }

        DrawerLayout drawer = findViewById(R.id.magyardraw);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (magyarTog.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void vibrate(){
        //MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.nukeflash);
        //mp.start();
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(600, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            v.vibrate(600);
        }

    }

}
