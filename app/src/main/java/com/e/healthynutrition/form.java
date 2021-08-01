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
        clientage = findViewById(R.id.  clientage);
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

        String aname = abusername.getText().toString();
        String apage = abuserage.getText().toString();
        String aresidence = abuserresidence.getText().toString();
        String aidno = abuseridno.getText().toString();
        String aemail = abuseremail.getText().toString();
        String astatus = abuserstatus.getText().toString();

        //reporter values
        String rname =  reportername.getText().toString();
        String rage = reporterage.getText().toString();
        String rresidence = reporterresidence.getText().toString();
        String ridno = reporteridno.getText().toString();
        String remail = reporteremail.getText().toString();
        String rstatus = reporterstatus.getText().toString();

        String cname = clientname.getText().toString();
        String cage =  clientage .getText().toString();
        String cresidence = clientresidence.getText().toString();
        String cidno = clientidno.getText().toString();
        String cemail =  clientemail.getText().toString();
        String cstatus = clientstatus .getText().toString();


    }




    }