package com.example.douglas.draweroveraction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class InitialCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_check);



        //////////////////////////////////////////////////////////////////////////////////////////////check shared preferences area
        Log.w("checking", "checking shared preferences for presence of log in");
        SharedPreferences CheckPreferences = this.getSharedPreferences("InitialPrefs",0);//get shared preferences
        String username = CheckPreferences.getString("username",null);//get username
        String password = CheckPreferences.getString("password",null);//get password
        Log.w("checking","got CheckPreferences");
        if (username == null && password == null )
        {
            //username and password are not present
            //Log.w("checking","no username or password, going to login activity");
           // Intent intent = new Intent(this, LoginActivity.class);
           // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);//takes away the back button
            //startActivity(intent);
            Toast.makeText(this, "need to go to login", Toast.LENGTH_SHORT).show();
        }

    }

}
