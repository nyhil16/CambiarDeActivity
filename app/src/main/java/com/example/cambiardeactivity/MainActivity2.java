package com.example.cambiardeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {

    protected CheckBox cb1, cb2, cb3;
    protected Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cb1 = findViewById(R.id.chbNegro);
        cb2 = findViewById(R.id.chbAzul);
        cb3 = findViewById(R.id.chbGris);

        b1 = findViewById(R.id.btnSiguiente2);

    }

    public void check(View view) {
        if(cb1.isChecked() && cb2.isChecked() && cb3.isChecked()) {
            b1.setVisibility(View.VISIBLE);
        }
    }

    public void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(switchActivityIntent);
    }

    public void switchActivity(View view) {
        switchActivities();
    }

}