package com.example.myandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by USER on 5/14/2017.
 */

public class DisplayActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView = (TextView) findViewById(R.id.jokeId);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            String joke = extras.getString("joke");
            textView.setText(joke);
        }
    }
}
