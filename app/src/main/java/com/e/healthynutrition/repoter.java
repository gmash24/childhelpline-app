package com.e.healthynutrition;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class repoter extends Fragment {
    Button loginn;
    EditText clname,clstatus,clage,clemail,clresidence,clgender,cltribe,clidno;
    EditText ppname,ppstatuse,ppage,ppemail,ppresidence,ppidno;
    DatabaseReference reff;


    @Override
    public View onCreateView ( LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState ) {
       ppname = (EditText)getView().findViewById(R.id.ppnamee);
        ppstatuse = getView().findViewById(R.id.ppstatuss);
        ppage =getView().findViewById(R.id.ppagee);
        ppemail =getView().findViewById(R.id.ppemaill);
        ppresidence =getView().findViewById(R.id.ppresidencee);
        ppidno =getView().findViewById(R.id.ppidnoo);
        loginn = getView().findViewById(R.id.btn_login);
        clname=getView().findViewById(R.id.clientname);
        clstatus=getView().findViewById(R.id.clientstatus);
        clage=getView().findViewById(R.id.clientage);
        clemail=getView().findViewById(R.id.clientemail);
        clresidence=getView().findViewById(R.id.clientresidence);
        clidno=getView().findViewById(R.id.clientidno);

        //firebase databse reference
        reff= FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("clientinfo");


        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                insertinfo();

                Intent intent = new Intent(getActivity().getBaseContext(), chat.class);
                startActivity(intent);

            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_repoter, container, false);
    }

    private void insertinfo(){
        String pname=ppname.getText().toString();
        String pstatus=ppstatuse.getText().toString();
        String page=ppage.getText().toString();
        String pemail=ppemail.getText().toString();
        String presidence=ppresidence.getText().toString();
        String pidno=ppidno.getText().toString();


        //constructor with required fields
        perpetratorinfo perpetratorinfo = new perpetratorinfo(pname,pstatus,page,pemail,presidence,pidno);

        //generates a new id with every insertion in db
        reff.push().setValue(perpetratorinfo);
        //Toast.makeText(repoter.this,"data inserted",Toast.LENGTH_SHORT).show();
    }

}