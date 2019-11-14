package com.business.sancash.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.business.sancash.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {

    View view;
    ImageView mShowUp;
    ScrollView mScrollView;
    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_chat, container, false);

        mShowUp = view.findViewById(R.id.show_up);
        mScrollView = view.findViewById(R.id.scroll_view);
        initUI();
        return view;
    }

    void initUI() {
        mShowUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mScrollView.setScrollY(0);
            }
        });
    }

}
