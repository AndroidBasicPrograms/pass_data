package com.example.jayhind.lecture_app.Pass_data_fregments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jayhind.lecture_app.R;



/**
 * A simple {@link Fragment} subclass.
 */
public class sourceFragment extends Fragment implements ref {

    TextView t;

    public sourceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_source, container, false);

        Bundle b=getArguments();
        String s=b.getString(S);
        //String s=getArguments().getString(S,null);
        b.putString(S,s);
        Fragment f=new DestinationFragment();
        f.setArguments(b);
        getFragmentManager().beginTransaction().replace(R.id.frm_layout,f).commit();

        return view;
    }

}
