package com.example.natchaya006.psupin;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }
    public void loginClicked(View view){
        Toast.makeText(this, "LOGIN Complete!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,WelcomeActivity.class);
        startActivity(intent);
    }
}
