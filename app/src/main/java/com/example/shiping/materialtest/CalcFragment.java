package com.example.shiping.materialtest;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * This fragment houses function 1. Most of the coding work is done at the xml side.
 */
public class CalcFragment extends android.support.v4.app.Fragment {


    public CalcFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_calc, container, false);
        return layout;
    }




}

