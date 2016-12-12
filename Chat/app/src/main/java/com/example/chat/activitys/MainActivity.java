package com.example.chat.activitys;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

    public void about(View view) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getApplicationContext());
        builder1.setMessage("Criado para a metéria de Redes de Computadores.\n" +
                            "Desenvolvido por Adilson Torres e Jhonata Antunes.");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }
        );

        AlertDialog alert11 = builder1.create();
        alert11.show();

        //Intent intent = new Intent(getApplicationContext(), Client.class);
        //startActivity(intent);
    }

    public void quit(View view){
        finish();
        System.exit(0);.
    }


}
