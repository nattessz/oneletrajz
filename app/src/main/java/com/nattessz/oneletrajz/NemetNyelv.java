package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NemetNyelv extends MainActivity {

    ListView listView;
    private DrawerLayout nemetDrawer;
    private ActionBarDrawerToggle nemetTog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nemtnyelv);

        nemetDrawer = (DrawerLayout)findViewById(R.id.nemetdraw);
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

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (nemetTog.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
