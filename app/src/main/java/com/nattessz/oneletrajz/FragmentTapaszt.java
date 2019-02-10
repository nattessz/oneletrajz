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

public class FragmentTapaszt extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragmnet_tapasztal, parent, false);

        String[] tapaszt = {"PHP web programozás",
                "Adatbázis szerkesztés (MySql)",
                "JAVA, JAVA FX, JDBC",
                "Spring Boot",
                "Verziókövetés: GIT (https://github.com/nattessz)",
                "Tesztelés: Jmeter",
                "Android programozás Java nyelven",
                "Linux",
                "Netbeans IDE, Android Studio IDE",
                "Értékesítés"};
        ListView listView = view.findViewById(R.id.tapasztlist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                tapaszt
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
