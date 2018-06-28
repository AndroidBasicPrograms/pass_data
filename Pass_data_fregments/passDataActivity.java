package com.example.jayhind.lecture_app.Pass_data_fregments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jayhind.lecture_app.R;


public class passDataActivity extends AppCompatActivity implements ref {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data);
        Bundle ba=new Bundle();
        String s="you are in destination fragment";
        ba.putString(S,s);
        sourceFragment f=new sourceFragment();
        f.setArguments(ba);
        getSupportFragmentManager().beginTransaction().add(R.id.frm_layout,f).commit();
    }
}
