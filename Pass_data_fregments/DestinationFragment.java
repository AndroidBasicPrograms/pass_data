package com.example.jayhind.lecture_app.Pass_data_fregments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jayhind.lecture_app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestinationFragment extends Fragment implements  ref{
    TextView t;
    EditText et;
    Context context;

    public DestinationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_destination, container, false);
        t=view.findViewById(R.id.text1);
        et=view.findViewById(R.id.et1);
        context=getActivity();
        //retrive data
        Bundle b=getArguments();
        String s=b.getString(S);
        t.setText(s);


        Intent i=new Intent(context,fragToActiActivity.class);
        i.putExtra(S,s);
        startActivity(i);
        return view;

    }

}
