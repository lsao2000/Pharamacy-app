package com.example.pharmacie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.WindowManager;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
public class GetStarted extends AppCompatActivity {
    private Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_get_started);
        getStarted = (Button) findViewById(R.id.getStarted);
        getStarted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent mainActivityIntent = new Intent(GetStarted.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}