package com.example.gapp.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.gapp.R;

import org.w3c.dom.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataEntryActivity extends AppCompatActivity {
    EditText activityName;
    EditText equipmentName;
    EditText healthName;
    EditText stepsName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);
    }

    public void onEquipmentAddPress(View view){
        Toast.makeText(getApplicationContext(), "Add Equipment", Toast.LENGTH_LONG).show();
    }
    public void onEquipmentMinusPress(View view){
        Toast.makeText(getApplicationContext(), "Remove Equipment", Toast.LENGTH_LONG).show();
    }

    public void onHealthAddPress(View view){
        Toast.makeText(getApplicationContext(), "Add Health + Safety", Toast.LENGTH_LONG).show();
    }
    public void onHealthMinusPress(View view){
        Toast.makeText(getApplicationContext(), "Remove Health + Safety", Toast.LENGTH_LONG).show();
    }
<<<<<<< HEAD

    public void onStepAddPress(View view){
        Toast.makeText(getApplicationContext(), "Add Steps", Toast.LENGTH_LONG).show();
    }

    public void onStepMinusPress(View view){
        Toast.makeText(getApplicationContext(), "Remove Steps", Toast.LENGTH_LONG).show();
    }

    public void onFinishPress(View view){
        activityName = (EditText) findViewById(R.id.activityName);
        String sActivityName = activityName.getText().toString();
        //Toast.makeText(getApplicationContext(), sActivityName, Toast.LENGTH_LONG).show();

        equipmentName = (EditText) findViewById(R.id.equipmentCreate);
        String sEquipmentName = equipmentName.getText().toString();
        //Toast.makeText(getApplicationContext(), sEquipmentName, Toast.LENGTH_LONG).show();

        healthName = (EditText) findViewById(R.id.healthCreate);
        String sHealthName = healthName.getText().toString();
        //Toast.makeText(getApplicationContext(), sHealthName, Toast.LENGTH_LONG).show();

        stepsName = (EditText) findViewById(R.id.stepsCreate);
        String sStepsName = stepsName.getText().toString();
        //Toast.makeText(getApplicationContext(), sStepsName, Toast.LENGTH_LONG).show();

        /*
        try {

            URL url;
            url = new URL("http://www.jrevents.co.uk/test.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //Current problem lies in conn.getResponseCode()
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream is = conn.getInputStream();
            } else {
                //InputStream err = conn.getErrorStream();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
=======

    public void onStepAddPress(View view){
        Toast.makeText(getApplicationContext(), "Add Steps", Toast.LENGTH_LONG).show();
    }
    public void onStepMinusPress(View view){
        Toast.makeText(getApplicationContext(), "Remove Steps", Toast.LENGTH_LONG).show();
    }

    public void onFinishPress(View view){
        activityName = (EditText) findViewById(R.id.activityName);
        String sActivityName = activityName.getText().toString();
        //Toast.makeText(getApplicationContext(), sActivityName, Toast.LENGTH_LONG).show();

        equipmentName = (EditText) findViewById(R.id.equipmentCreate);
        String sEquipmentName = equipmentName.getText().toString();
        //Toast.makeText(getApplicationContext(), sEquipmentName, Toast.LENGTH_LONG).show();

        healthName = (EditText) findViewById(R.id.healthCreate);
        String sHealthName = healthName.getText().toString();
        //Toast.makeText(getApplicationContext(), sHealthName, Toast.LENGTH_LONG).show();

        stepsName = (EditText) findViewById(R.id.stepsCreate);
        String sStepsName = stepsName.getText().toString();
        //Toast.makeText(getApplicationContext(), sStepsName, Toast.LENGTH_LONG).show();

        try {

            URL url;
            url = new URL("http://www.jrevents.co.uk/test.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //Current problem lies in conn.getResponseCode()
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream is = conn.getInputStream();
            } else {
                //InputStream err = conn.getErrorStream();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


>>>>>>> 2d463ed9b3f3e30eb66d718f48f9bf1aea7d0d43
}