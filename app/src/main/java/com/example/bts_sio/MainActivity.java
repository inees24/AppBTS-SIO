package com.example.bts_sio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mGreetingText;
        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId() ) {
            case R.id.menu_SLAM3:
                Toast.makeText(this, "menu SLAM3 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_SLAM4:
                Toast.makeText(this, "menu SLAM4 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}