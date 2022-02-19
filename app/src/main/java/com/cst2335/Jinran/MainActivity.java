package com.cst2335.Jinran;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    Button loginBtn = findViewById(R.id.loginBtn);
    SharedPreferences prefs = getSharedPreferences("MyData", Context.MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        loginBtn.setOnClickListener(clk -> {
            SharedPreferences.Editor editor = prefs.edit();
            Intent goToProfile = new Intent(MainActivity.this, ProfileActivity.class);
            EditText editTextEmail = findViewById(R.id.editTextEmail);
            goToProfile.putExtra( "EMAIL", editTextEmail.getText().toString() );
            editor.putString("Email", editTextEmail.getText().toString());
            editor.apply();
            startActivity( goToProfile);
        });
    }

}