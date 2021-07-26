package com.e.healthynutrition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button loginn;
    EditText mail,pswd;
    String email,pass;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginn= findViewById(R.id.btn_login);

        mail=findViewById(R.id.et_email);
        pswd=findViewById(R.id.et_password);

        loginn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick ( View v )
            {
                email = mail.getText().toString();
                pass = pswd.getText().toString();

                if(email.equals("")){
                    mail.setError("can't be blank");
                }
                else if(pass.equals("")) {
                    pswd.setError("can't be blank");
                }
                else{

                    final ProgressDialog pd = new ProgressDialog(MainActivity.this);
                    pd.setMessage("Loading...");
                    pd.show();
                Intent intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);}

            }
        });

    }
}


