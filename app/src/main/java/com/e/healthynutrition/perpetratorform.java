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

public class perpetratorform extends AppCompatActivity {
    Button loginn;
    EditText ppname,ppstatuse,ppage,ppemail,ppresidence,clgender,cltribe,ppidno;
    DatabaseReference reff;
    @Override
    protected void onCreate ( @Nullable Bundle savedInstanceState )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perpetraterform);
        loginn = findViewById(R.id.btn_login);

        //finding the variables in layout

        ppname = findViewById(R.id.ppnamee);
        ppstatuse = findViewById(R.id.ppstatuss);
        ppage = findViewById(R.id.ppagee);
        ppemail = findViewById(R.id.ppemaill);
       ppresidence = findViewById(R.id.ppresidencee);
        ppidno = findViewById(R.id.ppidnoo);

        //firebase databse reference
        reff = FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("perpetratorinfo");


        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                insertinfo();

                Intent intent = new Intent(perpetratorform.this, chat.class);
                startActivity(intent);

            }
        });
    }
        //method to insert in db
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
            Toast.makeText(perpetratorform.this,"data inserted",Toast.LENGTH_SHORT).show();
        }
    }
