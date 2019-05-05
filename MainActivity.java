package com.example.myassistant;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String TAG = "DemoInitialApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Wire up the buttons to do stuff
        // ..get the button
        Button journal = findViewById(R.id.journal);
        Button contacts = findViewById(R.id.people);
        Button games = findViewById(R.id.games);
        Button settings = findViewById(R.id.settings);
        // ..set what happens when the user clicks
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJournal();
            }
        });

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContacts();
            }
        });

        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGames();
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });
    }

    public void openJournal(){
        Intent intent = new Intent(this, Journal.class);
        startActivity(intent);
    }

    public void openContacts(){
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }

    public void openGames(){
        Intent intent = new Intent(this, Games.class);
        startActivity(intent);
    }

    public void openSettings(){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
