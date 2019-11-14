package com.business.sancash;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SignUpActivity extends AppCompatActivity {

    Button mSignup;
    TextView editDate;
    DatePickerDialog.OnDateSetListener datePickerDialog;
    private ProgressBar progressBar;
    private EditText mFirstName, mLsstName, mBank, mAdress, mBirth, mPhoneNumber, mEmail, mPass;
    //    backend
    private FirebaseAuth auth;
    StorageReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        auth = FirebaseAuth.getInstance();
        reference = FirebaseStorage.getInstance().getReference();
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mFirstName = findViewById(R.id.first_name);
        mLsstName = findViewById(R.id.last_name);
        mBank = findViewById(R.id.bank);
        mAdress = findViewById(R.id.adress);
        mBirth = findViewById(R.id.email);
        mPhoneNumber = findViewById(R.id.first_name);
        mEmail = findViewById(R.id.email);
        mPass = findViewById(R.id.pass);




        mSignup = findViewById(R.id.sign_up);
        mSignup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });

        editDate = findViewById(R.id.birth);
        final Calendar myCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "MM/dd/yyyy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                editDate.setText(sdf.format(myCalendar.getTime()));
            }
        };

        editDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                new DatePickerDialog(SignUpActivity.this, datePickerDialog, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }
}
