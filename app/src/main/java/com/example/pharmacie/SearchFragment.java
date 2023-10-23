package com.example.pharmacie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class SearchFragment extends Fragment {
    private View searchBtn;
    private View view;
    private TextView getAnsewr;
    private String inputText;
    private AutoCompleteTextView searchInput;
    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search, container, false);
        searchBtn = view.findViewById(R.id.search_btn);
        searchInput = view.findViewById(R.id.search_input);
        getAnsewr = view.findViewById(R.id.getAnswear);
        ArrayAdapter<Pharmacie> newArrayAdapter = new ArrayAdapter<Pharmacie>(getContext(), android.R.layout.simple_spinner_dropdown_item, Pharmacie.getPharmacies());
        searchInput.setAdapter(newArrayAdapter);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = searchInput.getText().toString();
                Pharmacie gettingSearch = Pharmacie.Recheche(inputText);
                if(gettingSearch != null){
                    getAnsewr.setText(gettingSearch.toString());
                }else{
                    getAnsewr.setText("does not exist");
                }
            }
        });
        return view;
    }
}