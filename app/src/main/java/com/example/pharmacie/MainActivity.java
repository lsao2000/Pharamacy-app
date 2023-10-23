package com.example.pharmacie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String data ;
    private ArrayList<Pharmacie> pharmacieArrayList = new ArrayList<>();
    private View homeBtn, searchBtn, listBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        homeBtn = (View) findViewById(R.id.home_badge);
        searchBtn = (View) findViewById(R.id.search_badge);
        listBtn = (View) findViewById(R.id.list_badge);
        Fragment weightFragment = new LoginFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, weightFragment);
        fragmentTransaction.commit();
        homeBtn.setBackgroundResource(R.drawable.home_checked);
        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                homeBtn.setBackgroundResource(R.drawable.home_checked);
                searchBtn.setBackgroundResource(R.drawable.search);
                listBtn.setBackgroundResource(R.drawable.list);
                Fragment weightFragment = new LoginFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame, weightFragment);
                fragmentTransaction.commit();
            }
        });
        searchBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                homeBtn.setBackgroundResource(R.drawable.home);
                searchBtn.setBackgroundResource(R.drawable.search_checked);
                listBtn.setBackgroundResource(R.drawable.list);
                Fragment searchFragment = new SearchFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame, searchFragment);
                fragmentTransaction.commit();
            }
        });
        listBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                homeBtn.setBackgroundResource(R.drawable.home);
                searchBtn.setBackgroundResource(R.drawable.search);
                listBtn.setBackgroundResource(R.drawable.list_checked);
                Fragment listFragment = new MenuFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame, listFragment);
                fragmentTransaction.commit();
            }
        });
    }
    public void addDataToArrayList(Pharmacie pharmacie){
            pharmacieArrayList.add(pharmacie);
    }
    public ArrayList<Pharmacie> getPharmacieArrayList(){
        return pharmacieArrayList;
    }
}