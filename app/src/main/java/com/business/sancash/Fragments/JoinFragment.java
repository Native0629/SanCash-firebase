package com.business.sancash.Fragments;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.business.sancash.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class JoinFragment extends Fragment {


    View view;
    Button mCreateSan;
    LinearLayout mLavel1, mLavel2, mLavel3, mLavel4, mLavel11, mLavel22, mLavel33, mLavel44, mChooseNumber;
    TextView mNumber;
    private static final String[] paths = {"item 1", "item 2", "item 3"};
    public JoinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_join, container, false);
        mCreateSan = view.findViewById(R.id.create_san);

        mLavel1 = view.findViewById(R.id.lavel1);
        mLavel2 = view.findViewById(R.id.lavel2);
        mLavel3 = view.findViewById(R.id.lavel3);
        mLavel4 = view.findViewById(R.id.lavel4);

        mLavel11 = view.findViewById(R.id.lavel11);
        mLavel22 = view.findViewById(R.id.lavel22);
        mLavel33 = view.findViewById(R.id.lavel33);
        mLavel44 = view.findViewById(R.id.lavel44);
        mChooseNumber = view.findViewById(R.id.choose_number);
        mNumber = view.findViewById(R.id.number);
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

        mChooseNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert_open();
            }
        });

        mCreateSan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container, new JoinDetailFragment());
                transaction.commit();
            }
        });

        mLavel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel1.setBackgroundResource(R.drawable.zone_back1);
                mLavel11.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel22.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel33.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel44.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });
        mLavel11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel1.setBackgroundResource(R.drawable.zone_back1);
                mLavel11.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel22.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel33.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel44.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });

        mLavel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel2.setBackgroundResource(R.drawable.zone_back1);
                mLavel22.setBackgroundResource(R.drawable.zone_back1);
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel11.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel33.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel44.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });

        mLavel22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel2.setBackgroundResource(R.drawable.zone_back1);
                mLavel22.setBackgroundResource(R.drawable.zone_back1);
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel11.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel33.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel44.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });

        mLavel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel3.setBackgroundResource(R.drawable.zone_back1);
                mLavel33.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel22.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel11.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel44.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });

        mLavel33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel3.setBackgroundResource(R.drawable.zone_back1);
                mLavel33.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel4.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel22.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel11.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel44.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });

        mLavel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel4.setBackgroundResource(R.drawable.zone_back1);
                mLavel44.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel22.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel33.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel11.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });
        mLavel44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLavel4.setBackgroundResource(R.drawable.zone_back1);
                mLavel44.setBackgroundResource(R.drawable.zone_back1);
                mLavel2.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel3.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel1.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel22.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel33.setBackgroundColor(Color.parseColor("#00000000"));
                mLavel11.setBackgroundColor(Color.parseColor("#00000000"));
            }
        });
    }

    public void alert_open(){
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.alert_choose_number);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.gravity = Gravity.CENTER;
        window.setAttributes(wlp);

        TextView num1 = dialog.findViewById(R.id.num1);
        num1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("1");
            }
        });
        TextView num2 = dialog.findViewById(R.id.num2);
        num2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("2");
            }
        });
        TextView num3 = dialog.findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("3");
            }
        });
        TextView num4 = dialog.findViewById(R.id.num4);
        num4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("4");
            }
        });
        TextView num5 = dialog.findViewById(R.id.num5);
        num5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("5");
            }
        });
        TextView num6 = dialog.findViewById(R.id.num6);
        num6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("6");
            }
        });
        TextView num7 = dialog.findViewById(R.id.num7);
        num7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("7");
            }
        });
        TextView num8 = dialog.findViewById(R.id.num8);
        num8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("8");
            }
        });
        TextView num9 = dialog.findViewById(R.id.num9);
        num9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("9");
            }
        });
        TextView num10 = dialog.findViewById(R.id.num10);
        num10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
                mNumber.setText("10");
            }
        });


        dialog.show();

        Rect displayRectangle = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(displayRectangle);
        dialog.getWindow().setLayout((int) (displayRectangle.width() *0.7f), dialog.getWindow().getAttributes().height);
    }

}
