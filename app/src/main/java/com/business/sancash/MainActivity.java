package com.business.sancash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mGroup, mJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGroup = findViewById(R.id.create_group);
        mGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("message", "1");
                startActivity(intent);
                finish();
            }
        });

        mJoin = findViewById(R.id.join_group);
        mJoin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("message", "2");
                startActivity(intent);
                finish();
            }
        });

    }
}
