package com.example.gapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;

public class JobActivity extends AppCompatActivity {
    Chronometer chron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        chron = (Chronometer) findViewById(R.id.Chronometer);
        chron.stop();
    }

    public void hide(View view) {
        setContentView(R.layout.activity_job);
        chron = (Chronometer) findViewById(R.id.Chronometer);
        chron.setVisibility(view.INVISIBLE);
    }

    public void prevButtonPress() {

    }

    public void nextButtonPress() {

    }

    public void PlayPause(View view) {
        chron = (Chronometer) findViewById(R.id.Chronometer);
        chron.start();
    }
    public void Pause(View view) {
        chron = (Chronometer) findViewById(R.id.Chronometer);
        chron.stop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_job, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}