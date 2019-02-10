package com.nattessz.oneletrajz;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class FragmentMotiv extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_motiv, parent, false);

        String[] personmotiv = {"Bei einem größeren Unternehmen suche ich eine interessante, herausfordernde Position, wo ich meine Fachkenntnisse in Computertechnik verwenden kann."};
        ListView listView = view.findViewById(R.id.motivlist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                personmotiv
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
