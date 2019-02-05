package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MagyarNyelv extends MainActivity implements NavigationView.OnNavigationItemSelectedListener{

    ListView listView;
    ListView listView2;
    private DrawerLayout magyarDrawer;
    private ActionBarDrawerToggle magyarTog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.magyarnyelv);

        magyarDrawer = (DrawerLayout)findViewById(R.id.magyardraw);
        magyarTog = new ActionBarDrawerToggle(this,magyarDrawer,R.string.nyit,R.string.zar);
        magyarDrawer.addDrawerListener(magyarTog);
        magyarTog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.design_navigation_view2);
        navigationView.setNavigationItemSelectedListener(this);


        //listView=(ListView)findViewById(R.id.munkahelylist);
        //listView2=(ListView)findViewById(R.id.iskolalist);

        //ArrayList<String> arrayList = new ArrayList<>();
        //arrayList.add("2013.Január: Gáspár Festék Áruház (Rendszergazda-Pénztáros)");
        //arrayList.add("2004 – 2012. Augusztus:  Média Markt Pécs Kft: Számítástechnikai Szaktanácsadó");

        //ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        //listView.setAdapter(arrayAdapter);

        //ArrayList<String> arrayList2 = new ArrayList<>();
        //arrayList2.add("2017-      : http://sanfranciscoboljottem.com/Java programozó");
        //arrayList2.add("2012-2013.01: PHP-MYSQL Webprogramozó");
        //arrayList2.add("2003-2004: TELC Tudományos Ismeretterjesztő Társulat (Középfokú komplex C-típusú Német nyelvvizsga) ");
        //arrayList2.add("2003-2003: ECDL");
        //arrayList2.add("2001-2003: School Of Business Üzleti Szakközépiskola (OKJ-s Felsőfokú Gazdasági Informatikus)");
        //arrayList2.add("1999-2001: 500.sz. Angster József Szakképző iskola (érettségi)");
        //arrayList2.add("1996-1999: Pécsi Kereskedelmi Idegenforgalmi és Vendéglátóipari Szakközépiskola és Szakmunkásképző (műszaki eladó)");
        //arrayList2.add("1988-1996: Általános Iskola Himesháza");

        //ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        //listView2.setAdapter(arrayAdapter2);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // menu gomb vezérlés
        int id = item.getItemId();

        if (id == R.id.munka) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.tanulmany) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 1",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.nyelv) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 2",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.szakma) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 3",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.ismeret) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 4",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.tulahdonsag) {
            Toast.makeText(getApplicationContext(),"Ide jön a fragment 5",Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.magyardraw);
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
