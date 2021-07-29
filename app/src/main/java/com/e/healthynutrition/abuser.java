package com.e.healthynutrition;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class abuser extends Fragment {
    EditText ppname,ppstatuse,ppage,ppemail,ppresidence,
            clgender,cltribe,ppidno;
    DatabaseReference reff;



    @Override
    public View onCreateView ( LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState ) {
        View rootview=inflater.inflate(R.layout.fragment_abuser, container, false);



        //firebase databse reference
        reff = FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("perpetratorinfo");

        return rootview;

        // Inflate the layout for this fragment

    }
}