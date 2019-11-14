package com.business.sancash.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.business.sancash.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    View view;
    LinearLayout mLavel1, mLavel2, mLavel3, mLavel4;
    LinearLayout mRoomLavel1, mRoomLavel2, mRoomLavel3, mRoomLavel4;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);

        mLavel1 = view.findViewById(R.id.lavel1);
        mLavel2 = view.findViewById(R.id.lavel2);
        mLavel3 = view.findViewById(R.id.lavel3);
        mLavel4 = view.findViewById(R.id.lavel4);

        mRoomLavel1 = view.findViewById(R.id.room_lavel1);
        mRoomLavel2 = view.findViewById(R.id.room_lavel2);
        mRoomLavel3 = view.findViewById(R.id.room_lavel3);
        mRoomLavel4 = view.findViewById(R.id.room_lavel4);

        initUI();

        return view;
    }

    void initUI() {
        mLavel1.setBackgroundResource(R.drawable.zone_back1);
        mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
        mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
        mLavel4.setBackgroundColor(Color.parseColor("#00000000"));

        mRoomLavel1.setVisibility(View.VISIBLE);
        mRoomLavel2.setVisibility(View.GONE);
        mRoomLavel3.setVisibility(View.GONE);
        mRoomLavel4.setVisibility(View.GONE);

        mLavel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel1.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));

                mRoomLavel1.setVisibility(View.VISIBLE);
                mRoomLavel2.setVisibility(View.GONE);
                mRoomLavel3.setVisibility(View.GONE);
                mRoomLavel4.setVisibility(View.GONE);
            }
        });


        mLavel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel2.setBackgroundResource(R.drawable.zone_back1);
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mRoomLavel2.setVisibility(View.VISIBLE);
                mRoomLavel1.setVisibility(View.GONE);
                mRoomLavel3.setVisibility(View.GONE);
                mRoomLavel4.setVisibility(View.GONE);
            }
        });

        mLavel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel3.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mRoomLavel3.setVisibility(View.VISIBLE);
                mRoomLavel1.setVisibility(View.GONE);
                mRoomLavel2.setVisibility(View.GONE);
                mRoomLavel4.setVisibility(View.GONE);
            }
        });

        mLavel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel4.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mRoomLavel4.setVisibility(View.VISIBLE);
                mRoomLavel1.setVisibility(View.GONE);
                mRoomLavel2.setVisibility(View.GONE);
                mRoomLavel3.setVisibility(View.GONE);

            }
        });
    }

}
