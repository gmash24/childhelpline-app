package com.e.healthynutrition;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class form extends AppCompatActivity {

    Button submit;
    EditText clientname,clientstatus,clientage,clientemail,clientresidence,clientgender,clienttribe,clientidno;
    EditText abusername,abuserstatus,abuserage,abuseremail,abuserresidence,abusergender,abusertribe,abuseridno;
    EditText reportername,reporterstatus,reporterage,reporteremail,reporterresidence,repotergender,repotertribe,reporteridno;
    DatabaseReference reff;



    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //client variables
        submit=findViewById(R.id.btn_login);
        clientname = findViewById(R.id. clientnamee);
        clientstatus = findViewById(R.id.clientstatuss);
        clientage = findViewById(R.id.clientagee);
        clientemail = findViewById(R.id.  clientemaill);
        clientresidence = findViewById(R.id.clientresidencee);
        clientidno = findViewById(R.id.clientidnoo);

        //repoter variables

        reportername = findViewById(R.id. reporternamee);
        reporterstatus = findViewById(R.id.reporterstatuss);
        reporterage = findViewById(R.id.reportertagee);
        reporteremail = findViewById(R.id.  reporteremaill);
        reporterresidence = findViewById(R.id.reporterresidencee);
        reporteridno = findViewById(R.id.reporteridnoo);

        //abuser variables


        abusername = findViewById(R.id. abusernamee );
        abuserstatus = findViewById(R.id.abuserstatuss);
        abuserage = findViewById(R.id. abuseragee);
        abuseremail = findViewById(R.id.  abuseremaill);
        abuserresidence = findViewById(R.id. abuserresidencee);
        abuseridno = findViewById(R.id. abuseridnoo);

        //firebase databse reference
        reff = FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("cases info");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                insertinfo();

                Intent intent = new Intent(form.this, chat.class);
                startActivity(intent);
            }
        });



    }
    //method to insert in db
    private void insertinfo() {

        String abuser_name = abusername.getText().toString();
        String abuser_page = abuserage.getText().toString();
        String abuser_residence = abuserresidence.getText().toString();
        String abuser_idno = abuseridno.getText().toString();
        String abuser_email = abuseremail.getText().toString();
        String abuser_status = abuserstatus.getText().toString();

        //reporter values
        String reporter_name =  reportername.getText().toString();
        String reporter_age = reporterage.getText().toString();
        String reporter_residence = reporterresidence.getText().toString();
        String reporter_idno = reporteridno.getText().toString();
        String reporter_email = reporteremail.getText().toString();
        String reporter_status = reporterstatus.getText().toString();

        String cname = clientname.getText().toString();
        String cage =  clientage .getText().toString();
        String cresidence = clientresidence.getText().toString();
        String cidno = clientidno.getText().toString();
        String cemail =  clientemail.getText().toString();
        String cstatus = clientstatus .getText().toString();

        //constructor with required fields
        forminfo forminfo = new forminfo(
                cname,cage,cresidence,cidno,cemail,cstatus,
                reporter_name,reporter_age,reporter_residence,reporter_idno,reporter_email,reporter_status,
                abuser_name,abuser_page,abuser_residence,abuser_idno,abuser_email,abuser_status);

        //generates a new id with every insertion in db
        reff.push().setValue(forminfo);
        Toast.makeText(form.this,"data inserted",Toast.LENGTH_SHORT).show();


    }




    }