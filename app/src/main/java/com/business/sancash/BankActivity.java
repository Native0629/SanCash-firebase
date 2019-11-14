package com.business.sancash;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BankActivity extends AppCompatActivity {

    ImageView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        mBack = findViewById(R.id.back);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        List<String> categories = new ArrayList<String>();
        categories.add("Choose1");
        categories.add("Choose2");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(BankActivity.this, R.layout.spin_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        int i=categories.indexOf("Education");
        spinner.setSelection(i);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#1f1f1f"));
                ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#1f1f1f"));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
