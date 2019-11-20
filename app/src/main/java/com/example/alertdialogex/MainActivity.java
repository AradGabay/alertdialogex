package com.example.alertdialogex;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    AlertDialog.Builder adb;
    Random rnd = new Random();
    AlertDialog ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = findViewById(R.id.ll);


    }

    public void activatefirst(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("First Dialog");
        adb.setMessage("Simple Message");

        ad = adb.create();
        ad.show();

    }
    public void activatesecond(View view){
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Second Dialog");
        adb.setIcon(R.drawable.ic_launcher_background);

        ad = adb.create();
        ad.show();

    }

    public void activatethird(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Second Dialog");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ad = adb.create();
        ad.show();
    }

    public void activatefourth(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Second Dialog");
        adb.setMessage("Change Background");
        adb.setIcon(R.drawable.ic_launcher_background);

        adb.setNeutralButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                


            }
        });
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ad = adb.create();
        ad.show();

    }

    public void activatefifth(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Second Dialog");
        adb.setMessage("Change Background");
        adb.setIcon(R.drawable.ic_launcher_background);

        adb.setNeutralButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        adb.setNegativeButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        ad = adb.create();
        ad.show();

    }
}
