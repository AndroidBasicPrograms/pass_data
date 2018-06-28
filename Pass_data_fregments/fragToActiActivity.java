package com.example.jayhind.lecture_app.Pass_data_fregments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jayhind.lecture_app.R;

public class fragToActiActivity extends AppCompatActivity implements ref {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_to_acti);
        t=findViewById(R.id.t11);
        Intent i=getIntent();
        String s=i.getStringExtra(S);
        t.setText(s);

    }
}
