package com.e.healthynutrition;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.volley.Request;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class agentscaselist extends AppCompatActivity {
    ListView userlist;
    TextView noUsersText;
    ArrayList<String> al=new ArrayList<>();
    int totalUsers =0;
    ProgressDialog pd;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agentscaselist);
        userlist=findViewById(R.id.usersList);
        noUsersText=findViewById(R.id.noUsersText);

        pd = new ProgressDialog(agentscaselist.this);
        pd.setMessage("Loading...");
        pd.show();

        String url="https://childhelpline-5e6f0-default-rtdb.firebaseio.com/Agent.json";
        // Request a string response from the provided URL.
        StringRequest request= new StringRequest
                (Request.Method.GET,url,new Response.Listener<String>() {
        @Override
        public void onResponse(String s) {
            doOnSuccess(s);
        }
                },new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        System.out.println("" + volleyError);
                    }
                });
        // Instantiate the RequestQueue.
        RequestQueue rQueue = Volley.newRequestQueue(agentscaselist.this);
        rQueue.add(request);

        userlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick( AdapterView<?> parent, View view, int position, long id) {
                chat.UserDetails.chatWith = al.get(position);
                startActivity(new Intent(agentscaselist.this, chat.class));
            }
        });
    }
    public void doOnSuccess(String s){
        try {
            JSONObject obj = new JSONObject(s);

            Iterator i = obj.keys();
            String key = "";

            while(i.hasNext()){
                key = i.next().toString();

                if(!key.equals(chat.UserDetails.username)) {
                    al.add(key);
                }

                totalUsers++;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(totalUsers <=1){
            noUsersText.setVisibility(View.VISIBLE);
            userlist.setVisibility(View.GONE);
        }
        else{
            noUsersText.setVisibility(View.GONE);
            userlist.setVisibility(View.VISIBLE);
            userlist.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al));
        }

        pd.dismiss();
    }
}