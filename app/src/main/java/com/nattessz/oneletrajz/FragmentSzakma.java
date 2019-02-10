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

public class FragmentSzakma extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_szakma, parent, false);

        String[] szakma = {"Olyan munkakör betöltése, ahol a számítástechnikai, fejlesztői ismereteimet hasznosíthatom."};
        ListView listView = view.findViewById(R.id.szakmalist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                szakma
        );

        Animation scaleUp = AnimationUtils.loadAnimation(getActivity(), R.anim.move_up);
        listView.startAnimation(scaleUp);
        listView.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
