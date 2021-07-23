package com.e.healthynutrition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class dashboard extends AppCompatActivity {
    //initialize variable n
    MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate ( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        FloatingActionButton fab = findViewById(R.id.fab_btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent(dashboard.this, caseform.class);
                startActivity(intent);


                Toast.makeText(getApplicationContext(), "Opens case entry form",
                        Toast.LENGTH_SHORT).show();

            }
        });

        //Assign variable
        bottomNavigation = findViewById(R.id.bottom_navigation);

        //Add menu item
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_message));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_person));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {

            @Override
            public void onShowItem ( MeowBottomNavigation.Model item ) {
                // initialize fragment
                Fragment fragment = null;
                //check condition
                switch (item.getId()) {
                    case 1:
                        //when id=1
                        //initialize message fragment
                        fragment = new messageFragment();
                        break;
                    case 2:
                        //when id=1
                        //initialize message fragment
                        fragment = new homeFragment();
                        break;

                    case 3:
                        //when id=1
                        //initialize message fragment
                        fragment = new PersonFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });

        // set notification count
        bottomNavigation.setCount(1,"10");

        // set home fragment inititially selected
        bottomNavigation.show(2,true);

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem ( MeowBottomNavigation.Model item ) {
                Toast.makeText(getApplicationContext(),
                        "You clicked"+item.getId(),
                        Toast.LENGTH_SHORT).show();
            }
        });





    }

            private void loadFragment ( Fragment fragment ) {
                //Replace fragment
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout,fragment)
                        .commit();
            }
            }


