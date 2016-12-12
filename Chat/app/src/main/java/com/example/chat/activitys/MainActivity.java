package com.example.chat.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chat.Client.Client;
import com.example.chat.R;
import com.example.chat.Server.Service;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Buttons

    public void client(View view) {
        Intent intent = new Intent(getApplicationContext(), Client.class);
        startActivity(intent);
    }

    public void server(View view) {
        Intent intent = new Intent(getApplicationContext(), Service.class);
        startActivity(intent);
    }

    public void quit(View view){
        finish();
        System.exit(0);.
    }


}
