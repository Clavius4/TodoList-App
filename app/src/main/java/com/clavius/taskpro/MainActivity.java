package com.clavius.taskpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {
    private AppCompatButton loginButton;
    private AppCompatButton signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase Authentication
//        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
//        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

        // Initialize buttons
        loginButton = findViewById(R.id.button);
        signUpButton = findViewById(R.id.button2);

//        if (currentUser != null) {
//            // User is authenticated, go to the dashboard activity
//            Intent dashboardIntent = new Intent (MainActivity.this, Dashboard.class);
//            startActivity(dashboardIntent);
//            finish();
//        }
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  handle login button click
                Intent loginIntent = new Intent(MainActivity.this, Login.class);
                startActivity(loginIntent);
            }


        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // handle sign up button click
                Intent signUpIntent = new Intent(MainActivity.this, SignUp.class);
                startActivity(signUpIntent);
            }
        });
    }
}