package com.cst2335.Jinran;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.Button;
import android.widget.Switch;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);

        Button clickBtton = findViewById(R.id.ClickButton);
        clickBtton.setOnClickListener(view -> Toast.makeText( MainActivity.this, getResources().getString(R.string.toast_message), Toast.LENGTH_LONG).show());



        String switchOn = "Turn on!";
        String switchOff = "Turn off!";
        String undoStr = "Undo";
        Switch simpleSwitch = (Switch)findViewById(R.id.simpleSwitch);
        simpleSwitch.setOnCheckedChangeListener((CompoundButton bt, boolean isChecked) ->
                Snackbar.make(simpleSwitch, (isChecked?switchOn:switchOff), Snackbar.LENGTH_LONG).
                    setAction(undoStr, (click) -> simpleSwitch.setChecked(!isChecked)).show());





            }
                                                }
