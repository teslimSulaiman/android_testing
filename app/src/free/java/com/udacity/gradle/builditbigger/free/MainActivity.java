package com.udacity.gradle.builditbigger.free;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.Joke;
import com.example.myandroidlib.DisplayActivity;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.OnTaskCompleted;
import com.udacity.gradle.builditbigger.R;


public class MainActivity extends AppCompatActivity implements OnTaskCompleted {

    ProgressBar progressBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
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
    public void launchLibraryActivity(View view) {
        EndpointsAsyncTask task = new EndpointsAsyncTask(this);
        progressBar.setVisibility(View.VISIBLE);
        task.execute(new Pair<Context, String>(this, "Manfred"));

    }

    @Override
    public void onTaskCompleted(String result) {
        progressBar.setVisibility(View.GONE);
        Intent myIntent = new Intent(this, DisplayActivity.class);
        myIntent.putExtra("joke", result);
        startActivity(myIntent);
    }
}
