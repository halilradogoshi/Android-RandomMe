package com.dovelaqm.randomme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class AboutMe extends AppCompatActivity {


    //Create a string array with 10 properties
    private String[] aboutMe = {
            "Helpful person",
            "Loves to code in Android",
            "Very helpful friend",
            "Makes thing done",
            "Very enthusiastic person",
            "Learning to be entrepreneur",
            "Learn things very fast",
            "Expert in Knowledge Management",
            "Expert in Capacity Development",
            "Can fly one second at a time"};


    private Random rand = new Random();

    //Create the method to generate random string
    public void RandomString(View view){

        int arrayIndex = new Random().nextInt(aboutMe.length);
        String newText = aboutMe[arrayIndex];
        TextView aboutTextView = (TextView)findViewById(R.id.aboutTextView);
        aboutTextView.setText(newText);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
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
