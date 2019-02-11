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

public class FragmentAdataim extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_szemelyes, parent, false);

        String[] adataim = {"Név: Nagy Attila",
                "Anyja neve: Kroh Erzsébet",
                "Lakcím: Pécs, Polgárszőlő utca 4.",
                "Születési hely: Mohács",
                "Születési idő: 1981. November 30.",
                "Végzettség: Gazdasági Informatikus",
                "Email: nattessz@gmail.com"};
        ListView listView = view.findViewById(R.id.szemelyesadat);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                adataim
        );
        Animation scaleUp = AnimationUtils.loadAnimation(getActivity(), R.anim.move_down);
        listView.startAnimation(scaleUp);
        listView.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }

}