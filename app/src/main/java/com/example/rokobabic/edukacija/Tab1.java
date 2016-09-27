package com.example.rokobabic.edukacija;

import android.location.GpsStatus;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Roko Babic on 18.8.2016..
 */
public class Tab1 extends Fragment {

    private ArrayAdapter<String> adapter_list;
    private ArrayList<String> itemList;
    private ListView listView;

    private AutoCompleteTextView autoComplete;
    private ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1,container,false);

        // Get listu riječi ..
        String[] rijeci = getResources().getStringArray(R.array.rječnikList);

        adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,rijeci);

        autoComplete = (AutoCompleteTextView) v.findViewById(R.id.autoComplete);

        String[] items = {"Zadnje pogledane riječi:"};
        itemList=new ArrayList<String>(Arrays.asList(items));
        listView = (ListView) v.findViewById(R.id.listView);
        adapter_list = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,itemList);
        listView.setAdapter(adapter_list);

        // Adapter za autoComplete tekstview
        autoComplete.setAdapter(adapter);

        // Najmanji broj slova prije nego se dropdown lista pojavi
        autoComplete.setThreshold(1);

        // Nakon klika na item na drop listi
        autoComplete.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
                String nova = arg0.getItemAtPosition(arg2).toString();
                itemList.add(nova);
                adapter_list.notifyDataSetChanged();
                autoComplete.setText("");
                Toast.makeText(getActivity().getBaseContext(), "Dodano u listu: "+arg0.getItemAtPosition(arg2),
                        Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}
