package com.example.pharmacie;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class LoginFragment extends Fragment {
    View view;
    private EditText pharmacieName, pharmacyLocation, pharmacyPhone, placePharmacy;
    private Switch parapharmacy;
    private String name, location, phone, place;
    private Boolean para;
    private Button send;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_login, container, false);
        pharmacieName = view.findViewById(R.id.pharmacieName);
        pharmacyLocation = view.findViewById(R.id.locationPharmacie);
        pharmacyPhone = view.findViewById(R.id.phonePharmacie);
        placePharmacy = view.findViewById(R.id.placePharmacy);
        parapharmacy = view.findViewById(R.id.parapharmacie);
        send = view.findViewById(R.id.save);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                name = pharmacieName.getText().toString();
                location = pharmacyLocation.getText().toString();
                phone = pharmacyPhone.getText().toString();
                place = placePharmacy.getText().toString();
                if (parapharmacy.isChecked()){
                    para = true;
                }else{
                    para = false;
                }
                Pharmacie pharmacie = new Pharmacie(name, location, phone,place,para);
                if(getActivity() instanceof MainActivity){
                    MainActivity mainActivity = (MainActivity) getActivity();
                    boolean valid = true;
                    for (Pharmacie pharmacie1: pharmacie.getPharmacies()){
                        if(pharmacie1.getPlace().equals(pharmacie.getPlace())){
                            valid = false;
                            break;
                        }
                    }
                    if(valid){
                        Toast.makeText(getContext(), pharmacie.getNom()+pharmacie.getPlace(), Toast.LENGTH_SHORT).show();
                        pharmacie.addPharmacie(pharmacie);
                        mainActivity.addDataToArrayList(pharmacie);
                    }

                }
            }
        });

        return view;
    }


}