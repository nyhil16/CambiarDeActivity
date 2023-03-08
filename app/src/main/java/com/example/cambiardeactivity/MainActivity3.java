package com.example.cambiardeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void switchAnterior() {
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);
    }

    public void switchInicio() {
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }

    public void switchActivityAnterior(View view) {
        switchAnterior();
    }

    public void switchActivityInicio(View view) {
        switchInicio();
    }

    public void exitApp(View view) {
        finishAffinity();
        System.exit(0);
    }
}