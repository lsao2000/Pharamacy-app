package com.example.pharmacie;

import androidx.annotation.AnimRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.content.Intent;
public class Intro extends AppCompatActivity {
    private TextView gText;
    private TextView pharmacie;
    private TextView location;
    private Animation gAnimation, pharmacieAnimaton, locationAnimation, healthAnimation, setVisibilityAnimation;
    private View vector1, vector2, vector3, vector4, vector5, vector6, vector7, vector8, vector9, vector10, vector11, vector12, vector13, vector14, vector15, vector16, vector17, vector18, vector19, vector20, vector21, vector22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        gText     = (TextView) findViewById(R.id.gText);
        pharmacie = (TextView) findViewById(R.id.pharmacie);
        location  = (TextView) findViewById(R.id.location);
        pharmacieAnimaton = AnimationUtils.loadAnimation(Intro.this, R.anim.pharamcielocation_animation);
        gAnimation        = AnimationUtils.loadAnimation(Intro.this, R.anim.g_animation);
        locationAnimation = AnimationUtils.loadAnimation(Intro.this, R.anim.pharamcielocation_animation);
        healthAnimation   = AnimationUtils.loadAnimation(Intro.this, R.anim.health_animation);
        setVisibilityAnimation   = AnimationUtils.loadAnimation(Intro.this, R.anim.setvisibility_animation);
        vector1 = (View) findViewById(R.id.vector1);
        vector2 = (View) findViewById(R.id.vector2);
        vector3 = (View) findViewById(R.id.vector3);
        vector4 = (View) findViewById(R.id.vector4);
        vector5 = (View) findViewById(R.id.vector5);
        vector6 = (View) findViewById(R.id.vector6);
        vector7 = (View) findViewById(R.id.vector7);
        vector8 = (View) findViewById(R.id.vector8);
        vector9 = (View) findViewById(R.id.vector9);
        vector10= (View) findViewById(R.id.vector10);
        vector11 = (View) findViewById(R.id.vector11);
        vector12 = (View) findViewById(R.id.vector12);
        vector13 = (View) findViewById(R.id.vector13);
        vector14 = (View) findViewById(R.id.vector14);
        vector15 = (View) findViewById(R.id.vector15);
        vector16 = (View) findViewById(R.id.vector16);
        vector17 = (View) findViewById(R.id.vector17);
        vector18 = (View) findViewById(R.id.vector18);
        vector19 = (View) findViewById(R.id.vector19);
        vector20 = (View) findViewById(R.id.vector20);
        vector21 = (View) findViewById(R.id.vector21);
        vector22 = (View) findViewById(R.id.vector22);
        gText.setAnimation(gAnimation);
        location.setAnimation(locationAnimation);
        pharmacie.setAnimation(pharmacieAnimaton);
        vector1.setAnimation(setVisibilityAnimation);
        vector2.setAnimation(setVisibilityAnimation);
        vector3.setAnimation(setVisibilityAnimation);
        vector4.setAnimation(setVisibilityAnimation);
        vector5.setAnimation(setVisibilityAnimation);
        vector6.setAnimation(setVisibilityAnimation);
        vector7.setAnimation(setVisibilityAnimation);
        vector8.setAnimation(setVisibilityAnimation);
        vector9.setAnimation(setVisibilityAnimation);
        vector10.setAnimation(setVisibilityAnimation);
        vector11.setAnimation(setVisibilityAnimation);
        vector12.setAnimation(setVisibilityAnimation);
        vector13.setAnimation(setVisibilityAnimation);
        vector14.setAnimation(setVisibilityAnimation);
        vector15.setAnimation(setVisibilityAnimation);
        vector16.setAnimation(setVisibilityAnimation);
        vector17.setAnimation(setVisibilityAnimation);
        vector18.setAnimation(setVisibilityAnimation);
        vector19.setAnimation(setVisibilityAnimation);
        vector20.setAnimation(setVisibilityAnimation);
        vector21.setAnimation(setVisibilityAnimation);
        vector22.setAnimation(setVisibilityAnimation);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){

                vector1.setAnimation(healthAnimation);
                vector2.setAnimation(healthAnimation);
                vector3.setAnimation(healthAnimation);
                vector4.setAnimation(healthAnimation);
                vector5.setAnimation(healthAnimation);
                vector6.setAnimation(healthAnimation);
                vector7.setAnimation(healthAnimation);
                vector8.setAnimation(healthAnimation);
                vector9.setAnimation(healthAnimation);
                vector10.setAnimation(healthAnimation);
                vector11.setAnimation(healthAnimation);
                vector12.setAnimation(healthAnimation);
                vector13.setAnimation(healthAnimation);
                vector14.setAnimation(healthAnimation);
                vector15.setAnimation(healthAnimation);
                vector16.setAnimation(healthAnimation);
                vector17.setAnimation(healthAnimation);
                vector18.setAnimation(healthAnimation);
                vector19.setAnimation(healthAnimation);
                vector20.setAnimation(healthAnimation);
                vector21.setAnimation(healthAnimation);
                vector22.setAnimation(healthAnimation);

            }
        },1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent getStartedIntent = new Intent(Intro.this, GetStarted.class);
                startActivity(getStartedIntent);
            }
        },2500);
    }

}