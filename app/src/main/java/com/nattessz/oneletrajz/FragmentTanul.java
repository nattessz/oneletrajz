package com.nattessz.oneletrajz;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.zip.Inflater;

public class FragmentTanul extends Fragment {
    private Inflater inflater;
    private int parent;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        //setNavigationViewListener();
        View view = inflater.inflate(R.layout.fragment_tanul, parent, false);

        String[] tanul = {"2017- : http://sanfranciscoboljottem.com/Java programozó",
                "2012-2013.01: PHP-MYSQL Webprogramozó",
                "2003-2004: TELC Tudományos Ismeretterjesztő Társulat: (Középfokú komplex C-típusú Német nyelvvizsga)",
                "2003-2003: ECDL",
                "2001-2003: School Of Business Üzleti Szakközépiskola (OKJ-s Felsőfokú Gazdasági Informatikus)",
                "1999-2001: 500.sz. Angster József Szakképző iskola (érettségi)",
                "1996-1999: Pécsi Kereskedelmi Idegenforgalmi és Vendéglátóipari Szakközépiskola és Szakmunkásképző (műszaki eladó)",
                "1988-1996: Általános Iskola Himesháza"};
        ListView listView = (ListView) view.findViewById(R.id.tanullist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                tanul
        );

        listView.setAdapter(listViewAdapter);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
