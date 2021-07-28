package com.e.healthynutrition;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AgentProfile extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_profile);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on

    }
}