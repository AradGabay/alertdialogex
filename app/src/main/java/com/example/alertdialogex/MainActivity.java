package com.example.alertdialogex;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    /**
     *This method creates the options menu.
     */
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /**
     *This method sends to the next activity once an item is pressed in the options menu.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent t1 = new Intent(this,creditsactivity.class);
        startActivity(t1);
        return true;
    }

    /**
     *Pops up alert dialog with a message
     */
    public void activatefirst(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("First Dialog");
        adb.setMessage("Simple Message");


        ad = adb.create();
        ad.show();

    }
    /**
     *Pops up alert dialog with an icon.
     */
    public void activatesecond(View view){
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Second Dialog");
        adb.setIcon(R.drawable.cutecat);

        ad = adb.create();
        ad.show();

    }

    /**
     *Pops up alert dialog with a button.
     */
    public void activatethird(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Third Dialog");
        adb.setCancelable(false);

        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ad = adb.create();
        ad.show();
    }

    /**
     *Pops up alert box where you can change background color.
     */
    public void activatefourth(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Fourth Dialog");
        adb.setMessage("Change Background");
        adb.setCancelable(false);

        adb.setNeutralButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int color = Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                ll.setBackgroundColor(color);


            }
        });
        adb.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ad = adb.create();
        ad.show();

    }

    /**
     *Pops up alert dialog where you can restore color back to white or change to other color.
     */
    public void activatefifth(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Fifth dialog");
        adb.setMessage("Change Background");

        adb.setCancelable(false);

        adb.setNeutralButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int color = Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });
        adb.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        adb.setNegativeButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);

            }
        });

        ad = adb.create();
        ad.show();

    }
}
