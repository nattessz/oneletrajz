package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.zip.Inflater;

public class FragmentSzemely extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_szemely, parent, false);

        String[] szemely = {"Jó kommunikációs készséggel és emberismerettel rendelkezem.",
                "Erősségeim a  pontosság és a megbízhatóság.",
                "Képes vagyok az önálló munkavégzésre.",
                "Szeretek csapatban is dolgozni.",
                "Nyitott vagyok új ismeretek elsajátítására.",
                "Gyorsan és könnyen tanulok.",
                "Nem dohányzom."};

        ListView listView = (ListView) view.findViewById(R.id.szemelylist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                szemely
        );

        listView.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
