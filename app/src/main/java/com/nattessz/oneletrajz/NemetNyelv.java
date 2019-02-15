package com.nattessz.oneletrajz;

import android.app.Fragment;
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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class NemetNyelv<nemetTog> extends MainActivity implements NavigationView.OnNavigationItemSelectedListener {

    ListView listView;
    private DrawerLayout nemetDrawer;
    private ActionBarDrawerToggle nemetTog;
    private boolean isDrawerFixed;
    private TextView focim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.nemtnyelv);


        Toast.makeText(this, "Wählen Sie einen Menüpunkt!", Toast.LENGTH_LONG).show();
        focim = findViewById(R.id.focim);
        nemetDrawer = findViewById(R.id.nemetdraw);
        FrameLayout frameLayout = findViewById(R.id.flContent);
        nemetTog = new ActionBarDrawerToggle(this,nemetDrawer,R.string.nyit,R.string.zar);
        nemetDrawer.addDrawerListener(nemetTog);
        nemetTog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = findViewById(R.id.design_navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        focim.setText("Persönliche Angaben:");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flContent, new FragmentOne());
        ft.commit();

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // menu gomb vezérlés
        int id = item.getItemId();

        if (id == R.id.person) {
            focim.setText("Persönliche Angaben:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentOne());
            ft.commit();
        } else if (id == R.id.beruf) {
            focim.setText("Berufliche Erfahrungen:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentBeruf());
            ft.commit();
        }
        else if (id == R.id.ausbild) {
            focim.setText("Ausbildung:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentAusbild());
            ft.commit();
        }
        else if (id == R.id.motiv) {
            focim.setText("Motivation");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentMotiv());
            ft.commit();
        }
        else if (id == R.id.kentnis) {
            focim.setText("Kenntnisse:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentKentnis());
            ft.commit();
        }
        else if (id == R.id.faigket) {
            focim.setText("Fähigkeiten, Fertigkeiten:");
            vibrate();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentFahig());
            ft.commit();
        }

        DrawerLayout drawer = findViewById(R.id.nemetdraw);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (nemetTog.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

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
