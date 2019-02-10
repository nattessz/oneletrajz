package com.nattessz.oneletrajz;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MagyarNyelv extends MainActivity implements NavigationView.OnNavigationItemSelectedListener{

    ListView listView;
    ListView listView2;
    private DrawerLayout magyarDrawer;
    private ActionBarDrawerToggle magyarTog;
    private TextView focim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.magyarnyelv);

        focim = findViewById(R.id.focimmagy);
        magyarDrawer = findViewById(R.id.magyardraw);
        FrameLayout frameLayout = findViewById(R.id.magycontent);
        magyarTog = new ActionBarDrawerToggle(this,magyarDrawer,R.string.nyit,R.string.zar);
        magyarDrawer.addDrawerListener(magyarTog);
        magyarTog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "hand.ttf");

        NavigationView navigationView = findViewById(R.id.design_navigation_view2);
        navigationView.setNavigationItemSelectedListener(this);

        focim.setTypeface(mTypeface);
        focim.setText("Munkahelyeim:");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.magycontent, new FragmentMunka());
        ft.commit();

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // menu gomb vezérlés
        int id = item.getItemId();

        if (id == R.id.munka) {
            focim.setText("Munkahelyeim:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentMunka());
            ft.commit();
        } else if (id == R.id.tanulmany) {
            focim.setText("Tanulmányaim:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentTanul());
            ft.commit();
        }
        else if (id == R.id.nyelv) {
            focim.setText("Nyelvismeret:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentNyelv());
            ft.commit();
        }
        else if (id == R.id.szakma) {
            focim.setText("Szakmai cél:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentSzakma());
            ft.commit();
        }
        else if (id == R.id.ismeret) {
            focim.setText("Tapasztalat, jártasság:");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.magycontent, new FragmentTapaszt());
            ft.commit();
        }
        else if (id == R.id.tulahdonsag) {
            focim.setText("Személyes tulajdonságaim:");
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

}
