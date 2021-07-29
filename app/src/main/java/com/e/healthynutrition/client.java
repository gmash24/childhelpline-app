package com.e.healthynutrition;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class client extends Fragment {

    EditText clname,clstatus,clage,clemail,clresidence,clgender,cltribe,clidno;
    DatabaseReference reff;
    @Override
    public View onCreateView ( LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState ) {

        //finding the variables in layout


        //firebase databse reference
        reff= FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("clientinfo");


        return inflater.inflate(R.layout.fragment_client, container, false);






    }
}