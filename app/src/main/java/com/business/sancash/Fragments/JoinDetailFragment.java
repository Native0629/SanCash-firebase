package com.business.sancash.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.business.sancash.R;

import java.util.ArrayList;
import java.util.List;

public class JoinDetailFragment extends Fragment {
    View view;
    ImageView mShare;
    public JoinDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_join_detail, container, false);
        mShare = view.findViewById(R.id.share);

        initUI();

        return view;
    }

    void initUI() {

        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        List<String> categories = new ArrayList<String>();
        categories.add("Private");
        categories.add("Public");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.spin_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        int i=categories.indexOf("Education");
        spinner.setSelection(i);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#0095fb"));
                ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#0095fb"));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert_share();
            }
        });
    }

    public void alert_share(){
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Your body here";
        String shareSub = "Your Subject here";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareSub);
        startActivity(Intent.createChooser(myIntent, "Select the socials"));
    }
}
