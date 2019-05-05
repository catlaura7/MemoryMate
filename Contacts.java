package com.example.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        //Wire up the buttons to do stuff
        // ..get the button
        Button alex = (Button)findViewById(R.id.AlexWang);
        Button laura = (Button)findViewById(R.id.LauraPopa);
        Button nicholas = (Button)findViewById(R.id.NicholasM);
        Button selena = (Button)findViewById(R.id.SelenaN);
        // ..set what happens when the user clicks
        alex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlex();
            }
        });

        laura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLaura();
            }
        });

        nicholas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNicholas();
            }
        });

        selena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelena();
            }
        });
    }

    public void openAlex(){
        Intent intent = new Intent(this, Alex.class);
        startActivity(intent);
    }

    public void openLaura(){
        Intent intent = new Intent(this, Laura.class);
        startActivity(intent);
    }

    public void openNicholas(){
        Intent intent = new Intent(this, Nicholas.class);
        startActivity(intent);
    }

    public void openSelena(){
        Intent intent = new Intent(this, Selena.class);
        startActivity(intent);
    }
}
