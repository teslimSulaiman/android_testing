package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by USER on 5/16/2017.
 */

public class MainActivityFragmentPaid extends Fragment {

    public MainActivityFragmentPaid() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.paid_fragment, container, false);


        return root;
    }
}
