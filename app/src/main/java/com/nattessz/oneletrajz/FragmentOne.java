package com.nattessz.oneletrajz;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FragmentOne extends Fragment {

    private Inflater inflater;
    private int parent;
    private ListView listView;
    private Activity rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_person, parent, false);

            String[] personLeir = {"Geburtsdatum: 30. November 1981","Geburtsort: Mohács","Adresse: Pécs, Polgárszőlő utca 4.","Email: nattessz@gmail.com",
                    "Hochschulbildung: Wirtschaftsinformatiker"};
            ListView listView = (ListView) view.findViewById(R.id.nemetlist);
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
