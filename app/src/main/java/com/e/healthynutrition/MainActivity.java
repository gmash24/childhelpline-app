package com.e.healthynutrition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button loginn;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginn= findViewById(R.id.btn_login);


        loginn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick ( View v )
            {
                Intent intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);

            }
        });

    }
}


