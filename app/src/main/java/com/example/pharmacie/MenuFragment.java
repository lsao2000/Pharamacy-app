package com.example.pharmacie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
public class MenuFragment extends Fragment {
    private Spinner listPharamcy;
    private ArrayList<Pharmacie> allPharamcie = new ArrayList<>();
    View view;
    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_menu, container, false);
        listPharamcy = view.findViewById(R.id.pharmaciesList);
        if(getActivity() instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) getActivity();
            ArrayAdapter<Pharmacie> newArrayAdapter = new ArrayAdapter<Pharmacie>(getContext(), android.R.layout.simple_spinner_dropdown_item, mainActivity.getPharmacieArrayList());
            listPharamcy.setAdapter(newArrayAdapter);

        }
        return view;
    }

}