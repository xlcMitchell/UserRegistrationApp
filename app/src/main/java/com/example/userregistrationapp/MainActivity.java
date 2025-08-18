package com.example.userregistrationapp;
import android.icu.util.GregorianCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.userregistrationapp.Data.User;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private EditText firstNameET, lastNameET, mobileET, addressET, emailET, password1ET, password2ET;
    private DatePicker dateOfBirthDP;
    private Button regButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // ...
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameET = findViewById(R.id.regFirstName);
        lastNameET = findViewById(R.id.regLastName);
        mobileET = findViewById(R.id.regMobile);
        addressET = findViewById(R.id.regAddress);
        emailET = findViewById(R.id.regEmail);
        password1ET = findViewById(R.id.regPW);
        password2ET = findViewById(R.id.regPW2);
        dateOfBirthDP = findViewById(R.id.RegUserDate);
        regButton = findViewById(R.id.userRegButton);
        resetButton = findViewById(R.id.userResetButton);
        //---- Reset Button On Click Listener----
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetUserData();
            }
        });

        //---- Register Button On Click Listener----
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }


    // --- FUNCTION TO COLLECT USER DATA ---
    private User getUserData() {
        User user = null;
        String fName, lName, mobile, address, email, password1, password2;

        fName = firstNameET.getText().toString();
        lName = lastNameET.getText().toString();
        mobile = mobileET.getText().toString();
        address = addressET.getText().toString();
        email = emailET.getText().toString();
        password1 = password1ET.getText().toString();
        password2 = password2ET.getText().toString();

        Calendar calendar = Calendar.getInstance();
        calendar.set(dateOfBirthDP.getYear(), dateOfBirthDP.getMonth(), dateOfBirthDP.getDayOfMonth());
        Date dob = calendar.getTime();

        if (!fName.isEmpty() && !lName.isEmpty() && !email.isEmpty() &&
                !password1.isEmpty() && !password2.isEmpty() && password1.equals(password2)) {
            user = new User(fName, lName, mobile, address, email, password1, dob);
        }

        return user;
    }

    private void registerUser(){
        User user = getUserData();

        if(user == null){
            Toast.makeText(this,"User data validation failed",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,user.toString(),Toast.LENGTH_LONG).show();
        }
    }

    private void resetUserData(){
        firstNameET.setText("");
        lastNameET.setText("");
        mobileET.setText("");
        addressET.setText("");
        emailET.setText("");
        password1ET.setText("");
        password2ET.setText("");
        firstNameET.requestFocus();
    }
}