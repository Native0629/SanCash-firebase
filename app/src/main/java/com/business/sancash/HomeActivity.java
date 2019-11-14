package com.business.sancash;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.business.sancash.Fragments.ChatFragment;
import com.business.sancash.Fragments.HomeFragment;
import com.business.sancash.Fragments.JoinFragment;
import com.business.sancash.Fragments.ProfileFragment;
import com.business.sancash.Fragments.SearchFragment;

public class HomeActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    FrameLayout frameLayout;
    LinearLayout ly_tab;
    LinearLayout tab1, tab2, tab3, tab4, tab5;

    ImageView img_home, img_join, img_search, img_chat, img_profile;
    ImageView img_home1, img_join1, img_search1, img_chat1, img_profile1;

    public int index_before = 0, index_cur = 0;
    private long backPressedTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        frameLayout = (FrameLayout)findViewById(R.id.frame_container);
        ly_tab = (LinearLayout)findViewById(R.id.ly_tab);

        tab1= (LinearLayout) findViewById(R.id.tab_home);
        tab2 = (LinearLayout) findViewById(R.id.tab_save);
        tab3= (LinearLayout) findViewById(R.id.tab_trip);
        tab4= (LinearLayout) findViewById(R.id.tab_message);
        tab5= (LinearLayout) findViewById(R.id.tab_profile);

        img_home1 = findViewById(R.id.img_home1);
        img_join1 = findViewById(R.id.img_saved1);
        img_search1 = findViewById(R.id.img_trip1);
        img_chat1 = findViewById(R.id.img_message1);
        img_profile1 = findViewById(R.id.img_profile1);

        img_home = findViewById(R.id.img_home);
        img_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh_activity(0);
            }
        });
        img_join = findViewById(R.id.img_saved);
        img_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh_activity(1);
            }
        });
        img_search = findViewById(R.id.img_trip);
        img_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh_activity(2);
            }
        });
        img_chat = findViewById(R.id.img_message);
        img_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh_activity(3);
            }
        });
        img_profile = findViewById(R.id.img_profile);
        img_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh_activity(4);
            }
        });

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        if (message.equals("1")){
            refresh_activity(1);
        }else if (message.equals("2")){
            refresh_activity(2);
        }else{
            refresh_activity(0);
        }

    }


    public void refresh_activity(int index) {
        index_cur = index;
        index_before = index_cur;

        img_home1.setVisibility(View.GONE);
        img_join1.setVisibility(View.GONE);
        img_search1.setVisibility(View.GONE);
        img_chat1.setVisibility(View.GONE);
        img_profile1.setVisibility(View.GONE);

        img_home.setVisibility(View.VISIBLE);
        img_join.setVisibility(View.VISIBLE);
        img_search.setVisibility(View.VISIBLE);
        img_chat.setVisibility(View.VISIBLE);
        img_profile.setVisibility(View.VISIBLE);

        switch (index) {
            case 0:
                selectFragment(new HomeFragment());
                img_home.setVisibility(View.GONE);
                img_home1.setVisibility(View.VISIBLE);

                break;
            case 1:
                selectFragment(new JoinFragment());
                img_join.setVisibility(View.GONE);
                img_join1.setVisibility(View.VISIBLE);
                break;
            case 2:
                selectFragment(new SearchFragment());
                img_search.setVisibility(View.GONE);
                img_search1.setVisibility(View.VISIBLE);
                break;
            case 3:
                selectFragment(new ChatFragment());
                img_chat.setVisibility(View.GONE);
                img_chat1.setVisibility(View.VISIBLE);
                break;
            case 4:
                selectFragment(new ProfileFragment());
                img_profile.setVisibility(View.GONE);
                img_profile1.setVisibility(View.VISIBLE);
                break;
            default: break;
        }
    }

    private void selectFragment(Fragment fragment) {

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        long t = System.currentTimeMillis();

        if (t - backPressedTime > 2000) {
            backPressedTime = t;
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Are you really finish this app?");
            alertDialogBuilder.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        } else {
            // clean up
            super.onBackPressed();
        }
    }
}
