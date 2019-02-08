package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


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

        focim = (TextView)findViewById(R.id.focim);
        nemetDrawer = (DrawerLayout)findViewById(R.id.nemetdraw);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.flContent);
        isDrawerFixed = getResources().getBoolean(R.bool.isDrawerFixed);
        nemetTog = new ActionBarDrawerToggle(this,nemetDrawer,R.string.nyit,R.string.zar);
        nemetDrawer.addDrawerListener(nemetTog);
        nemetTog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView navigationView = (NavigationView) findViewById(R.id.design_navigation_view);
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
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentOne());
            ft.commit();
        } else if (id == R.id.beruf) {
            focim.setText("Berufliche Erfahrungen:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentBeruf());
            ft.commit();
        }
        else if (id == R.id.ausbild) {
            focim.setText("Ausbildung:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentAusbild());
            ft.commit();
        }
        else if (id == R.id.motiv) {
            focim.setText("Motivation");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentMotiv());
            ft.commit();
        }
        else if (id == R.id.kentnis) {
            focim.setText("Kenntnisse:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentKentnis());
            ft.commit();
        }
        else if (id == R.id.faigket) {
            focim.setText("Fähigkeiten, Fertigkeiten:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContent, new FragmentFahig());
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.nemetdraw);
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
}
