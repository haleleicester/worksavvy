package com.example.gapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;

import com.example.gapp.model.DataEntryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onUserAccess(View view){
        Intent myIntent = new Intent(view.getContext(), JobActivity.class);
        startActivityForResult(myIntent, 0);
    }
    public void onDataEntry(View view){
        Intent myIntent = new Intent(view.getContext(), DataEntryActivity.class);
        startActivityForResult(myIntent, 0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onTestPress(View view){
        Intent myIntent = new Intent(view.getContext(), JobActivity.class);
        startActivityForResult(myIntent, 0);
    }
}
