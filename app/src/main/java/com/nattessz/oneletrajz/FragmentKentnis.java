package com.nattessz.oneletrajz;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Objects;
import java.util.zip.Inflater;

public class FragmentKentnis extends Fragment{
    private Inflater inflater;
    private int parent;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_kentnis, parent, false);

        String[] personkentnis = {"PHP Web Programmiren",
        "Datenbank bearbeiten (MySql)",
        "JAVA, JAVA FX, JDBC, Spring Boot",
        "Versionskontrolle: GIT (https://github.com/nattessz)",
        "Testhilfsprogramm: Jmeter",
        "Android-Programmierung in der Sprache JAVA",
        "Linux",
        "Verwertung",
        "Netbeans IDE, Android Studio IDE"};

        ListView listView1 = (ListView) view.findViewById(R.id.kentnislist);
        ArrayAdapter<String> listViewAdapter;
        listViewAdapter = new ArrayAdapter<String>(
                Objects.requireNonNull(getActivity()),
                android.R.layout.simple_list_item_1,
                personkentnis
        );
        listView1.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
