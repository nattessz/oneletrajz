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

public class FragmentMunka extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_munka, parent, false);

        String[] munka = {"2013.Január: Gáspár Festék Áruház (Rendszergazda-Pénztáros)",
                "2004 – 2012. Augusztus:  Média Markt Pécs Kft: Számítástechnikai Szaktanácsadó"};
        ListView listView = view.findViewById(R.id.munkalist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                munka
        );
        Animation scaleUp = AnimationUtils.loadAnimation(getActivity(), R.anim.move_left);
        listView.startAnimation(scaleUp);
        listView.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }

}
