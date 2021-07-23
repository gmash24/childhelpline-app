package com.e.healthynutrition;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class caseform extends AppCompatActivity{
    Button loginn;

    @Override
    protected void onCreate ( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caseform);
    }
}
