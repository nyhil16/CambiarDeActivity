package com.example.cambiardeactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    protected CheckBox cb1, cb2, cb3, cb4;
    protected Button b1;

    protected int bien = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.chbMusica);
        cb2 = findViewById(R.id.chbYoutube);
        cb3 = findViewById(R.id.chbVideojuegos);
        cb4 = findViewById(R.id.chbComida);

        b1 = findViewById(R.id.btnSiguiente);

    }

    public void check(View view) {
        if(cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()) {
            b1.setVisibility(View.VISIBLE);
        }
    }

    public void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);
    }

    public void switchActivity(View view) {
        switchActivities();
    }
}