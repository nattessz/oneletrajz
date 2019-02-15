package com.nattessz.oneletrajz;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Objects;
import java.util.zip.Inflater;

public class FragmentKentnis extends Fragment{
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
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

        ListView listView1 = view.findViewById(R.id.kentnislist);
        ArrayAdapter<String> listViewAdapter;
        listViewAdapter = new ArrayAdapter<String>(
               getActivity(),
               android.R.layout.simple_list_item_1,
               personkentnis
        );
        Animation scaleUp = AnimationUtils.loadAnimation(getActivity(), R.anim.move_down);
        listView1.startAnimation(scaleUp);
        listView1.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
