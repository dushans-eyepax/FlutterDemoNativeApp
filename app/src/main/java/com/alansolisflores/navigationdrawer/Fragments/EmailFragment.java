package com.alansolisflores.navigationdrawer.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alansolisflores.navigationdrawer.R;

public class EmailFragment extends Fragment {

    public EmailFragment() {} // Required empty public constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_email, container, false);
        return view;
    }

}
