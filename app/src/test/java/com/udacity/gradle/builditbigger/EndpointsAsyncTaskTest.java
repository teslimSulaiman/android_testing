package com.udacity.gradle.builditbigger;

import com.google.appengine.repackaged.com.google.common.base.Pair;

import org.junit.Test;
import android.support.test.InstrumentationRegistry;

import junit.framework.Assert;

import java.util.concurrent.ExecutionException;

/**
 * Created by USER on 5/15/2017.
 */

public class EndpointsAsyncTaskTest {
    @Test
    public void testNonEmptyString() {
         new EndpointsAsyncTask().execute(new Pair(InstrumentationRegistry.getTargetContext(),"test"));


    }
}
