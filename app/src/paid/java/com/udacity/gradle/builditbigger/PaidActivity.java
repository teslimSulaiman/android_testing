package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.Joke;

/**
 * Created by USER on 5/16/2017.
 */

public class PaidActivity  extends AppCompatActivity {

    ProgressBar progressBar ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.paid_activity);
        // new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
        progressBar=(ProgressBar)findViewById(R.id.loading_indicator);
        progressBar.setVisibility(View.GONE);
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

    public void tellJoke(View view) {
        Joke joke = new Joke();
        String jokeMessage = joke.getJoke();
        Toast.makeText(this, jokeMessage, Toast.LENGTH_SHORT).show();
    }

    public void launchLibraryActivity(View view) {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.setProgressBar(progressBar);
        task.execute(new Pair<Context, String>(this, "Manfred"));

    }


}

