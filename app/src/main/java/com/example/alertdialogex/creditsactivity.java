package com.example.alertdialogex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class creditsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditsactivity);
    }

    /**
     *Sends back to the button activity.
     */
    public void backtofirst(View view) {
        finish();
    }
}
