package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;


import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTests implements OnTaskCompleted {

    @Test
    public void useJokeButton() {

        EndpointsAsyncTask  endpointsAsyncTask = new EndpointsAsyncTask(this);
        endpointsAsyncTask.execute(new Pair<>(InstrumentationRegistry.getTargetContext(), "Manfred"));
    }

    @Override
    public void onTaskCompleted(String result) {
        assertNotNull(result);
    }
}