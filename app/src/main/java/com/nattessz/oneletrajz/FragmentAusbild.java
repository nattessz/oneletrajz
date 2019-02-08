package com.nattessz.oneletrajz;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.zip.Inflater;

public class FragmentAusbild extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_ausbild, parent, false);
        String[] personLeir = {"2012-2013: PHP-MYSQL Webprogrammierer",
                "2003-2004: TELC (Sprachprüfung in Mittelstufe Typ „C”)",
                "2003-2003: ECDL",
                "2001-2003: School Of Business (Wirtschaftsinformatiker OKJ Oberstufe)",
                "1999-2001: 500.sz. Angster József Fachschule (Abitur)",
                "1996-1999: Fachschule und Fachmittelschule für Handel und Gastronomie (Verkäufer)",
                "1988-1996: Grundschule in Himesháza"};
        ListView listView = (ListView) view.findViewById(R.id.ausbildlist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                personLeir
        );

        listView.setAdapter(listViewAdapter);
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }

}
