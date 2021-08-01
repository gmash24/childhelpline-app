package com.e.healthynutrition;

import android.os.Bundle;
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

public class dataentry extends AppCompatActivity {
    Button loginn;
    EditText ppname,ppstatuse,ppage,ppemail,ppresidence,clgender,cltribe,ppidno;
    DatabaseReference reff;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    client frag1;
    repoter frag2;
    abuser frag3;

    @Override
    protected void onCreate ( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dataentry);
        loginn=findViewById(R.id.btn_login);
        ppname = findViewById(R.id.ppnamee);
        ppstatuse = findViewById(R.id.ppstatuss);
        ppage = findViewById(R.id.ppagee);
        ppemail = findViewById(R.id.ppemaill);
        ppresidence = findViewById(R.id.ppresidencee);
        ppidno = findViewById(R.id.ppidnoo);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);


        //connecting tablayout with viewpager
        tabLayout.setupWithViewPager(viewPager);

        vpadapter vpadapter=new vpadapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpadapter.addfragment(new abuser(),"Abuser form");
        vpadapter.addfragment(new client(),"Client form");
        vpadapter.addfragment(new repoter(),"Reporter's form");
        //seting the adapter to the viewpager
        viewPager.setAdapter(vpadapter);

        //firebase databse reference
        reff = FirebaseDatabase.getInstance("https://childhelpline-5e6f0-default-rtdb.firebaseio.com/").getReference().child("reporter's info");
/*
        if(frag1 != null) {
            String text = frag1.getData();
        }
        if(frag2 != null) {
            String text = frag2.getData();
        }
        if(frag3 != null) {
            String text = frag3.getData();
        }*/
    }
    //method to insert in db
    private void insertinfo() {
        String pname = ppname.getText().toString();
        String page = ppage.getText().toString();
        String presidence = ppresidence.getText().toString();
        String pidno = ppidno.getText().toString();
        String pemail = ppemail.getText().toString();
        String pstatus = ppstatuse.getText().toString();



        //constructor with required fields
        reporterinfo reporterinfo = new reporterinfo(pname,page,presidence, pidno,pemail,pstatus);

        //generates a new id with every insertion in db
        reff.push().setValue(reporterinfo);
        Toast.makeText(dataentry.this, "data inserted", Toast.LENGTH_SHORT).show();

    }
}
