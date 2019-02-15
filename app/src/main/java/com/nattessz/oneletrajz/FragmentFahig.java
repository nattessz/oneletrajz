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

public class FragmentFahig extends Fragment {
    private Inflater inflater;
    private int parent;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fahig, parent, false);

        String[] personfhaig = {"Kommunikationsstärke",
                "Gute Menschenkenntnisse",
                "Zuverlässigkeit",
                "Pünktlichkeit",
                "Rasche Auffassungsgabe",
                "Offen für neue Kenntnisse",
                "Ich rauche nicht"};

        ListView listView = view.findViewById(R.id.fhaiglist);
        ArrayAdapter<String> listViewAdapter;
        listViewAdapter = new ArrayAdapter<String>(
                Objects.requireNonNull(getActivity()),
                android.R.layout.simple_list_item_1,
                personfhaig
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
