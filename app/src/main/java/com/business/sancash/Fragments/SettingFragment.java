package com.business.sancash.Fragments;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.business.sancash.BankActivity;
import com.business.sancash.CreditActivity;
import com.business.sancash.R;

public class SettingFragment extends Fragment {

    View view;
    RelativeLayout mBank, mCredit;
    public SettingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_setting, container, false);
        mBank =  view.findViewById(R.id.bank);
        mCredit = view.findViewById(R.id.credit_card);
        initUI();
        return view;
    }

    void initUI() {
        mBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BankActivity.class);
                getActivity().startActivity(intent);
            }
        });

        mCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreditActivity.class);
                getActivity().startActivity(intent);
            }
        });
    }

}
