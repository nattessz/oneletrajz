package com.nattessz.oneletrajz;

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

public class FragmentBeruf extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_beruf, parent, false);

        String[] personLeir = {"Seit 2013: Gaspar Farbengeschäft","Seit 2004 Bis 2012: Sachberater für Computer und Informatik bei Media Markt"};
        ListView listView = view.findViewById(R.id.beruflist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                personLeir
        );

        Animation scaleUp = AnimationUtils.loadAnimation(getActivity(), R.anim.move_down);
        listView.startAnimation(scaleUp);
        listView.setAdapter(listViewAdapter);



        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }


}
