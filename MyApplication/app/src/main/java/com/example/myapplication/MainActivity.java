package com.example.myapplication;
import Entity.Event;
import Publishing.ActivityCard ;
import Publishing.PublishEvent;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.autofill.AutofillId;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static Context mcontext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = findViewById(R.id.linearLayout) ;
        //LinearLayout layout = findViewById(R.id.linearLayout) ;
        ArrayList<Event> events = PublishEvent.parsejson() ;

        for(int i = 0 ; i <=events.size() ;  i ++){
            layout.addView(ActivityCard.createCard(this, events.get(i)));
        }
    }









    public void addAll(View view) {
        //mapping json :

//
//        LinearLayout layout = findViewById(R.id.linearLayout) ;
//
//
//        for(int i = 0 ; i <=2 ;  i ++){
//            layout.addView(ActivityCard.createCard(this, dispatchTouchEvent()));
//        }
    }


}
