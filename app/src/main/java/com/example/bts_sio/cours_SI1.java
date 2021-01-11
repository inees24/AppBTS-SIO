package com.example.bts_sio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/** public class cours_SI1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours__s_i1);
    } */

    public class cours_SI1 extends Activity {
        /**
         * Called when the activity is first created.
         */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cours__s_i1);

            Button next = (Button) findViewById(R.id.menu_SI1);
            next.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), cours_SI1.class);
                    startActivityForResult(myIntent, 0);
                }

            });
        }
    }

