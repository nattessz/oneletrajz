package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;


public class NemetNyelv<nemetTog> extends MainActivity implements NavigationView.OnNavigationItemSelectedListener {

    ListView listView;
    private DrawerLayout nemetDrawer;
    private ActionBarDrawerToggle nemetTog;
    private boolean isDrawerFixed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.nemtnyelv);

        nemetDrawer = (DrawerLayout)findViewById(R.id.nemetdraw);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.flContent);
        isDrawerFixed = getResources().getBoolean(R.bool.isDrawerFixed);
        nemetTog = new ActionBarDrawerToggle(this,nemetDrawer,R.string.nyit,R.string.zar);
        nemetDrawer.addDrawerListener(nemetTog);
        nemetTog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        //listView=(ListView)findViewById(R.id.nemetlist);

        //ArrayList<String> arrayList = new ArrayList<>();
        //arrayList.add("Seit 2013: Gaspar Farbengeschäft");
        //arrayList.add("Seit 2004 Bis 2012: Sachberater für Computer und Informatik bei Media Markt");

        //ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        //listView.setAdapter(arrayAdapter);

        NavigationView navigationView = (NavigationView) findViewById(R.id.design_navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // menu gomb vezérlés
        int id = item.getItemId();

        if (id == R.id.person) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment",Toast.LENGTH_LONG).show();
        } else if (id == R.id.beruf) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 1",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.ausbild) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 2",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.motiv) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 3",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.kentnis) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 4",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.faigket) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 5",Toast.LENGTH_LONG).show();
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
