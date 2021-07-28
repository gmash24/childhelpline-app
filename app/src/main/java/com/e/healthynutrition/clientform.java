package com.e.healthynutrition;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class clientform extends AppCompatActivity {
    Button loginn;
    EditText clname,clstatus,clage,clemail,clresidence,clgender,cltribe,clidno;
    DatabaseReference reff;
    @Override
    protected void onCreate ( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientform);

        //finding the variables in layout
        loginn=findViewById(R.id.btn_login);
        clname=findViewById(R.id.clientname);
        clstatus=findViewById(R.id.clientstatus);
        clage=findViewById(R.id.clientage);
        clemail=findViewById(R.id.clientemail);
        clresidence=findViewById(R.id.clientresidence);
        clidno=findViewById(R.id.clientidno);

        //firebase databse reference
        reff= FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("clientinfo");

        //on clicking the submit info btn button
        loginn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick ( View v )
            {
                insertclientinfo();

                //goes to next form
                Intent intent = new Intent(clientform.this, perpetratorform.class);
                startActivity(intent);

            }
        });

    }
    //method to insert in db
    private void insertclientinfo(){

        String clientname=clname.getText().toString();
        String clientstatus=clstatus.getText().toString();
        String clientage=clage.getText().toString();
        String clientemail=clemail.getText().toString();
        String clientresidence=clresidence.getText().toString();
        String clientidno=clidno.getText().toString();

        //constructor with required fields
        clientinfo clientinfo = new clientinfo(clientname,clientstatus,clientage,clientemail,clientresidence,clientstatus,clientidno);

        //generates a new id with every insertion in db
        reff.push().setValue(clientinfo);
        Toast.makeText(clientform.this,"data inserted",Toast.LENGTH_SHORT).show();
    }
}